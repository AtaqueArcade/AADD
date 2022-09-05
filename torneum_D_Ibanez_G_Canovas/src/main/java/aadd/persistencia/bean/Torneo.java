package aadd.persistencia.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Torneo
 *
 */
@Entity
@Table(name = "torneo")
public class Torneo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Embedded
	private Direccion direccion;
	@Column(name = "num_jugadores_equipo")
	private Integer numJugadoresEquipo;
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo")
	private TipoTorneo tipo;
	private static final long serialVersionUID = 1L;

	public Torneo() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Integer getNumJugadoresEquipo() {
		return numJugadoresEquipo;
	}

	public void setNumJugadoresEquipo(Integer numJugadoresEquipo) {
		this.numJugadoresEquipo = numJugadoresEquipo;
	}

	public TipoTorneo getTipo() {
		return tipo;
	}

	public void setTipo(TipoTorneo tipo) {
		this.tipo = tipo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
