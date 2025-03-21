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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ProjectMetadata
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-12T17:49:40.645296700+01:00[Europe/Berlin]")

public class ProjectMetadata {
  @SerializedName("supplier")
  private OrganizationalEntity supplier = null;

  @SerializedName("authors")
  private List<OrganizationalContact> authors = null;

  public ProjectMetadata supplier(OrganizationalEntity supplier) {
    this.supplier = supplier;
    return this;
  }

   /**
   * Get supplier
   * @return supplier
  **/
  @Schema(description = "")
  public OrganizationalEntity getSupplier() {
    return supplier;
  }

  public void setSupplier(OrganizationalEntity supplier) {
    this.supplier = supplier;
  }

  public ProjectMetadata authors(List<OrganizationalContact> authors) {
    this.authors = authors;
    return this;
  }

  public ProjectMetadata addAuthorsItem(OrganizationalContact authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<OrganizationalContact>();
    }
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * Get authors
   * @return authors
  **/
  @Schema(description = "")
  public List<OrganizationalContact> getAuthors() {
    return authors;
  }

  public void setAuthors(List<OrganizationalContact> authors) {
    this.authors = authors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectMetadata projectMetadata = (ProjectMetadata) o;
    return Objects.equals(this.supplier, projectMetadata.supplier) &&
        Objects.equals(this.authors, projectMetadata.authors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplier, authors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectMetadata {\n");
    
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
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
