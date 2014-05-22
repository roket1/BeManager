package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.UtenteDTO;

@Repository("UserDAO")
// Sto dicendo a Spring che questa classe è un DAO
public class UtenteDaoImpl implements UtenteDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void salvautente(UtenteDTO user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}

	@Override
	@Transactional
	public List<UtenteDTO> getUser() {
		@SuppressWarnings("unchecked")
		List<UtenteDTO> userlist = sessionFactory.getCurrentSession()
				.createCriteria(UtenteDTO.class).list();
		return userlist;

	}

}
