package aadd.persistencia.dto;

import java.io.Serializable;

import aadd.persistencia.bean.TipoTorneo;

public class TorneoDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private Integer idTorneo;
	private Integer numJugadores;
	private TipoTorneo tipo;

	private String calle;
	private Integer codigoPostal;
	private String ciudad;
	private Integer numero;

	public TorneoDTO(String nombre, Integer idTorneo, Integer numJugadores, TipoTorneo tipo) {
		this.nombre = nombre;
		this.idTorneo = idTorneo;
		this.numJugadores = numJugadores;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdTorneo() {
		return idTorneo;
	}

	public void setIdTorneo(Integer idTorneo) {
		this.idTorneo = idTorneo;
	}

	public Integer getNumJugadores() {
		return numJugadores;
	}

	public void setNumJugadores(Integer numJugadores) {
		this.numJugadores = numJugadores;
	}

	public TipoTorneo getTipo() {
		return tipo;
	}

	public void setTipo(TipoTorneo tipo) {
		this.tipo = tipo;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}