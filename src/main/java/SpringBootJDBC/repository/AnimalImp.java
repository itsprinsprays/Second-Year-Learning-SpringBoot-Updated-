package SpringBootJDBC.repository;

import java.util.List;

import SpringBootJDBC.model.Animal;

public interface AnimalImp {
	
	int createAnimal(Animal animal);
	List<Animal> findAll();
	Animal findByID(int ID);
	int updateAnimal(Animal animal);
	int deleteAnimal(int ID);
}
