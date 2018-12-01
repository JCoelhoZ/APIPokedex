package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Pokemon;
import repository.PokemonRepository;

@Service
public class PokemonService {

	@Autowired
	private PokemonRepository repository;
	
	@Transactional
	public Pokemon save(Pokemon pokemon) {
		return repository.save(pokemon);
	}
	
	@Transactional
	public Pokemon findById(long id) {
		return repository.findById(id).get();
	}
	
	@Transactional
	public List<Pokemon> findAll(){
		Iterator<Pokemon> iterator = repository.findAll().iterator();
		List<Pokemon> pokemons = new ArrayList<>();
		while(iterator.hasNext()) {
			pokemons.add(iterator.next());
		}
		return pokemons;
	}
	
	@Transactional
	public void deleteById(long id) {
		repository.deleteById(id);
	}
}

