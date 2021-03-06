/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prowess.university.api;

import com.prowess.university.model.Student;
import com.prowess.university.model.Students;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Generated;
import javax.validation.Valid;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-21T19:01:46.977+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "students", description = "the students API")
public interface StudentsApi {

    default StudentsApiDelegate getDelegate() {
        return new StudentsApiDelegate() {};
    }

    /**
     * POST /students : Add a new student into the university
     *
     * @param student Student object that needs to be added to the University (required)
     * @return Invalid input (status code 405)
     */
    @Operation(
        operationId = "addStudent",
        summary = "Add a new student into the university",
        tags = { "student" },
        responses = {
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/students",
        consumes = { "application/json", "application/xml" }
    )
    default ResponseEntity<Void> addStudent(
        @Parameter(name = "Student", description = "Student object that needs to be added to the University", required = true, schema = @Schema(description = "")) @Valid @RequestBody Student student
    ) {
        return getDelegate().addStudent(student);
    }


    /**
     * DELETE /students/{studentid} : Deletes a student
     *
     * @param studentid Student id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid ID supplied (status code 400)
     *         or Student not found (status code 404)
     */
    @Operation(
        operationId = "deleteStudent",
        summary = "Deletes a student",
        tags = { "student" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Student not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/students/{studentid}"
    )
    default ResponseEntity<Void> deleteStudent(
        @Parameter(name = "studentid", description = "Student id to delete", required = true, schema = @Schema(description = "")) @PathVariable("studentid") Long studentid,
        @Parameter(name = "api_key", description = "", schema = @Schema(description = "")) @RequestHeader(value = "api_key", required = false) String apiKey
    ) {
        return getDelegate().deleteStudent(studentid, apiKey);
    }


    /**
     * GET /students/{studentid} : Find student by ID
     * Returns a single student
     *
     * @param studentid ID of student to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Student not found (status code 404)
     */
    @Operation(
        operationId = "getStudentById",
        summary = "Find student by ID",
        tags = { "student" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Student.class))),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Student not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/students/{studentid}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<Student> getStudentById(
        @Parameter(name = "studentid", description = "ID of student to return", required = true, schema = @Schema(description = "")) @PathVariable("studentid") Long studentid
    ) {
        return getDelegate().getStudentById(studentid);
    }


    /**
     * GET /students : Get a list of students into the university
     * A list of students
     *
     * @return successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @Operation(
        operationId = "getStudents",
        summary = "Get a list of students into the university",
        tags = { "student" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Students.class))),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/students",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<Students> getStudents(
        
    ) {
        return getDelegate().getStudents();
    }


    /**
     * PUT /students/{studentid} : Update an existing student
     *
     * @param studentid ID of student to return (required)
     * @param student Student object that needs to be added to the University (required)
     * @return Invalid ID supplied (status code 400)
     *         or Student not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @Operation(
        operationId = "updateStudent",
        summary = "Update an existing student",
        tags = { "student" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Student not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/students/{studentid}",
        consumes = { "application/json", "application/xml" }
    )
    default ResponseEntity<Void> updateStudent(
        @Parameter(name = "studentid", description = "ID of student to return", required = true, schema = @Schema(description = "")) @PathVariable("studentid") Long studentid,
        @Parameter(name = "Student", description = "Student object that needs to be added to the University", required = true, schema = @Schema(description = "")) @Valid @RequestBody Student student
    ) {
        return getDelegate().updateStudent(studentid, student);
    }

}
