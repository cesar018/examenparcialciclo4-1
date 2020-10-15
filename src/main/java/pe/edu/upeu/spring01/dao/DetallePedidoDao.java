package pe.edu.upeu.spring01.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.spring01.entity.DetallePedido;

public interface DetallePedidoDao {
	 DetallePedido read(int id);
	 List<Map<String,Object>> readAll();

}
