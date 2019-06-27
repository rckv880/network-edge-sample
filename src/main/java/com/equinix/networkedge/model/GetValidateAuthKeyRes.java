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
import com.equinix.networkedge.model.GetValidateAuthkeyresPrimary;
import com.equinix.networkedge.model.GetValidateAuthkeyresSecondary;

/**
 * GetValidateAuthKeyRes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class GetValidateAuthKeyRes {
  @SerializedName("message")
  private String message = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("primary")
  private GetValidateAuthkeyresPrimary primary = null;

  @SerializedName("secondary")
  private GetValidateAuthkeyresSecondary secondary = null;

  public GetValidateAuthKeyRes message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "Authorization key provided is valid", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public GetValidateAuthKeyRes status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "VALID", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetValidateAuthKeyRes primary(GetValidateAuthkeyresPrimary primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @ApiModelProperty(value = "")
  public GetValidateAuthkeyresPrimary getPrimary() {
    return primary;
  }

  public void setPrimary(GetValidateAuthkeyresPrimary primary) {
    this.primary = primary;
  }

  public GetValidateAuthKeyRes secondary(GetValidateAuthkeyresSecondary secondary) {
    this.secondary = secondary;
    return this;
  }

   /**
   * Get secondary
   * @return secondary
  **/
  @ApiModelProperty(value = "")
  public GetValidateAuthkeyresSecondary getSecondary() {
    return secondary;
  }

  public void setSecondary(GetValidateAuthkeyresSecondary secondary) {
    this.secondary = secondary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetValidateAuthKeyRes getValidateAuthKeyRes = (GetValidateAuthKeyRes) o;
    return Objects.equals(this.message, getValidateAuthKeyRes.message) &&
        Objects.equals(this.status, getValidateAuthKeyRes.status) &&
        Objects.equals(this.primary, getValidateAuthKeyRes.primary) &&
        Objects.equals(this.secondary, getValidateAuthKeyRes.secondary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, status, primary, secondary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetValidateAuthKeyRes {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
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

