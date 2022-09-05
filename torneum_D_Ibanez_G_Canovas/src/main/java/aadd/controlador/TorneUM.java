package aadd.controlador;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import aadd.persistencia.bean.Direccion;
import aadd.persistencia.bean.EntityManagerHelper;
import aadd.persistencia.bean.Equipo;
import aadd.persistencia.bean.EstadoEquipo;
import aadd.persistencia.bean.Plaza;
import aadd.persistencia.bean.TipoPlaza;
import aadd.persistencia.bean.Torneo;
import aadd.persistencia.bean.Usuario;
import aadd.persistencia.dto.EquipoTorneoDTO;
import aadd.persistencia.dto.TorneoDTO;
import add.persistencia.dao.EquipoDAO;
import add.persistencia.dao.TorneoDAO;
import add.persistencia.dao.UsuarioDAO;

public class TorneUM {
	protected static TorneUM controlador;

	public static TorneUM getTorneUM() {
		if (controlador == null)
			controlador = new TorneUM();
		return controlador;
	}

	public TorneoDTO createTorneo(TorneoDTO torneo) {
		EntityManager em = EntityManagerHelper.getEntityManager();
		try {
			em.getTransaction().begin();
			Torneo t = new Torneo();
			t.setNombre(torneo.getNombre());
			Direccion d = new Direccion();
			d.setCalle(torneo.getCalle());
			d.setCiudad(torneo.getCiudad());
			d.setCodigoPostal(torneo.getCodigoPostal());
			d.setNumero(torneo.getNumero());
			t.setDireccion(d);
			t.setNumJugadoresEquipo(torneo.getNumJugadores());
			t.setTipo(torneo.getTipo());
			TorneoDAO.getTorneoDAO().save(t, em);
			em.flush();
			torneo.setIdTorneo(t.getId());
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			EntityManagerHelper.getEntityManager().close();
		}
		return torneo;
	}

	public EquipoTorneoDTO createEquipo(Integer idTorneo, Integer usuarioId, String nombreEquipo) {
		EntityManager em = EntityManagerHelper.getEntityManager();
		EquipoTorneoDTO etDTO = null;
		try {
			em.getTransaction().begin();
			Equipo e = new Equipo();
			e.setNombre(nombreEquipo);
			Torneo torneo = TorneoDAO.getTorneoDAO().findById(idTorneo);
			e.setTorneo(torneo);
			e.setNumJugadores(torneo.getNumJugadoresEquipo());
			if (torneo.getNumJugadoresEquipo() == 1) {
				e.setEstado(EstadoEquipo.ACEPTADO);
			} else {
				e.setEstado(EstadoEquipo.PENDIENTE);
			}
			Plaza p = new Plaza();
			Usuario jugador = UsuarioDAO.getUsuarioDAO().findById(usuarioId);
			p.setJugador(jugador);
			p.setTipo(TipoPlaza.TITULAR);
			p.setEquipo(e);
			List<Plaza> plazas = new ArrayList<>();
			plazas.add(p);
			e.setPlaza(plazas);
			EquipoDAO.getEquipoDAO().save(e, em);
			em.getTransaction().commit();
			etDTO = new EquipoTorneoDTO(e, plazas);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			EntityManagerHelper.getEntityManager().close();
		}
		return etDTO;
	}
}
