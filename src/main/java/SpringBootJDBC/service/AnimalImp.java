package SpringBootJDBC.service;

import java.util.List;

import SpringBootJDBC.model.Animal;

public interface AnimalImp {
	
	int create(Animal animal);
	List<Animal> getAll();
	Animal findbyID(int ID);
	int update(Animal animal);
	int delete(int ID);

}
