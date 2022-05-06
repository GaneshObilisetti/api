package com.prowess.university.model;

import java.util.Objects;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;


/**
 * Student
 */
@Entity
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-21T19:01:46.977+05:30[Asia/Calcutta]")
public class Student   {

  @JsonProperty("self")
  private String self;

  @JsonProperty("kind")
  private String kind;
@Id
  @JsonProperty("studentid")
  private Long studentid;

  @JsonProperty("name")
  private String name;

  @JsonProperty("department")
  private String department;

  @JsonProperty("email")
  private String email;

  @JsonProperty("postal_code")
  private String postalCode;

  public Student self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  
  @Schema(name = "self", example = "localhost/students/123", required = false)
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public Student kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
  
  @Schema(name = "kind", example = "Student", required = false)
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Student studentid(Long studentid) {
    this.studentid = studentid;
    return this;
  }

  /**
   * Get studentid
   * @return studentid
  */
  @NotNull 
  @Schema(name = "studentid", example = "123", required = true)
  public Long getStudentid() {
    return studentid;
  }

  public void setStudentid(Long studentid) {
    this.studentid = studentid;
  }

  public Student name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "Jacob", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Student department(String department) {
    this.department = department;
    return this;
  }

  /**
   * Get department
   * @return department
  */
  
  @Schema(name = "department", example = "Computer Science", required = false)
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Student email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", example = "john@apiuniversity.com", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Student postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
  */
  
  @Schema(name = "postal_code", example = "1A2B3", required = false)
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.self, student.self) &&
        Objects.equals(this.kind, student.kind) &&
        Objects.equals(this.studentid, student.studentid) &&
        Objects.equals(this.name, student.name) &&
        Objects.equals(this.department, student.department) &&
        Objects.equals(this.email, student.email) &&
        Objects.equals(this.postalCode, student.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, kind, studentid, name, department, email, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    studentid: ").append(toIndentedString(studentid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

