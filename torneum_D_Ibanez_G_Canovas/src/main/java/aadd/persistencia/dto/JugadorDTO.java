package aadd.persistencia.dto;

import java.io.Serializable;
import aadd.persistencia.bean.Plaza;

public class JugadorDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombreJugador;
	protected Integer jugadorId;
	protected Integer plazaId;

	public JugadorDTO(Plaza plaza) {
		this.nombreJugador = plaza.getJugador().getNombre() + " " + plaza.getJugador().getApellidos();
		this.jugadorId = plaza.getJugador().getId();
		this.plazaId = plaza.getId();
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public Integer getJugadorId() {
		return jugadorId;
	}

	public void setJugadorId(Integer jugadorId) {
		this.jugadorId = jugadorId;
	}

	public Integer getPlazaId() {
		return plazaId;
	}

	public void setPlazaId(Integer plazaId) {
		this.plazaId = plazaId;
	}
}