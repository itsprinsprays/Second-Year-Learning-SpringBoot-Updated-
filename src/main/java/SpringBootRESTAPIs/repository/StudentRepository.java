package SpringBootRESTAPIs.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringBootRESTAPIs.model.Student;

@Repository
public class StudentRepository {
	
	public List<Student> stud = new ArrayList<>(Arrays.asList(
			new Student("Prince","2E",20,1L),
			new Student("Robert","2E",19,2L),
			new Student("Laurence","2E",21,3L)
			));
	
	public List<Student> getAll() {
		return stud;
	}
	
	public Student findByID(Long ID) {
		return stud.stream()
					.filter(s -> s.getID().equals(ID))
					.findFirst()
					.orElse(null);
	}
	
	public Student addNew(Student students) {
		 stud.add(students);
		 return students;
	}
	
	public void deleteByID(Long ID) {
		stud.removeIf(s -> s.getID().equals(ID));
	}


}
