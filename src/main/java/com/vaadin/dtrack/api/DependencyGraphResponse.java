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
import java.util.UUID;
/**
 * DependencyGraphResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-12T17:49:40.645296700+01:00[Europe/Berlin]")

public class DependencyGraphResponse {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("purl")
  private String purl = null;

  @SerializedName("directDependencies")
  private String directDependencies = null;

  @SerializedName("latestVersion")
  private String latestVersion = null;

  public DependencyGraphResponse uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public DependencyGraphResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DependencyGraphResponse version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public DependencyGraphResponse purl(String purl) {
    this.purl = purl;
    return this;
  }

   /**
   * Get purl
   * @return purl
  **/
  @Schema(description = "")
  public String getPurl() {
    return purl;
  }

  public void setPurl(String purl) {
    this.purl = purl;
  }

  public DependencyGraphResponse directDependencies(String directDependencies) {
    this.directDependencies = directDependencies;
    return this;
  }

   /**
   * Get directDependencies
   * @return directDependencies
  **/
  @Schema(description = "")
  public String getDirectDependencies() {
    return directDependencies;
  }

  public void setDirectDependencies(String directDependencies) {
    this.directDependencies = directDependencies;
  }

  public DependencyGraphResponse latestVersion(String latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

   /**
   * Get latestVersion
   * @return latestVersion
  **/
  @Schema(description = "")
  public String getLatestVersion() {
    return latestVersion;
  }

  public void setLatestVersion(String latestVersion) {
    this.latestVersion = latestVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyGraphResponse dependencyGraphResponse = (DependencyGraphResponse) o;
    return Objects.equals(this.uuid, dependencyGraphResponse.uuid) &&
        Objects.equals(this.name, dependencyGraphResponse.name) &&
        Objects.equals(this.version, dependencyGraphResponse.version) &&
        Objects.equals(this.purl, dependencyGraphResponse.purl) &&
        Objects.equals(this.directDependencies, dependencyGraphResponse.directDependencies) &&
        Objects.equals(this.latestVersion, dependencyGraphResponse.latestVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, version, purl, directDependencies, latestVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyGraphResponse {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    purl: ").append(toIndentedString(purl)).append("\n");
    sb.append("    directDependencies: ").append(toIndentedString(directDependencies)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
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
