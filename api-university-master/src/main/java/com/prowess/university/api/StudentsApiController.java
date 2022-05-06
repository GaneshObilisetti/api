package com.prowess.university.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.prowess.university.model.Student;
import com.prowess.university.model.Students;
import com.prowess.university.repository.StudentApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.Optional;
import javax.annotation.Generated;
import javax.validation.Valid;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-21T19:01:46.977+05:30[Asia/Calcutta]")
@Controller
@RequestMapping("${openapi.aPIUniversity.base-path:}")
public class StudentsApiController implements StudentsApi {
	@Autowired
	StudentApiRepository repository;

    private final StudentsApiDelegate delegate;

    public StudentsApiController(@Autowired(required = false) StudentsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new StudentsApiDelegate() {});
    }

    @Override
    public StudentsApiDelegate getDelegate() {
        return delegate;
    }

	@Override
	public ResponseEntity<Void> addStudent(@Valid Student student) {
		repository.save(student);
		return StudentsApi.super.addStudent(student);
	}

	@Override
	public ResponseEntity<Void> deleteStudent(Long studentid, String apiKey) {
		Student student = new Student();
		student.setStudentid(studentid);
		repository.delete(student);
		return ResponseEntity.ok().build();
	}

	@Override
	public ResponseEntity<Student> getStudentById(Long studentid) {
		return ResponseEntity.ok().body(repository.findByStudentid(studentid));
	}

	@Override
	public ResponseEntity<Students> getStudents() {
		// TODO Auto-generated method stub
		return StudentsApi.super.getStudents();
	}

	@Override
	public ResponseEntity<Void> updateStudent(Long studentid, @Valid Student student) {
		repository.save(student);
		return ResponseEntity.ok().build();
	}
    
}
