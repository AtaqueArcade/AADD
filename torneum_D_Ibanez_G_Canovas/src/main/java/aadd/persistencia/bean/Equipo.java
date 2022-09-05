package aadd.persistencia.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Equipo
 *
 */
@Entity

public class Equipo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "num_jugadores")
	private Integer numJugadores;
	@Column(name = "estado")
	@Enumerated(EnumType.STRING)
	private EstadoEquipo estado;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "torneo")
	private Torneo torneo;

	@OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
	private List<Plaza> plaza;

	public Equipo() {
		super();
	}

	public List<Plaza> getPlaza() {
		return plaza;
	}

	public void setPlaza(List<Plaza> plaza) {
		this.plaza = plaza;
	}

	public Torneo getTorneo() {
		return torneo;
	}

	public void setTorneo(Torneo torneo) {
		this.torneo = torneo;
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

	public Integer getNumJugadores() {
		return numJugadores;
	}

	public void setNumJugadores(Integer numJugadores) {
		this.numJugadores = numJugadores;
	}

	public EstadoEquipo getEstado() {
		return estado;
	}

	public void setEstado(EstadoEquipo estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
