package add.persistencia.dao;

import java.util.List;
import javax.persistence.EntityManager;
import aadd.persistencia.bean.EntityManagerHelper;

public abstract class ExtensionDAO<T> implements DAO<T> {
	protected Class<T> persistedClass;

	public ExtensionDAO(Class<T> persistedClass) {
		this.persistedClass = persistedClass;
	}

	@Override
	public T findById(Integer id) {
		return EntityManagerHelper.getEntityManager().find(persistedClass, id);
	}

	@Override
	public void save(T t, EntityManager em) {
		em.persist(t);
	}

	@Override
	public void update(T t, String[] params, EntityManager em) {
		// TODOAuto-generated method stub
	}

	@Override
	public void delete(T t, EntityManager em) {
		// TODOAuto-generated method stub
	}

	@Override
	public List<T> getAll() {// TODOAuto-generated method stub
		return null;
	}
}