package SpringBootJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootJDBC.model.Animal;
import SpringBootJDBC.repository.AnimalRepository;

@Service
public class AnimalService implements AnimalImp{
	
	@Autowired
	private AnimalRepository repo;
	
	public AnimalService(AnimalRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public int create(Animal animal) {
		return repo.createAnimal(animal);
	}
	
	@Override
	public List<Animal> getAll() {
		return repo.findAll();
	}
	
	@Override
	public Animal findbyID(int ID) {
		return repo.findByID(ID);
	}
	
	@Override
	public int update(Animal animal) {
		return repo.updateAnimal(animal);
	}
	
	public int delete(int ID) {
		return repo.deleteAnimal(ID);
	}
	 

}
