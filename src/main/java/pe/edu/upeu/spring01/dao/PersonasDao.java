package pe.edu.upeu.spring01.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.spring01.entity.Personas;


public interface PersonasDao {
	public Personas read(String nombres);
	 Personas read(int id);
	 List<Map<String,Object>> readAll();

}
