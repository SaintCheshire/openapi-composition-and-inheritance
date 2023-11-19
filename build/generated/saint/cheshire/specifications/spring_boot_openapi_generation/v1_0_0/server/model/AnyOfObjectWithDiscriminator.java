package saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.server.model.AnyOfObjectWithDiscriminatorFirstProperty;
import saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.server.model.AnyOfObjectWithDiscriminatorSecondProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AnyOfObjectWithDiscriminator
 */
@lombok.Builder(toBuilder = true)
@lombok.RequiredArgsConstructor
@lombok.AllArgsConstructor

@JsonIgnoreProperties(
  value = "PropertyType", // ignore manually set PropertyType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the PropertyType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "PropertyType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AnyOfObjectWithDiscriminatorFirstProperty.class, name = "first"),
  @JsonSubTypes.Type(value = AnyOfObjectWithDiscriminatorSecondProperty.class, name = "second"),
  @JsonSubTypes.Type(value = AnyOfObjectWithDiscriminatorFirstProperty.class, name = "AnyOfObjectWithDiscriminatorFirstProperty"),
  @JsonSubTypes.Type(value = AnyOfObjectWithDiscriminatorSecondProperty.class, name = "AnyOfObjectWithDiscriminatorSecondProperty")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-19T15:45:21.742670500+03:00[Europe/Moscow]")
public class AnyOfObjectWithDiscriminator {

  private String propertyType;

  private String someProperty;

  private String anotherProperty;

  public AnyOfObjectWithDiscriminator propertyType(String propertyType) {
    this.propertyType = propertyType;
    return this;
  }

  /**
   * Get propertyType
   * @return propertyType
  */
  @NotNull 
  @Schema(name = "propertyType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("propertyType")
  public String getPropertyType() {
    return propertyType;
  }

  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }

  public AnyOfObjectWithDiscriminator someProperty(String someProperty) {
    this.someProperty = someProperty;
    return this;
  }

  /**
   * Get someProperty
   * @return someProperty
  */
  @NotNull 
  @Schema(name = "someProperty", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("someProperty")
  public String getSomeProperty() {
    return someProperty;
  }

  public void setSomeProperty(String someProperty) {
    this.someProperty = someProperty;
  }

  public AnyOfObjectWithDiscriminator anotherProperty(String anotherProperty) {
    this.anotherProperty = anotherProperty;
    return this;
  }

  /**
   * Get anotherProperty
   * @return anotherProperty
  */
  @NotNull 
  @Schema(name = "anotherProperty", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("anotherProperty")
  public String getAnotherProperty() {
    return anotherProperty;
  }

  public void setAnotherProperty(String anotherProperty) {
    this.anotherProperty = anotherProperty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnyOfObjectWithDiscriminator anyOfObjectWithDiscriminator = (AnyOfObjectWithDiscriminator) o;
    return Objects.equals(this.propertyType, anyOfObjectWithDiscriminator.propertyType) &&
        Objects.equals(this.someProperty, anyOfObjectWithDiscriminator.someProperty) &&
        Objects.equals(this.anotherProperty, anyOfObjectWithDiscriminator.anotherProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyType, someProperty, anotherProperty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnyOfObjectWithDiscriminator {\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    someProperty: ").append(toIndentedString(someProperty)).append("\n");
    sb.append("    anotherProperty: ").append(toIndentedString(anotherProperty)).append("\n");
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

