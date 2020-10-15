package pe.edu.upeu.spring01.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.spring01.entity.Pedidos;

public interface PedidosDao {
	public Pedidos read(String fecha);
	 Pedidos read(int id);
	 List<Map<String,Object>> readAll();

}
