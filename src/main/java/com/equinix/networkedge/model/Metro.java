/*
 * Network Edge APIs
 * API Documentation for NE's Beta APIs. More information about Network Edge marketplace & NE platform can be found [here](https://ecxfabric-documentation.equinix.com/hc/en-us/articles/360021809172-Enterprise-Network-Edge-Beta-Program-Introduction).
 *
 * OpenAPI spec version: General Availability
 * Contact: Network-Edge-Support@equinix.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.equinix.networkedge.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * Metro
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class Metro {
  @SerializedName("metroCode")
  private String metroCode = null;

  @SerializedName("metroDescription")
  private String metroDescription = null;

  @SerializedName("region")
  private String region = null;

  public Metro metroCode(String metroCode) {
    this.metroCode = metroCode;
    return this;
  }

   /**
   * Metro code
   * @return metroCode
  **/
  @ApiModelProperty(example = "DC", value = "Metro code")
  public String getMetroCode() {
    return metroCode;
  }

  public void setMetroCode(String metroCode) {
    this.metroCode = metroCode;
  }

  public Metro metroDescription(String metroDescription) {
    this.metroDescription = metroDescription;
    return this;
  }

   /**
   * Metro description
   * @return metroDescription
  **/
  @ApiModelProperty(example = "Ashburn", value = "Metro description")
  public String getMetroDescription() {
    return metroDescription;
  }

  public void setMetroDescription(String metroDescription) {
    this.metroDescription = metroDescription;
  }

  public Metro region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Region. It may have several metros.
   * @return region
  **/
  @ApiModelProperty(example = "AMER", value = "Region. It may have several metros.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metro metro = (Metro) o;
    return Objects.equals(this.metroCode, metro.metroCode) &&
        Objects.equals(this.metroDescription, metro.metroDescription) &&
        Objects.equals(this.region, metro.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metroCode, metroDescription, region);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metro {\n");
    
    sb.append("    metroCode: ").append(toIndentedString(metroCode)).append("\n");
    sb.append("    metroDescription: ").append(toIndentedString(metroDescription)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

