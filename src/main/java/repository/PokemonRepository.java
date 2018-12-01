package repository;

import org.springframework.data.repository.CrudRepository;

import model.Pokemon;

public interface PokemonRepository extends CrudRepository<Pokemon, Long> {

}
