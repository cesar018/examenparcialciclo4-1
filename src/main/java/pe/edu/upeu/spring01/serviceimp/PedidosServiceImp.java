package pe.edu.upeu.spring01.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring01.dao.PedidosDao;
import pe.edu.upeu.spring01.service.PedidosService;
@Service
public class PedidosServiceImp implements PedidosService{
	@Autowired
	private PedidosDao pedidosdao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return pedidosdao.readAll();
	}

}
