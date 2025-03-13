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
import com.vaadin.dtrack.api.AffectedVersionAttribution;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * AffectedComponent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-12T17:49:40.645296700+01:00[Europe/Berlin]")

public class AffectedComponent {
  /**
   * Gets or Sets identityType
   */
  @JsonAdapter(IdentityTypeEnum.Adapter.class)
  public enum IdentityTypeEnum {
    @SerializedName("CPE")
    CPE("CPE"),
    @SerializedName("PURL")
    PURL("PURL");

    private String value;

    IdentityTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IdentityTypeEnum fromValue(String input) {
      for (IdentityTypeEnum b : IdentityTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IdentityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdentityTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public IdentityTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return IdentityTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("identityType")
  private IdentityTypeEnum identityType = null;

  @SerializedName("identity")
  private String identity = null;

  /**
   * Gets or Sets versionType
   */
  @JsonAdapter(VersionTypeEnum.Adapter.class)
  public enum VersionTypeEnum {
    @SerializedName("EXACT")
    EXACT("EXACT"),
    @SerializedName("RANGE")
    RANGE("RANGE");

    private String value;

    VersionTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VersionTypeEnum fromValue(String input) {
      for (VersionTypeEnum b : VersionTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VersionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VersionTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public VersionTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return VersionTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("versionType")
  private VersionTypeEnum versionType = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("versionEndExcluding")
  private String versionEndExcluding = null;

  @SerializedName("versionEndIncluding")
  private String versionEndIncluding = null;

  @SerializedName("versionStartExcluding")
  private String versionStartExcluding = null;

  @SerializedName("versionStartIncluding")
  private String versionStartIncluding = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("affectedVersionAttributions")
  private List<AffectedVersionAttribution> affectedVersionAttributions = null;

  public AffectedComponent identityType(IdentityTypeEnum identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Get identityType
   * @return identityType
  **/
  @Schema(description = "")
  public IdentityTypeEnum getIdentityType() {
    return identityType;
  }

  public void setIdentityType(IdentityTypeEnum identityType) {
    this.identityType = identityType;
  }

  public AffectedComponent identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @Schema(description = "")
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public AffectedComponent versionType(VersionTypeEnum versionType) {
    this.versionType = versionType;
    return this;
  }

   /**
   * Get versionType
   * @return versionType
  **/
  @Schema(description = "")
  public VersionTypeEnum getVersionType() {
    return versionType;
  }

  public void setVersionType(VersionTypeEnum versionType) {
    this.versionType = versionType;
  }

  public AffectedComponent version(String version) {
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

  public AffectedComponent versionEndExcluding(String versionEndExcluding) {
    this.versionEndExcluding = versionEndExcluding;
    return this;
  }

   /**
   * Get versionEndExcluding
   * @return versionEndExcluding
  **/
  @Schema(description = "")
  public String getVersionEndExcluding() {
    return versionEndExcluding;
  }

  public void setVersionEndExcluding(String versionEndExcluding) {
    this.versionEndExcluding = versionEndExcluding;
  }

  public AffectedComponent versionEndIncluding(String versionEndIncluding) {
    this.versionEndIncluding = versionEndIncluding;
    return this;
  }

   /**
   * Get versionEndIncluding
   * @return versionEndIncluding
  **/
  @Schema(description = "")
  public String getVersionEndIncluding() {
    return versionEndIncluding;
  }

  public void setVersionEndIncluding(String versionEndIncluding) {
    this.versionEndIncluding = versionEndIncluding;
  }

  public AffectedComponent versionStartExcluding(String versionStartExcluding) {
    this.versionStartExcluding = versionStartExcluding;
    return this;
  }

   /**
   * Get versionStartExcluding
   * @return versionStartExcluding
  **/
  @Schema(description = "")
  public String getVersionStartExcluding() {
    return versionStartExcluding;
  }

  public void setVersionStartExcluding(String versionStartExcluding) {
    this.versionStartExcluding = versionStartExcluding;
  }

  public AffectedComponent versionStartIncluding(String versionStartIncluding) {
    this.versionStartIncluding = versionStartIncluding;
    return this;
  }

   /**
   * Get versionStartIncluding
   * @return versionStartIncluding
  **/
  @Schema(description = "")
  public String getVersionStartIncluding() {
    return versionStartIncluding;
  }

  public void setVersionStartIncluding(String versionStartIncluding) {
    this.versionStartIncluding = versionStartIncluding;
  }

  public AffectedComponent uuid(UUID uuid) {
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

  public AffectedComponent affectedVersionAttributions(List<AffectedVersionAttribution> affectedVersionAttributions) {
    this.affectedVersionAttributions = affectedVersionAttributions;
    return this;
  }

  public AffectedComponent addAffectedVersionAttributionsItem(AffectedVersionAttribution affectedVersionAttributionsItem) {
    if (this.affectedVersionAttributions == null) {
      this.affectedVersionAttributions = new ArrayList<AffectedVersionAttribution>();
    }
    this.affectedVersionAttributions.add(affectedVersionAttributionsItem);
    return this;
  }

   /**
   * Get affectedVersionAttributions
   * @return affectedVersionAttributions
  **/
  @Schema(description = "")
  public List<AffectedVersionAttribution> getAffectedVersionAttributions() {
    return affectedVersionAttributions;
  }

  public void setAffectedVersionAttributions(List<AffectedVersionAttribution> affectedVersionAttributions) {
    this.affectedVersionAttributions = affectedVersionAttributions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffectedComponent affectedComponent = (AffectedComponent) o;
    return Objects.equals(this.identityType, affectedComponent.identityType) &&
        Objects.equals(this.identity, affectedComponent.identity) &&
        Objects.equals(this.versionType, affectedComponent.versionType) &&
        Objects.equals(this.version, affectedComponent.version) &&
        Objects.equals(this.versionEndExcluding, affectedComponent.versionEndExcluding) &&
        Objects.equals(this.versionEndIncluding, affectedComponent.versionEndIncluding) &&
        Objects.equals(this.versionStartExcluding, affectedComponent.versionStartExcluding) &&
        Objects.equals(this.versionStartIncluding, affectedComponent.versionStartIncluding) &&
        Objects.equals(this.uuid, affectedComponent.uuid) &&
        Objects.equals(this.affectedVersionAttributions, affectedComponent.affectedVersionAttributions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityType, identity, versionType, version, versionEndExcluding, versionEndIncluding, versionStartExcluding, versionStartIncluding, uuid, affectedVersionAttributions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffectedComponent {\n");
    
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionEndExcluding: ").append(toIndentedString(versionEndExcluding)).append("\n");
    sb.append("    versionEndIncluding: ").append(toIndentedString(versionEndIncluding)).append("\n");
    sb.append("    versionStartExcluding: ").append(toIndentedString(versionStartExcluding)).append("\n");
    sb.append("    versionStartIncluding: ").append(toIndentedString(versionStartIncluding)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    affectedVersionAttributions: ").append(toIndentedString(affectedVersionAttributions)).append("\n");
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
