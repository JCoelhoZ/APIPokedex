package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Pokemon;
import service.PokemonService;

@RestController
@RequestMapping("pokemon")
public class PokemonController {
	@Autowired
	private PokemonService service;
	
	@PostMapping
	public Pokemon save(@RequestBody Pokemon pokemon) {
		return service.save(pokemon);
	}
	
	@PutMapping
	public Pokemon saveUpdate(@RequestBody Pokemon pokemon) {
		return service.save(pokemon);
	}
	
	@GetMapping("{id}")
	public Pokemon findById(@PathVariable("id") long id) {
		return service.findById(id);
	}
	
	@GetMapping("all")
	public List<Pokemon> findAll() {
		return service.findAll();
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable("id") long id) {
		service.deleteById(id);
	}
	
}
