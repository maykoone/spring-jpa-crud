package dao;

import java.util.List;

import entidades.Contato;

public interface ContatoDao {

	Contato save(Contato contato);

	void remove(Contato contato);

	Contato findById(Long id);

	List<Contato> findAll();

}
