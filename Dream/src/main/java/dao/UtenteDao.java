package dao;

import java.util.List;

import model.UtenteDTO;

public interface UtenteDao {
	public void salvautente(UtenteDTO user);

	public List<UtenteDTO> getUser();

}
