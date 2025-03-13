/*
 * OWASP Dependency-Track
 * REST API of OWASP Dependency-Track
 *
 * OpenAPI spec version: 4.12.6
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vaadin.dtrack.api;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VexSubmitRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-12T17:49:40.645296700+01:00[Europe/Berlin]")

public class VexSubmitRequest {
  @SerializedName("project")
  private String project = null;

  @SerializedName("projectName")
  private String projectName = null;

  @SerializedName("projectVersion")
  private String projectVersion = null;

  @SerializedName("vex")
  private String vex = null;

  public VexSubmitRequest project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(required = true, description = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public VexSubmitRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(required = true, description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public VexSubmitRequest projectVersion(String projectVersion) {
    this.projectVersion = projectVersion;
    return this;
  }

   /**
   * Get projectVersion
   * @return projectVersion
  **/
  @Schema(required = true, description = "")
  public String getProjectVersion() {
    return projectVersion;
  }

  public void setProjectVersion(String projectVersion) {
    this.projectVersion = projectVersion;
  }

  public VexSubmitRequest vex(String vex) {
    this.vex = vex;
    return this;
  }

   /**
   * Get vex
   * @return vex
  **/
  @Schema(required = true, description = "")
  public String getVex() {
    return vex;
  }

  public void setVex(String vex) {
    this.vex = vex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VexSubmitRequest vexSubmitRequest = (VexSubmitRequest) o;
    return Objects.equals(this.project, vexSubmitRequest.project) &&
        Objects.equals(this.projectName, vexSubmitRequest.projectName) &&
        Objects.equals(this.projectVersion, vexSubmitRequest.projectVersion) &&
        Objects.equals(this.vex, vexSubmitRequest.vex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, projectName, projectVersion, vex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VexSubmitRequest {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectVersion: ").append(toIndentedString(projectVersion)).append("\n");
    sb.append("    vex: ").append(toIndentedString(vex)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
