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
import com.equinix.networkedge.model.GetServProfServicesRespContentMetros;
import com.equinix.networkedge.model.GetServProfServicesRespContentfeatures;
import com.equinix.networkedge.model.SpeedBand;

import java.util.ArrayList;
import java.util.List;

/**
 * GetServProfServicesRespContent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class GetServProfServicesRespContent {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("authKeyLabel")
  private String authKeyLabel = null;

  @SerializedName("connectionNameLabel")
  private String connectionNameLabel = null;

  @SerializedName("requiredRedundancy")
  private Boolean requiredRedundancy = null;

  @SerializedName("allowCustomSpeed")
  private Boolean allowCustomSpeed = null;

  @SerializedName("speedBands")
  private List<SpeedBand> speedBands = null;

  @SerializedName("metros")
  private GetServProfServicesRespContentMetros metros = null;

  @SerializedName("createdDate")
  private String createdDate = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("lastUpdatedDate")
  private String lastUpdatedDate = null;

  @SerializedName("lastUpdatedBy")
  private String lastUpdatedBy = null;

  @SerializedName("vlanSameAsPrimary")
  private Boolean vlanSameAsPrimary = null;

  @SerializedName("tagType")
  private String tagType = null;

  @SerializedName("ctagLabel")
  private String ctagLabel = null;

  @SerializedName("apiAvailable")
  private Boolean apiAvailable = null;

  @SerializedName("selfProfile")
  private Boolean selfProfile = null;

  @SerializedName("profileEncapsulation")
  private String profileEncapsulation = null;

  @SerializedName("authorizationKey")
  private String authorizationKey = null;

  @SerializedName("organizationName")
  private String organizationName = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("features")
  private GetServProfServicesRespContentfeatures features = null;

  public GetServProfServicesRespContent uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(example = "xxxxx191-xx70-xxxx-xx04-xxxxxxxa37xx", value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public GetServProfServicesRespContent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "test", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetServProfServicesRespContent authKeyLabel(String authKeyLabel) {
    this.authKeyLabel = authKeyLabel;
    return this;
  }

   /**
   * Get authKeyLabel
   * @return authKeyLabel
  **/
  @ApiModelProperty(example = "Authorization Key", value = "")
  public String getAuthKeyLabel() {
    return authKeyLabel;
  }

  public void setAuthKeyLabel(String authKeyLabel) {
    this.authKeyLabel = authKeyLabel;
  }

  public GetServProfServicesRespContent connectionNameLabel(String connectionNameLabel) {
    this.connectionNameLabel = connectionNameLabel;
    return this;
  }

   /**
   * Get connectionNameLabel
   * @return connectionNameLabel
  **/
  @ApiModelProperty(example = "Connection Name", value = "")
  public String getConnectionNameLabel() {
    return connectionNameLabel;
  }

  public void setConnectionNameLabel(String connectionNameLabel) {
    this.connectionNameLabel = connectionNameLabel;
  }

  public GetServProfServicesRespContent requiredRedundancy(Boolean requiredRedundancy) {
    this.requiredRedundancy = requiredRedundancy;
    return this;
  }

   /**
   * Get requiredRedundancy
   * @return requiredRedundancy
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isRequiredRedundancy() {
    return requiredRedundancy;
  }

  public void setRequiredRedundancy(Boolean requiredRedundancy) {
    this.requiredRedundancy = requiredRedundancy;
  }

  public GetServProfServicesRespContent allowCustomSpeed(Boolean allowCustomSpeed) {
    this.allowCustomSpeed = allowCustomSpeed;
    return this;
  }

   /**
   * Get allowCustomSpeed
   * @return allowCustomSpeed
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isAllowCustomSpeed() {
    return allowCustomSpeed;
  }

  public void setAllowCustomSpeed(Boolean allowCustomSpeed) {
    this.allowCustomSpeed = allowCustomSpeed;
  }

  public GetServProfServicesRespContent speedBands(List<SpeedBand> speedBands) {
    this.speedBands = speedBands;
    return this;
  }

  public GetServProfServicesRespContent addSpeedBandsItem(SpeedBand speedBandsItem) {
    if (this.speedBands == null) {
      this.speedBands = new ArrayList<SpeedBand>();
    }
    this.speedBands.add(speedBandsItem);
    return this;
  }

   /**
   * Get speedBands
   * @return speedBands
  **/
  @ApiModelProperty(value = "")
  public List<SpeedBand> getSpeedBands() {
    return speedBands;
  }

  public void setSpeedBands(List<SpeedBand> speedBands) {
    this.speedBands = speedBands;
  }

  public GetServProfServicesRespContent metros(GetServProfServicesRespContentMetros metros) {
    this.metros = metros;
    return this;
  }

   /**
   * Get metros
   * @return metros
  **/
  @ApiModelProperty(value = "")
  public GetServProfServicesRespContentMetros getMetros() {
    return metros;
  }

  public void setMetros(GetServProfServicesRespContentMetros metros) {
    this.metros = metros;
  }

  public GetServProfServicesRespContent createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(example = "2018-03-22T04:34:48.231Z", value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public GetServProfServicesRespContent createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(example = "Sandbox User", value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public GetServProfServicesRespContent lastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(example = "2018-04-03T00:30:57.055Z", value = "")
  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public GetServProfServicesRespContent lastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @ApiModelProperty(example = "Sandbox User", value = "")
  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public GetServProfServicesRespContent vlanSameAsPrimary(Boolean vlanSameAsPrimary) {
    this.vlanSameAsPrimary = vlanSameAsPrimary;
    return this;
  }

   /**
   * Get vlanSameAsPrimary
   * @return vlanSameAsPrimary
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isVlanSameAsPrimary() {
    return vlanSameAsPrimary;
  }

  public void setVlanSameAsPrimary(Boolean vlanSameAsPrimary) {
    this.vlanSameAsPrimary = vlanSameAsPrimary;
  }

  public GetServProfServicesRespContent tagType(String tagType) {
    this.tagType = tagType;
    return this;
  }

   /**
   * Get tagType
   * @return tagType
  **/
  @ApiModelProperty(example = "CTAGED", value = "")
  public String getTagType() {
    return tagType;
  }

  public void setTagType(String tagType) {
    this.tagType = tagType;
  }

  public GetServProfServicesRespContent ctagLabel(String ctagLabel) {
    this.ctagLabel = ctagLabel;
    return this;
  }

   /**
   * Get ctagLabel
   * @return ctagLabel
  **/
  @ApiModelProperty(example = "Seller-Side C-Tag", value = "")
  public String getCtagLabel() {
    return ctagLabel;
  }

  public void setCtagLabel(String ctagLabel) {
    this.ctagLabel = ctagLabel;
  }

  public GetServProfServicesRespContent apiAvailable(Boolean apiAvailable) {
    this.apiAvailable = apiAvailable;
    return this;
  }

   /**
   * Get apiAvailable
   * @return apiAvailable
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isApiAvailable() {
    return apiAvailable;
  }

  public void setApiAvailable(Boolean apiAvailable) {
    this.apiAvailable = apiAvailable;
  }

  public GetServProfServicesRespContent selfProfile(Boolean selfProfile) {
    this.selfProfile = selfProfile;
    return this;
  }

   /**
   * Get selfProfile
   * @return selfProfile
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isSelfProfile() {
    return selfProfile;
  }

  public void setSelfProfile(Boolean selfProfile) {
    this.selfProfile = selfProfile;
  }

  public GetServProfServicesRespContent profileEncapsulation(String profileEncapsulation) {
    this.profileEncapsulation = profileEncapsulation;
    return this;
  }

   /**
   * Get profileEncapsulation
   * @return profileEncapsulation
  **/
  @ApiModelProperty(example = "Dot1q", value = "")
  public String getProfileEncapsulation() {
    return profileEncapsulation;
  }

  public void setProfileEncapsulation(String profileEncapsulation) {
    this.profileEncapsulation = profileEncapsulation;
  }

  public GetServProfServicesRespContent authorizationKey(String authorizationKey) {
    this.authorizationKey = authorizationKey;
    return this;
  }

   /**
   * Get authorizationKey
   * @return authorizationKey
  **/
  @ApiModelProperty(example = "535235", value = "")
  public String getAuthorizationKey() {
    return authorizationKey;
  }

  public void setAuthorizationKey(String authorizationKey) {
    this.authorizationKey = authorizationKey;
  }

  public GetServProfServicesRespContent organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Get organizationName
   * @return organizationName
  **/
  @ApiModelProperty(example = "Equinix-ADMIN", value = "")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public GetServProfServicesRespContent _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public GetServProfServicesRespContent features(GetServProfServicesRespContentfeatures features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public GetServProfServicesRespContentfeatures getFeatures() {
    return features;
  }

  public void setFeatures(GetServProfServicesRespContentfeatures features) {
    this.features = features;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetServProfServicesRespContent getServProfServicesRespContent = (GetServProfServicesRespContent) o;
    return Objects.equals(this.uuid, getServProfServicesRespContent.uuid) &&
        Objects.equals(this.name, getServProfServicesRespContent.name) &&
        Objects.equals(this.authKeyLabel, getServProfServicesRespContent.authKeyLabel) &&
        Objects.equals(this.connectionNameLabel, getServProfServicesRespContent.connectionNameLabel) &&
        Objects.equals(this.requiredRedundancy, getServProfServicesRespContent.requiredRedundancy) &&
        Objects.equals(this.allowCustomSpeed, getServProfServicesRespContent.allowCustomSpeed) &&
        Objects.equals(this.speedBands, getServProfServicesRespContent.speedBands) &&
        Objects.equals(this.metros, getServProfServicesRespContent.metros) &&
        Objects.equals(this.createdDate, getServProfServicesRespContent.createdDate) &&
        Objects.equals(this.createdBy, getServProfServicesRespContent.createdBy) &&
        Objects.equals(this.lastUpdatedDate, getServProfServicesRespContent.lastUpdatedDate) &&
        Objects.equals(this.lastUpdatedBy, getServProfServicesRespContent.lastUpdatedBy) &&
        Objects.equals(this.vlanSameAsPrimary, getServProfServicesRespContent.vlanSameAsPrimary) &&
        Objects.equals(this.tagType, getServProfServicesRespContent.tagType) &&
        Objects.equals(this.ctagLabel, getServProfServicesRespContent.ctagLabel) &&
        Objects.equals(this.apiAvailable, getServProfServicesRespContent.apiAvailable) &&
        Objects.equals(this.selfProfile, getServProfServicesRespContent.selfProfile) &&
        Objects.equals(this.profileEncapsulation, getServProfServicesRespContent.profileEncapsulation) &&
        Objects.equals(this.authorizationKey, getServProfServicesRespContent.authorizationKey) &&
        Objects.equals(this.organizationName, getServProfServicesRespContent.organizationName) &&
        Objects.equals(this._private, getServProfServicesRespContent._private) &&
        Objects.equals(this.features, getServProfServicesRespContent.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, authKeyLabel, connectionNameLabel, requiredRedundancy, allowCustomSpeed, speedBands, metros, createdDate, createdBy, lastUpdatedDate, lastUpdatedBy, vlanSameAsPrimary, tagType, ctagLabel, apiAvailable, selfProfile, profileEncapsulation, authorizationKey, organizationName, _private, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServProfServicesRespContent {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authKeyLabel: ").append(toIndentedString(authKeyLabel)).append("\n");
    sb.append("    connectionNameLabel: ").append(toIndentedString(connectionNameLabel)).append("\n");
    sb.append("    requiredRedundancy: ").append(toIndentedString(requiredRedundancy)).append("\n");
    sb.append("    allowCustomSpeed: ").append(toIndentedString(allowCustomSpeed)).append("\n");
    sb.append("    speedBands: ").append(toIndentedString(speedBands)).append("\n");
    sb.append("    metros: ").append(toIndentedString(metros)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    vlanSameAsPrimary: ").append(toIndentedString(vlanSameAsPrimary)).append("\n");
    sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
    sb.append("    ctagLabel: ").append(toIndentedString(ctagLabel)).append("\n");
    sb.append("    apiAvailable: ").append(toIndentedString(apiAvailable)).append("\n");
    sb.append("    selfProfile: ").append(toIndentedString(selfProfile)).append("\n");
    sb.append("    profileEncapsulation: ").append(toIndentedString(profileEncapsulation)).append("\n");
    sb.append("    authorizationKey: ").append(toIndentedString(authorizationKey)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

