package pe.edu.upeu.spring01.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring01.dao.PersonasDao;
import pe.edu.upeu.spring01.service.PersonasService;
@Service
public class PersonasServiceImp implements PersonasService{
	@Autowired
    private PersonasDao personasDao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return personasDao.readAll();
	}
}
