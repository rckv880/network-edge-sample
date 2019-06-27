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
 * BgpInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class BgpInfo {
  @SerializedName("authenticationKey")
  private String authenticationKey = null;

  @SerializedName("connectionUUID")
  private String connectionUUID = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("createdByEmail")
  private String createdByEmail = null;

  @SerializedName("createdByFullName")
  private String createdByFullName = null;

  @SerializedName("createdDate")
  private String createdDate = null;

  @SerializedName("deletedBy")
  private String deletedBy = null;

  @SerializedName("deletedByEmail")
  private String deletedByEmail = null;

  @SerializedName("deletedByFullName")
  private String deletedByFullName = null;

  @SerializedName("deletedDate")
  private String deletedDate = null;

  @SerializedName("lastUpdatedBy")
  private String lastUpdatedBy = null;

  @SerializedName("lastUpdatedByEmail")
  private String lastUpdatedByEmail = null;

  @SerializedName("lastUpdatedByFullName")
  private String lastUpdatedByFullName = null;

  @SerializedName("lastUpdatedDate")
  private String lastUpdatedDate = null;

  @SerializedName("localAsn")
  private Long localAsn = null;

  @SerializedName("localIpAddress")
  private String localIpAddress = null;

  @SerializedName("provisioningStatus")
  private String provisioningStatus = null;

  @SerializedName("remoteAsn")
  private Long remoteAsn = null;

  @SerializedName("remoteIpAddress")
  private String remoteIpAddress = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("virtualDeviceUUID")
  private String virtualDeviceUUID = null;

  public BgpInfo authenticationKey(String authenticationKey) {
    this.authenticationKey = authenticationKey;
    return this;
  }

   /**
   * Get authenticationKey
   * @return authenticationKey
  **/
  @ApiModelProperty(value = "")
  public String getAuthenticationKey() {
    return authenticationKey;
  }

  public void setAuthenticationKey(String authenticationKey) {
    this.authenticationKey = authenticationKey;
  }

  public BgpInfo connectionUUID(String connectionUUID) {
    this.connectionUUID = connectionUUID;
    return this;
  }

   /**
   * Get connectionUUID
   * @return connectionUUID
  **/
  @ApiModelProperty(value = "")
  public String getConnectionUUID() {
    return connectionUUID;
  }

  public void setConnectionUUID(String connectionUUID) {
    this.connectionUUID = connectionUUID;
  }

  public BgpInfo createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public BgpInfo createdByEmail(String createdByEmail) {
    this.createdByEmail = createdByEmail;
    return this;
  }

   /**
   * Get createdByEmail
   * @return createdByEmail
  **/
  @ApiModelProperty(value = "")
  public String getCreatedByEmail() {
    return createdByEmail;
  }

  public void setCreatedByEmail(String createdByEmail) {
    this.createdByEmail = createdByEmail;
  }

  public BgpInfo createdByFullName(String createdByFullName) {
    this.createdByFullName = createdByFullName;
    return this;
  }

   /**
   * Get createdByFullName
   * @return createdByFullName
  **/
  @ApiModelProperty(value = "")
  public String getCreatedByFullName() {
    return createdByFullName;
  }

  public void setCreatedByFullName(String createdByFullName) {
    this.createdByFullName = createdByFullName;
  }

  public BgpInfo createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public BgpInfo deletedBy(String deletedBy) {
    this.deletedBy = deletedBy;
    return this;
  }

   /**
   * Get deletedBy
   * @return deletedBy
  **/
  @ApiModelProperty(value = "")
  public String getDeletedBy() {
    return deletedBy;
  }

  public void setDeletedBy(String deletedBy) {
    this.deletedBy = deletedBy;
  }

  public BgpInfo deletedByEmail(String deletedByEmail) {
    this.deletedByEmail = deletedByEmail;
    return this;
  }

   /**
   * Get deletedByEmail
   * @return deletedByEmail
  **/
  @ApiModelProperty(value = "")
  public String getDeletedByEmail() {
    return deletedByEmail;
  }

  public void setDeletedByEmail(String deletedByEmail) {
    this.deletedByEmail = deletedByEmail;
  }

  public BgpInfo deletedByFullName(String deletedByFullName) {
    this.deletedByFullName = deletedByFullName;
    return this;
  }

   /**
   * Get deletedByFullName
   * @return deletedByFullName
  **/
  @ApiModelProperty(value = "")
  public String getDeletedByFullName() {
    return deletedByFullName;
  }

  public void setDeletedByFullName(String deletedByFullName) {
    this.deletedByFullName = deletedByFullName;
  }

  public BgpInfo deletedDate(String deletedDate) {
    this.deletedDate = deletedDate;
    return this;
  }

   /**
   * Get deletedDate
   * @return deletedDate
  **/
  @ApiModelProperty(value = "")
  public String getDeletedDate() {
    return deletedDate;
  }

  public void setDeletedDate(String deletedDate) {
    this.deletedDate = deletedDate;
  }

  public BgpInfo lastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @ApiModelProperty(value = "")
  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public BgpInfo lastUpdatedByEmail(String lastUpdatedByEmail) {
    this.lastUpdatedByEmail = lastUpdatedByEmail;
    return this;
  }

   /**
   * Get lastUpdatedByEmail
   * @return lastUpdatedByEmail
  **/
  @ApiModelProperty(value = "")
  public String getLastUpdatedByEmail() {
    return lastUpdatedByEmail;
  }

  public void setLastUpdatedByEmail(String lastUpdatedByEmail) {
    this.lastUpdatedByEmail = lastUpdatedByEmail;
  }

  public BgpInfo lastUpdatedByFullName(String lastUpdatedByFullName) {
    this.lastUpdatedByFullName = lastUpdatedByFullName;
    return this;
  }

   /**
   * Get lastUpdatedByFullName
   * @return lastUpdatedByFullName
  **/
  @ApiModelProperty(value = "")
  public String getLastUpdatedByFullName() {
    return lastUpdatedByFullName;
  }

  public void setLastUpdatedByFullName(String lastUpdatedByFullName) {
    this.lastUpdatedByFullName = lastUpdatedByFullName;
  }

  public BgpInfo lastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(value = "")
  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public BgpInfo localAsn(Long localAsn) {
    this.localAsn = localAsn;
    return this;
  }

   /**
   * Get localAsn
   * @return localAsn
  **/
  @ApiModelProperty(value = "")
  public Long getLocalAsn() {
    return localAsn;
  }

  public void setLocalAsn(Long localAsn) {
    this.localAsn = localAsn;
  }

  public BgpInfo localIpAddress(String localIpAddress) {
    this.localIpAddress = localIpAddress;
    return this;
  }

   /**
   * Get localIpAddress
   * @return localIpAddress
  **/
  @ApiModelProperty(value = "")
  public String getLocalIpAddress() {
    return localIpAddress;
  }

  public void setLocalIpAddress(String localIpAddress) {
    this.localIpAddress = localIpAddress;
  }

  public BgpInfo provisioningStatus(String provisioningStatus) {
    this.provisioningStatus = provisioningStatus;
    return this;
  }

   /**
   * Get provisioningStatus
   * @return provisioningStatus
  **/
  @ApiModelProperty(value = "")
  public String getProvisioningStatus() {
    return provisioningStatus;
  }

  public void setProvisioningStatus(String provisioningStatus) {
    this.provisioningStatus = provisioningStatus;
  }

  public BgpInfo remoteAsn(Long remoteAsn) {
    this.remoteAsn = remoteAsn;
    return this;
  }

   /**
   * Get remoteAsn
   * @return remoteAsn
  **/
  @ApiModelProperty(value = "")
  public Long getRemoteAsn() {
    return remoteAsn;
  }

  public void setRemoteAsn(Long remoteAsn) {
    this.remoteAsn = remoteAsn;
  }

  public BgpInfo remoteIpAddress(String remoteIpAddress) {
    this.remoteIpAddress = remoteIpAddress;
    return this;
  }

   /**
   * Get remoteIpAddress
   * @return remoteIpAddress
  **/
  @ApiModelProperty(value = "")
  public String getRemoteIpAddress() {
    return remoteIpAddress;
  }

  public void setRemoteIpAddress(String remoteIpAddress) {
    this.remoteIpAddress = remoteIpAddress;
  }

  public BgpInfo state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public BgpInfo uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public BgpInfo virtualDeviceUUID(String virtualDeviceUUID) {
    this.virtualDeviceUUID = virtualDeviceUUID;
    return this;
  }

   /**
   * Get virtualDeviceUUID
   * @return virtualDeviceUUID
  **/
  @ApiModelProperty(value = "")
  public String getVirtualDeviceUUID() {
    return virtualDeviceUUID;
  }

  public void setVirtualDeviceUUID(String virtualDeviceUUID) {
    this.virtualDeviceUUID = virtualDeviceUUID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpInfo bgpInfo = (BgpInfo) o;
    return Objects.equals(this.authenticationKey, bgpInfo.authenticationKey) &&
        Objects.equals(this.connectionUUID, bgpInfo.connectionUUID) &&
        Objects.equals(this.createdBy, bgpInfo.createdBy) &&
        Objects.equals(this.createdByEmail, bgpInfo.createdByEmail) &&
        Objects.equals(this.createdByFullName, bgpInfo.createdByFullName) &&
        Objects.equals(this.createdDate, bgpInfo.createdDate) &&
        Objects.equals(this.deletedBy, bgpInfo.deletedBy) &&
        Objects.equals(this.deletedByEmail, bgpInfo.deletedByEmail) &&
        Objects.equals(this.deletedByFullName, bgpInfo.deletedByFullName) &&
        Objects.equals(this.deletedDate, bgpInfo.deletedDate) &&
        Objects.equals(this.lastUpdatedBy, bgpInfo.lastUpdatedBy) &&
        Objects.equals(this.lastUpdatedByEmail, bgpInfo.lastUpdatedByEmail) &&
        Objects.equals(this.lastUpdatedByFullName, bgpInfo.lastUpdatedByFullName) &&
        Objects.equals(this.lastUpdatedDate, bgpInfo.lastUpdatedDate) &&
        Objects.equals(this.localAsn, bgpInfo.localAsn) &&
        Objects.equals(this.localIpAddress, bgpInfo.localIpAddress) &&
        Objects.equals(this.provisioningStatus, bgpInfo.provisioningStatus) &&
        Objects.equals(this.remoteAsn, bgpInfo.remoteAsn) &&
        Objects.equals(this.remoteIpAddress, bgpInfo.remoteIpAddress) &&
        Objects.equals(this.state, bgpInfo.state) &&
        Objects.equals(this.uuid, bgpInfo.uuid) &&
        Objects.equals(this.virtualDeviceUUID, bgpInfo.virtualDeviceUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationKey, connectionUUID, createdBy, createdByEmail, createdByFullName, createdDate, deletedBy, deletedByEmail, deletedByFullName, deletedDate, lastUpdatedBy, lastUpdatedByEmail, lastUpdatedByFullName, lastUpdatedDate, localAsn, localIpAddress, provisioningStatus, remoteAsn, remoteIpAddress, state, uuid, virtualDeviceUUID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpInfo {\n");
    
    sb.append("    authenticationKey: ").append(toIndentedString(authenticationKey)).append("\n");
    sb.append("    connectionUUID: ").append(toIndentedString(connectionUUID)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdByEmail: ").append(toIndentedString(createdByEmail)).append("\n");
    sb.append("    createdByFullName: ").append(toIndentedString(createdByFullName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    deletedByEmail: ").append(toIndentedString(deletedByEmail)).append("\n");
    sb.append("    deletedByFullName: ").append(toIndentedString(deletedByFullName)).append("\n");
    sb.append("    deletedDate: ").append(toIndentedString(deletedDate)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    lastUpdatedByEmail: ").append(toIndentedString(lastUpdatedByEmail)).append("\n");
    sb.append("    lastUpdatedByFullName: ").append(toIndentedString(lastUpdatedByFullName)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    localAsn: ").append(toIndentedString(localAsn)).append("\n");
    sb.append("    localIpAddress: ").append(toIndentedString(localIpAddress)).append("\n");
    sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
    sb.append("    remoteAsn: ").append(toIndentedString(remoteAsn)).append("\n");
    sb.append("    remoteIpAddress: ").append(toIndentedString(remoteIpAddress)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    virtualDeviceUUID: ").append(toIndentedString(virtualDeviceUUID)).append("\n");
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

