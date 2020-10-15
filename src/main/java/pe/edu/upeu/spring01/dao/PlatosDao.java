package pe.edu.upeu.spring01.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.spring01.entity.Platos;

public interface PlatosDao {
 public Platos read(String nombre);
 Platos read(int id);
 List<Map<String,Object>> readAll();
}
