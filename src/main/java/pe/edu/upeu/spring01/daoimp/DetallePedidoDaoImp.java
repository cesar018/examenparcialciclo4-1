package pe.edu.upeu.spring01.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.spring01.dao.DetallePedidoDao;
import pe.edu.upeu.spring01.entity.DetallePedido;
@Repository
public class DetallePedidoDaoImp implements DetallePedidoDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public DetallePedido read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String SQL="select = from detalle_pedido";
		return jdbcTemplate.queryForList(SQL);
	}

}
