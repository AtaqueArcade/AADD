package aadd.persistencia.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import aadd.persistencia.bean.Equipo;
import aadd.persistencia.bean.Plaza;

public class EquipoTorneoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idEquipo;
	private Integer idTorneo;
	private String nombreEquipo;
	private String nombreTorneo;
	private List<JugadorDTO> jugadores;

	public EquipoTorneoDTO(Equipo e, List<Plaza> plazas) {
		this.idEquipo = e.getId();
		this.idTorneo = e.getTorneo().getId();
		this.nombreEquipo = e.getNombre();
		this.nombreTorneo = e.getTorneo().getNombre();
		this.jugadores = new ArrayList<>();
		for (Plaza p : plazas) {
			this.jugadores.add(new JugadorDTO(p));
		}
	}

	public Integer getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(Integer idEquipo) {
		this.idEquipo = idEquipo;
	}

	public Integer getIdTorneo() {
		return idTorneo;
	}

	public void setIdTorneo(Integer idTorneo) {
		this.idTorneo = idTorneo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getNombreTorneo() {
		return nombreTorneo;
	}

	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}

	public List<JugadorDTO> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<JugadorDTO> jugadores) {
		this.jugadores = jugadores;
	}

	public void addJugador(JugadorDTO jugador) {
		if (jugadores == null)
			jugadores = new ArrayList<JugadorDTO>();
		jugadores.add(jugador);
	}
}