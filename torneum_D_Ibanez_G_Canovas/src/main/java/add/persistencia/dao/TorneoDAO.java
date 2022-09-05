package add.persistencia.dao;

import aadd.persistencia.bean.Torneo;

public class TorneoDAO extends ExtensionDAO<Torneo> {
	public TorneoDAO(Class<Torneo> persistedClass) {
		super(persistedClass);
	}

	private static TorneoDAO torneoDAO;

	public static TorneoDAO getTorneoDAO() {
		if (torneoDAO == null)
			torneoDAO = new TorneoDAO(Torneo.class);
		return torneoDAO;
	}
}