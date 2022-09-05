package add.persistencia.dao;

import aadd.persistencia.bean.Usuario;

public class UsuarioDAO extends ExtensionDAO<Usuario> {
	public UsuarioDAO(Class<Usuario> persistedClass) {
		super(persistedClass);
	}

	private static UsuarioDAO usuarioDAO;

	public static UsuarioDAO getUsuarioDAO() {
		if (usuarioDAO == null)
			usuarioDAO = new UsuarioDAO(Usuario.class);
		return usuarioDAO;
	}
}