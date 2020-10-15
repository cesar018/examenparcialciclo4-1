package pe.edu.upeu.spring01.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring01.dao.DetallePedidoDao;
import pe.edu.upeu.spring01.service.DetallePedidoService;
@Service
public class DetallePedidoServiceImp implements DetallePedidoService{
	@Autowired
    private DetallePedidoDao detallePedidoDao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detallePedidoDao.readAll();
	}
	
}
