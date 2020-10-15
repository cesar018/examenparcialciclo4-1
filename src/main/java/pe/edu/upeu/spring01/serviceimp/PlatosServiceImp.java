package pe.edu.upeu.spring01.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring01.dao.PlatosDao;
import pe.edu.upeu.spring01.service.PlatosService;
@Service
public class PlatosServiceImp implements PlatosService{
	@Autowired
	private PlatosDao platosdao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return platosdao.readAll();
	}

}
