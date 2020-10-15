package pe.edu.upeu.spring01.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.spring01.entity.Usuario;

public interface UsuarioDao {
	public Usuario read(String nomuser);
    Usuario read(int id);
    List<Map<String,Object>> readAll();

}
