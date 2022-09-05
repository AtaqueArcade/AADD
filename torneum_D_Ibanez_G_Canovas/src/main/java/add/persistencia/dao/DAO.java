package add.persistencia.dao;

import java.util.List;

import javax.persistence.EntityManager;

public interface DAO<T> {

	public T findById(Integer id);

	public List<T> getAll();

	public void save(T t, EntityManager em);

	public void update(T t, String[] params, EntityManager em);

	public void delete(T t, EntityManager em);
}
