package aadd.persistencia.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Plaza
 *
 */
@Entity

public class Plaza implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo")
	protected TipoPlaza tipo;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="equipo")
	private Equipo equipo;
	
	@ManyToOne
	@JoinColumn(name="jugador")
	private Usuario jugador;
	
	public Plaza() {
		super();
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public Usuario getJugador() {
		return jugador;
	}

	public void setJugador(Usuario jugador) {
		this.jugador = jugador;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoPlaza getTipo() {
		return tipo;
	}

	public void setTipo(TipoPlaza tipo) {
		this.tipo = tipo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
