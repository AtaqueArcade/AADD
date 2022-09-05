package add.persistencia.dao;

import aadd.persistencia.bean.Equipo;

public class EquipoDAO extends ExtensionDAO<Equipo> {
	public EquipoDAO(Class<Equipo> persistedClass) {
		super(persistedClass);
	}

	private static EquipoDAO equipoDAO;

	public final static EquipoDAO getEquipoDAO() {
		if (equipoDAO == null)
			equipoDAO = new EquipoDAO(Equipo.class);
		return equipoDAO;
	}
}
