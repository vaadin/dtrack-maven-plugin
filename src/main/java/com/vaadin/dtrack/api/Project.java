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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Project
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-12T17:49:40.645296700+01:00[Europe/Berlin]")

public class Project {
  @SerializedName("authors")
  private List<OrganizationalContact> authors = null;

  @SerializedName("publisher")
  private String publisher = null;

  @SerializedName("manufacturer")
  private OrganizationalEntity manufacturer = null;

  @SerializedName("supplier")
  private OrganizationalEntity supplier = null;

  @SerializedName("group")
  private String group = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("version")
  private String version = null;

  /**
   * Gets or Sets classifier
   */
  @JsonAdapter(ClassifierEnum.Adapter.class)
  public enum ClassifierEnum {
    @SerializedName("APPLICATION")
    APPLICATION("APPLICATION"),
    @SerializedName("FRAMEWORK")
    FRAMEWORK("FRAMEWORK"),
    @SerializedName("LIBRARY")
    LIBRARY("LIBRARY"),
    @SerializedName("CONTAINER")
    CONTAINER("CONTAINER"),
    @SerializedName("OPERATING_SYSTEM")
    OPERATING_SYSTEM("OPERATING_SYSTEM"),
    @SerializedName("DEVICE")
    DEVICE("DEVICE"),
    @SerializedName("FIRMWARE")
    FIRMWARE("FIRMWARE"),
    @SerializedName("FILE")
    FILE("FILE"),
    @SerializedName("PLATFORM")
    PLATFORM("PLATFORM"),
    @SerializedName("DEVICE_DRIVER")
    DEVICE_DRIVER("DEVICE_DRIVER"),
    @SerializedName("MACHINE_LEARNING_MODEL")
    MACHINE_LEARNING_MODEL("MACHINE_LEARNING_MODEL"),
    @SerializedName("DATA")
    DATA("DATA");

    private String value;

    ClassifierEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ClassifierEnum fromValue(String input) {
      for (ClassifierEnum b : ClassifierEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ClassifierEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClassifierEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ClassifierEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ClassifierEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("classifier")
  private ClassifierEnum classifier = null;

  @SerializedName("cpe")
  private String cpe = null;

  @SerializedName("purl")
  private String purl = null;

  @SerializedName("swidTagId")
  private String swidTagId = null;

  @SerializedName("directDependencies")
  private String directDependencies = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("parent")
  private Project parent = null;

  @SerializedName("children")
  private List<Project> children = null;

  @SerializedName("properties")
  private List<ProjectProperty> properties = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  @SerializedName("lastBomImport")
  private Long lastBomImport = null;

  @SerializedName("lastBomImportFormat")
  private String lastBomImportFormat = null;

  @SerializedName("lastInheritedRiskScore")
  private Double lastInheritedRiskScore = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("isLatest")
  private Boolean isLatest = null;

  @SerializedName("accessTeams")
  private List<Team> accessTeams = null;

  @SerializedName("externalReferences")
  private List<ExternalReference> externalReferences = null;

  @SerializedName("metadata")
  private ProjectMetadata metadata = null;

  @SerializedName("versions")
  private List<ProjectVersion> versions = null;

  @SerializedName("author")
  private String author = null;

  @SerializedName("metrics")
  private ProjectMetrics metrics = null;

  @SerializedName("bomRef")
  private String bomRef = null;

  public Project authors(List<OrganizationalContact> authors) {
    this.authors = authors;
    return this;
  }

  public Project addAuthorsItem(OrganizationalContact authorsItem) {
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

  public Project publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @Schema(description = "")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public Project manufacturer(OrganizationalEntity manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @Schema(description = "")
  public OrganizationalEntity getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(OrganizationalEntity manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Project supplier(OrganizationalEntity supplier) {
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

  public Project group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @Schema(description = "")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Project version(String version) {
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

  public Project classifier(ClassifierEnum classifier) {
    this.classifier = classifier;
    return this;
  }

   /**
   * Get classifier
   * @return classifier
  **/
  @Schema(description = "")
  public ClassifierEnum getClassifier() {
    return classifier;
  }

  public void setClassifier(ClassifierEnum classifier) {
    this.classifier = classifier;
  }

  public Project cpe(String cpe) {
    this.cpe = cpe;
    return this;
  }

   /**
   * Get cpe
   * @return cpe
  **/
  @Schema(description = "")
  public String getCpe() {
    return cpe;
  }

  public void setCpe(String cpe) {
    this.cpe = cpe;
  }

  public Project purl(String purl) {
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

  public Project swidTagId(String swidTagId) {
    this.swidTagId = swidTagId;
    return this;
  }

   /**
   * Get swidTagId
   * @return swidTagId
  **/
  @Schema(description = "")
  public String getSwidTagId() {
    return swidTagId;
  }

  public void setSwidTagId(String swidTagId) {
    this.swidTagId = swidTagId;
  }

  public Project directDependencies(String directDependencies) {
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

  public Project uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(required = true, description = "")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public Project parent(Project parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @Schema(description = "")
  public Project getParent() {
    return parent;
  }

  public void setParent(Project parent) {
    this.parent = parent;
  }

  public Project children(List<Project> children) {
    this.children = children;
    return this;
  }

  public Project addChildrenItem(Project childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<Project>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @Schema(description = "")
  public List<Project> getChildren() {
    return children;
  }

  public void setChildren(List<Project> children) {
    this.children = children;
  }

  public Project properties(List<ProjectProperty> properties) {
    this.properties = properties;
    return this;
  }

  public Project addPropertiesItem(ProjectProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<ProjectProperty>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Schema(description = "")
  public List<ProjectProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<ProjectProperty> properties) {
    this.properties = properties;
  }

  public Project tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Project addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Project lastBomImport(Long lastBomImport) {
    this.lastBomImport = lastBomImport;
    return this;
  }

   /**
   * UNIX epoch timestamp in milliseconds
   * @return lastBomImport
  **/
  @Schema(required = true, description = "UNIX epoch timestamp in milliseconds")
  public Long getLastBomImport() {
    return lastBomImport;
  }

  public void setLastBomImport(Long lastBomImport) {
    this.lastBomImport = lastBomImport;
  }

  public Project lastBomImportFormat(String lastBomImportFormat) {
    this.lastBomImportFormat = lastBomImportFormat;
    return this;
  }

   /**
   * Get lastBomImportFormat
   * @return lastBomImportFormat
  **/
  @Schema(description = "")
  public String getLastBomImportFormat() {
    return lastBomImportFormat;
  }

  public void setLastBomImportFormat(String lastBomImportFormat) {
    this.lastBomImportFormat = lastBomImportFormat;
  }

  public Project lastInheritedRiskScore(Double lastInheritedRiskScore) {
    this.lastInheritedRiskScore = lastInheritedRiskScore;
    return this;
  }

   /**
   * Get lastInheritedRiskScore
   * @return lastInheritedRiskScore
  **/
  @Schema(description = "")
  public Double getLastInheritedRiskScore() {
    return lastInheritedRiskScore;
  }

  public void setLastInheritedRiskScore(Double lastInheritedRiskScore) {
    this.lastInheritedRiskScore = lastInheritedRiskScore;
  }

  public Project active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @Schema(description = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Project isLatest(Boolean isLatest) {
    this.isLatest = isLatest;
    return this;
  }

   /**
   * Get isLatest
   * @return isLatest
  **/
  @Schema(description = "")
  public Boolean isIsLatest() {
    return isLatest;
  }

  public void setIsLatest(Boolean isLatest) {
    this.isLatest = isLatest;
  }

  public Project accessTeams(List<Team> accessTeams) {
    this.accessTeams = accessTeams;
    return this;
  }

  public Project addAccessTeamsItem(Team accessTeamsItem) {
    if (this.accessTeams == null) {
      this.accessTeams = new ArrayList<Team>();
    }
    this.accessTeams.add(accessTeamsItem);
    return this;
  }

   /**
   * Get accessTeams
   * @return accessTeams
  **/
  @Schema(description = "")
  public List<Team> getAccessTeams() {
    return accessTeams;
  }

  public void setAccessTeams(List<Team> accessTeams) {
    this.accessTeams = accessTeams;
  }

  public Project externalReferences(List<ExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  public Project addExternalReferencesItem(ExternalReference externalReferencesItem) {
    if (this.externalReferences == null) {
      this.externalReferences = new ArrayList<ExternalReference>();
    }
    this.externalReferences.add(externalReferencesItem);
    return this;
  }

   /**
   * Get externalReferences
   * @return externalReferences
  **/
  @Schema(description = "")
  public List<ExternalReference> getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(List<ExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
  }

  public Project metadata(ProjectMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public ProjectMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ProjectMetadata metadata) {
    this.metadata = metadata;
  }

  public Project versions(List<ProjectVersion> versions) {
    this.versions = versions;
    return this;
  }

  public Project addVersionsItem(ProjectVersion versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<ProjectVersion>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @Schema(description = "")
  public List<ProjectVersion> getVersions() {
    return versions;
  }

  public void setVersions(List<ProjectVersion> versions) {
    this.versions = versions;
  }

  public Project author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @Schema(description = "")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Project metrics(ProjectMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @Schema(description = "")
  public ProjectMetrics getMetrics() {
    return metrics;
  }

  public void setMetrics(ProjectMetrics metrics) {
    this.metrics = metrics;
  }

  public Project bomRef(String bomRef) {
    this.bomRef = bomRef;
    return this;
  }

   /**
   * Get bomRef
   * @return bomRef
  **/
  @Schema(description = "")
  public String getBomRef() {
    return bomRef;
  }

  public void setBomRef(String bomRef) {
    this.bomRef = bomRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.authors, project.authors) &&
        Objects.equals(this.publisher, project.publisher) &&
        Objects.equals(this.manufacturer, project.manufacturer) &&
        Objects.equals(this.supplier, project.supplier) &&
        Objects.equals(this.group, project.group) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.version, project.version) &&
        Objects.equals(this.classifier, project.classifier) &&
        Objects.equals(this.cpe, project.cpe) &&
        Objects.equals(this.purl, project.purl) &&
        Objects.equals(this.swidTagId, project.swidTagId) &&
        Objects.equals(this.directDependencies, project.directDependencies) &&
        Objects.equals(this.uuid, project.uuid) &&
        Objects.equals(this.parent, project.parent) &&
        Objects.equals(this.children, project.children) &&
        Objects.equals(this.properties, project.properties) &&
        Objects.equals(this.tags, project.tags) &&
        Objects.equals(this.lastBomImport, project.lastBomImport) &&
        Objects.equals(this.lastBomImportFormat, project.lastBomImportFormat) &&
        Objects.equals(this.lastInheritedRiskScore, project.lastInheritedRiskScore) &&
        Objects.equals(this.active, project.active) &&
        Objects.equals(this.isLatest, project.isLatest) &&
        Objects.equals(this.accessTeams, project.accessTeams) &&
        Objects.equals(this.externalReferences, project.externalReferences) &&
        Objects.equals(this.metadata, project.metadata) &&
        Objects.equals(this.versions, project.versions) &&
        Objects.equals(this.author, project.author) &&
        Objects.equals(this.metrics, project.metrics) &&
        Objects.equals(this.bomRef, project.bomRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authors, publisher, manufacturer, supplier, group, name, description, version, classifier, cpe, purl, swidTagId, directDependencies, uuid, parent, children, properties, tags, lastBomImport, lastBomImportFormat, lastInheritedRiskScore, active, isLatest, accessTeams, externalReferences, metadata, versions, author, metrics, bomRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n");
    sb.append("    cpe: ").append(toIndentedString(cpe)).append("\n");
    sb.append("    purl: ").append(toIndentedString(purl)).append("\n");
    sb.append("    swidTagId: ").append(toIndentedString(swidTagId)).append("\n");
    sb.append("    directDependencies: ").append(toIndentedString(directDependencies)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    lastBomImport: ").append(toIndentedString(lastBomImport)).append("\n");
    sb.append("    lastBomImportFormat: ").append(toIndentedString(lastBomImportFormat)).append("\n");
    sb.append("    lastInheritedRiskScore: ").append(toIndentedString(lastInheritedRiskScore)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    isLatest: ").append(toIndentedString(isLatest)).append("\n");
    sb.append("    accessTeams: ").append(toIndentedString(accessTeams)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    bomRef: ").append(toIndentedString(bomRef)).append("\n");
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
