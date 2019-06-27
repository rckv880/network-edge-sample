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
 * LicenseFileMappingDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class LicenseFileMappingDto {
  @SerializedName("filename")
  private String filename = null;

  @SerializedName("throughput")
  private Integer throughput = null;

  @SerializedName("throughputUnit")
  private String throughputUnit = null;

  public LicenseFileMappingDto filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(value = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public LicenseFileMappingDto throughput(Integer throughput) {
    this.throughput = throughput;
    return this;
  }

   /**
   * Get throughput
   * @return throughput
  **/
  @ApiModelProperty(value = "")
  public Integer getThroughput() {
    return throughput;
  }

  public void setThroughput(Integer throughput) {
    this.throughput = throughput;
  }

  public LicenseFileMappingDto throughputUnit(String throughputUnit) {
    this.throughputUnit = throughputUnit;
    return this;
  }

   /**
   * Get throughputUnit
   * @return throughputUnit
  **/
  @ApiModelProperty(value = "")
  public String getThroughputUnit() {
    return throughputUnit;
  }

  public void setThroughputUnit(String throughputUnit) {
    this.throughputUnit = throughputUnit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseFileMappingDto licenseFileMappingDto = (LicenseFileMappingDto) o;
    return Objects.equals(this.filename, licenseFileMappingDto.filename) &&
        Objects.equals(this.throughput, licenseFileMappingDto.throughput) &&
        Objects.equals(this.throughputUnit, licenseFileMappingDto.throughputUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, throughput, throughputUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseFileMappingDto {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
    sb.append("    throughputUnit: ").append(toIndentedString(throughputUnit)).append("\n");
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
