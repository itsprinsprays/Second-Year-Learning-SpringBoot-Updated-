package SpringBootRESTAPIs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import SpringBootRESTAPIs.model.Student;
import SpringBootRESTAPIs.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {
	
	private final StudentService serv;
	
	@Autowired
	public StudentController(StudentService serv) {
		this.serv = serv;
	}
	
	@GetMapping
	public List<Student> getAllStudent() {
		return serv.getAllStudent();
	}
	
	@GetMapping("/{ID}")
	public Student getStudentByID(@PathVariable Long ID) {
		return serv.getStudentByID(ID);
	}
	
	@PostMapping
	public Student addNewStudent(@RequestBody Student students) {
		return serv.addNewStudent(students);
	}
	
	@DeleteMapping("/{ID}")
	public void deleteStudent(@PathVariable Long ID) {
		serv.deleteByID(ID);
	}
	
	
}


