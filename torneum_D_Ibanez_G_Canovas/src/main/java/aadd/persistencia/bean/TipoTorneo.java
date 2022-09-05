package aadd.persistencia.bean;

public enum TipoTorneo {
	DEPORTIVO("Deportivo"), JUEGOS("Juegos de mesa"), VIDEOJUEGOS("Videojuegos"), OTROS("Otros");

	private final String toString;

	private TipoTorneo(String toString) {
		this.toString = toString;
	}

	public String toString() {
		return toString;
	}
}