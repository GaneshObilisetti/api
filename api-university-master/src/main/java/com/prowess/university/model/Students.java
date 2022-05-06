package com.prowess.university.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Students
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-21T19:01:46.977+05:30[Asia/Calcutta]")
public class Students   {

  @JsonProperty("self")
  private String self;

  @JsonProperty("kind")
  private String kind;

  @JsonProperty("contents")
  @Valid
  private List<Student> contents = null;

  public Students self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  
  @Schema(name = "self", example = "localhost/students", required = false)
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public Students kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
  
  @Schema(name = "kind", example = "students", required = false)
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Students contents(List<Student> contents) {
    this.contents = contents;
    return this;
  }

  public Students addContentsItem(Student contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

  /**
   * Get contents
   * @return contents
  */
  @Valid 
  @Schema(name = "contents", required = false)
  public List<Student> getContents() {
    return contents;
  }

  public void setContents(List<Student> contents) {
    this.contents = contents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Students students = (Students) o;
    return Objects.equals(this.self, students.self) &&
        Objects.equals(this.kind, students.kind) &&
        Objects.equals(this.contents, students.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, kind, contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Students {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

