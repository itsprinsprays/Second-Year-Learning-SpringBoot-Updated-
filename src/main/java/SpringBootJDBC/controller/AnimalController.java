package SpringBootJDBC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootJDBC.model.Animal;
import SpringBootJDBC.service.AnimalService;

@RestController
@RequestMapping("/animals")
@CrossOrigin (origins = "*")
public class AnimalController {
	
	@Autowired
	private final AnimalService serv;
	
	public AnimalController(AnimalService serv) {
		this.serv = serv;
	}
	
	@PostMapping
	public String createAnimal(@RequestBody Animal animal) {
		serv.create(animal);
		return "Animal Created";
	}
	
	@GetMapping("/{id}")
	public Animal getAnimalByID(@PathVariable int id) {
		return serv.findbyID(id);
	}
	
	@GetMapping
	public List<Animal> getAllAnimal() {
		return serv.getAll();
	}
	
	@PutMapping("/{id}")
	public String updateAnimal(@PathVariable int id, @RequestBody Animal animal) {
		animal.setID(id);
		serv.update(animal);
		return "Update Animal";
	}
	
	@DeleteMapping("/{id}")
	public String deleteAnimal(int ID) {
		serv.delete(ID);
		return "Delete Animal";
	}
}
