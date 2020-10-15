package pe.edu.upeu.spring01.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring01.dao.UsuarioDao;
import pe.edu.upeu.spring01.service.UsuarioService;
@Service	
public class UsuarioServiceImp implements UsuarioService{
	@Autowired
    private UsuarioDao usuarioDao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}

}
