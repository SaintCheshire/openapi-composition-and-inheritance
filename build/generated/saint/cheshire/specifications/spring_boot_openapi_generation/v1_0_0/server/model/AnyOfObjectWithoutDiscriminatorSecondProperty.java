package saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AnyOfObjectWithoutDiscriminatorSecondProperty
 */
@lombok.Builder(toBuilder = true)
@lombok.RequiredArgsConstructor
@lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-19T15:45:21.742670500+03:00[Europe/Moscow]")
public class AnyOfObjectWithoutDiscriminatorSecondProperty {

  private String anotherProperty;

  public AnyOfObjectWithoutDiscriminatorSecondProperty anotherProperty(String anotherProperty) {
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
    AnyOfObjectWithoutDiscriminatorSecondProperty anyOfObjectWithoutDiscriminatorSecondProperty = (AnyOfObjectWithoutDiscriminatorSecondProperty) o;
    return Objects.equals(this.anotherProperty, anyOfObjectWithoutDiscriminatorSecondProperty.anotherProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anotherProperty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnyOfObjectWithoutDiscriminatorSecondProperty {\n");
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

