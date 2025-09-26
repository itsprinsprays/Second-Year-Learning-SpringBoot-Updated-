package SpringBootRESTAPIs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootRESTAPIs.model.Student;
import SpringBootRESTAPIs.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public StudentService(StudentRepository repo) {
		this.repo = repo;	
	}
	
	public List<Student> getAllStudent() {
		return repo.getAll();
	}
	
	public Student getStudentByID(Long ID) {
		return repo.findByID(ID);
	}
	
	public Student addNewStudent(Student stud) {
		return repo.addNew(stud);
	}
	
	public void deleteByID(Long ID) {
		repo.deleteByID(ID);
	}
	
	

}
