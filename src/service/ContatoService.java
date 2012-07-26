package service;

import java.util.List;

import entidades.Contato;

public interface ContatoService {

	public abstract Contato save(Contato contato);

	public abstract void remove(Contato contato);

	public abstract Contato findById(Long id);

	public abstract List<Contato> list();

}