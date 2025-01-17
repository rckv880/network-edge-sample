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
import com.equinix.networkedge.model.MetroStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SshUserInfoVerbose
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class SshUserInfoVerbose {
  @SerializedName("deviceUuids")
  private List<String> deviceUuids = null;

  @SerializedName("metroStatusMap")
  private Map<String, MetroStatus> metroStatusMap = null;

  @SerializedName("metros")
  private List<String> metros = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("uuid")
  private String uuid = null;

  public SshUserInfoVerbose deviceUuids(List<String> deviceUuids) {
    this.deviceUuids = deviceUuids;
    return this;
  }

  public SshUserInfoVerbose addDeviceUuidsItem(String deviceUuidsItem) {
    if (this.deviceUuids == null) {
      this.deviceUuids = new ArrayList<String>();
    }
    this.deviceUuids.add(deviceUuidsItem);
    return this;
  }

   /**
   * Set of uuids of the devices associated with this user
   * @return deviceUuids
  **/
  @ApiModelProperty(value = "Set of uuids of the devices associated with this user")
  public List<String> getDeviceUuids() {
    return deviceUuids;
  }

  public void setDeviceUuids(List<String> deviceUuids) {
    this.deviceUuids = deviceUuids;
  }

  public SshUserInfoVerbose metroStatusMap(Map<String, MetroStatus> metroStatusMap) {
    this.metroStatusMap = metroStatusMap;
    return this;
  }

  public SshUserInfoVerbose putMetroStatusMapItem(String key, MetroStatus metroStatusMapItem) {
    if (this.metroStatusMap == null) {
      this.metroStatusMap = new HashMap<String, MetroStatus>();
    }
    this.metroStatusMap.put(key, metroStatusMapItem);
    return this;
  }

   /**
   * Status and error messages corresponding to the metros this user exists on
   * @return metroStatusMap
  **/
  @ApiModelProperty(value = "Status and error messages corresponding to the metros this user exists on")
  public Map<String, MetroStatus> getMetroStatusMap() {
    return metroStatusMap;
  }

  public void setMetroStatusMap(Map<String, MetroStatus> metroStatusMap) {
    this.metroStatusMap = metroStatusMap;
  }

  public SshUserInfoVerbose metros(List<String> metros) {
    this.metros = metros;
    return this;
  }

  public SshUserInfoVerbose addMetrosItem(String metrosItem) {
    if (this.metros == null) {
      this.metros = new ArrayList<String>();
    }
    this.metros.add(metrosItem);
    return this;
  }

   /**
   * Set of metros this user exists on
   * @return metros
  **/
  @ApiModelProperty(value = "Set of metros this user exists on")
  public List<String> getMetros() {
    return metros;
  }

  public void setMetros(List<String> metros) {
    this.metros = metros;
  }

  public SshUserInfoVerbose username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SshUserInfoVerbose uuid(String uuid) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SshUserInfoVerbose sshUserInfoVerbose = (SshUserInfoVerbose) o;
    return Objects.equals(this.deviceUuids, sshUserInfoVerbose.deviceUuids) &&
        Objects.equals(this.metroStatusMap, sshUserInfoVerbose.metroStatusMap) &&
        Objects.equals(this.metros, sshUserInfoVerbose.metros) &&
        Objects.equals(this.username, sshUserInfoVerbose.username) &&
        Objects.equals(this.uuid, sshUserInfoVerbose.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceUuids, metroStatusMap, metros, username, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SshUserInfoVerbose {\n");
    
    sb.append("    deviceUuids: ").append(toIndentedString(deviceUuids)).append("\n");
    sb.append("    metroStatusMap: ").append(toIndentedString(metroStatusMap)).append("\n");
    sb.append("    metros: ").append(toIndentedString(metros)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

