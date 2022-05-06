package com.prowess.university.api;

import java.util.Optional;

import javax.annotation.Generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import com.prowess.university.model.Student;
import com.prowess.university.model.Students;

/**
 * A delegate to be called by the {@link StudentsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-21T19:01:46.977+05:30[Asia/Calcutta]")
public interface StudentsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /students : Add a new student into the university
     *
     * @param student Student object that needs to be added to the University (required)
     * @return Invalid input (status code 405)
     * @see StudentsApi#addStudent
     */
    default ResponseEntity<Void> addStudent(Student student) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /students/{studentid} : Deletes a student
     *
     * @param studentid Student id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid ID supplied (status code 400)
     *         or Student not found (status code 404)
     * @see StudentsApi#deleteStudent
     */
    default ResponseEntity<Void> deleteStudent(Long studentid,
        String apiKey) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /students/{studentid} : Find student by ID
     * Returns a single student
     *
     * @param studentid ID of student to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Student not found (status code 404)
     * @see StudentsApi#getStudentById
     */
    default ResponseEntity<Student> getStudentById(Long studentid) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"studentid\" : 123, \"kind\" : \"Student\", \"name\" : \"Jacob\", \"self\" : \"localhost/students/123\", \"department\" : \"Computer Science\", \"postal_code\" : \"1A2B3\", \"email\" : \"john@apiuniversity.com\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Student> <self>localhost/students/123</self> <kind>Student</kind> <studentid>123</studentid> <name>Jacob</name> <department>Computer Science</department> <email>john@apiuniversity.com</email> <postal_code>1A2B3</postal_code> </Student>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /students : Get a list of students into the university
     * A list of students
     *
     * @return successful operation (status code 200)
     *         or Invalid input (status code 405)
     * @see StudentsApi#getStudents
     */
    default ResponseEntity<Students> getStudents() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"contents\" : [ { \"studentid\" : 123, \"kind\" : \"Student\", \"name\" : \"Jacob\", \"self\" : \"localhost/students/123\", \"department\" : \"Computer Science\", \"postal_code\" : \"1A2B3\", \"email\" : \"john@apiuniversity.com\" }, { \"studentid\" : 123, \"kind\" : \"Student\", \"name\" : \"Jacob\", \"self\" : \"localhost/students/123\", \"department\" : \"Computer Science\", \"postal_code\" : \"1A2B3\", \"email\" : \"john@apiuniversity.com\" } ], \"kind\" : \"students\", \"self\" : \"localhost/students\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Students> <self>localhost/students</self> <kind>students</kind> </Students>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /students/{studentid} : Update an existing student
     *
     * @param studentid ID of student to return (required)
     * @param student Student object that needs to be added to the University (required)
     * @return Invalid ID supplied (status code 400)
     *         or Student not found (status code 404)
     *         or Validation exception (status code 405)
     * @see StudentsApi#updateStudent
     */
    default ResponseEntity<Void> updateStudent(Long studentid,
        Student student) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
