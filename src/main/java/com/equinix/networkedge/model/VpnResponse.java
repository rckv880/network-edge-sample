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
 * VpnResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class VpnResponse {
  @SerializedName("siteName")
  private String siteName = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("virtualDeviceUUID")
  private String virtualDeviceUUID = null;

  @SerializedName("configName")
  private String configName = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("peerIp")
  private String peerIp = null;

  @SerializedName("peerSharedKey")
  private String peerSharedKey = null;

  @SerializedName("remoteAsn")
  private Long remoteAsn = null;

  @SerializedName("remoteIpAddress")
  private String remoteIpAddress = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("localAsn")
  private Long localAsn = null;

  @SerializedName("tunnelIp")
  private String tunnelIp = null;

  @SerializedName("bgpState")
  private String bgpState = null;

  @SerializedName("inboundBytes")
  private String inboundBytes = null;

  @SerializedName("inboundPackets")
  private String inboundPackets = null;

  @SerializedName("outboundBytes")
  private String outboundBytes = null;

  @SerializedName("outboundPackets")
  private String outboundPackets = null;

  @SerializedName("tunnelStatus")
  private String tunnelStatus = null;

  @SerializedName("custOrgId")
  private Long custOrgId = null;

  @SerializedName("createdDate")
  private String createdDate = null;

  @SerializedName("createdByFirstName")
  private String createdByFirstName = null;

  @SerializedName("createdByLastName")
  private String createdByLastName = null;

  @SerializedName("createdByEmail")
  private String createdByEmail = null;

  @SerializedName("createdByUserKey")
  private Long createdByUserKey = null;

  @SerializedName("createdByAccountUcmId")
  private Long createdByAccountUcmId = null;

  @SerializedName("createdByUserName")
  private String createdByUserName = null;

  @SerializedName("createdByCustOrgId")
  private Long createdByCustOrgId = null;

  @SerializedName("createdByCustOrgName")
  private String createdByCustOrgName = null;

  @SerializedName("createdByUserStatus")
  private String createdByUserStatus = null;

  @SerializedName("createdByCompanyName")
  private String createdByCompanyName = null;

  @SerializedName("lastUpdatedDate")
  private String lastUpdatedDate = null;

  @SerializedName("updatedByFirstName")
  private String updatedByFirstName = null;

  @SerializedName("updatedByLastName")
  private String updatedByLastName = null;

  @SerializedName("updatedByEmail")
  private String updatedByEmail = null;

  @SerializedName("updatedByUserKey")
  private Long updatedByUserKey = null;

  @SerializedName("updatedByAccountUcmId")
  private Long updatedByAccountUcmId = null;

  @SerializedName("updatedByUserName")
  private String updatedByUserName = null;

  @SerializedName("updatedByCustOrgId")
  private Long updatedByCustOrgId = null;

  @SerializedName("updatedByCustOrgName")
  private String updatedByCustOrgName = null;

  @SerializedName("updatedByUserStatus")
  private String updatedByUserStatus = null;

  @SerializedName("updatedByCompanyName")
  private String updatedByCompanyName = null;

  public VpnResponse siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

   /**
   * Get siteName
   * @return siteName
  **/
  @ApiModelProperty(example = "Chicago", required = true, value = "")
  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public VpnResponse uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(example = "877a3aa2-c49a-4af1-98a6-007424e737ae", value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public VpnResponse virtualDeviceUUID(String virtualDeviceUUID) {
    this.virtualDeviceUUID = virtualDeviceUUID;
    return this;
  }

   /**
   * Get virtualDeviceUUID
   * @return virtualDeviceUUID
  **/
  @ApiModelProperty(example = "f79eead8-b837-41d3-9095-9b15c2c4996d", required = true, value = "")
  public String getVirtualDeviceUUID() {
    return virtualDeviceUUID;
  }

  public void setVirtualDeviceUUID(String virtualDeviceUUID) {
    this.virtualDeviceUUID = virtualDeviceUUID;
  }

  public VpnResponse configName(String configName) {
    this.configName = configName;
    return this;
  }

   /**
   * Get configName
   * @return configName
  **/
  @ApiModelProperty(example = "Traffic from AWS cloud", value = "")
  public String getConfigName() {
    return configName;
  }

  public void setConfigName(String configName) {
    this.configName = configName;
  }

  public VpnResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "PROVISIONED", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public VpnResponse peerIp(String peerIp) {
    this.peerIp = peerIp;
    return this;
  }

   /**
   * Get peerIp
   * @return peerIp
  **/
  @ApiModelProperty(example = "110.11.12.222", required = true, value = "")
  public String getPeerIp() {
    return peerIp;
  }

  public void setPeerIp(String peerIp) {
    this.peerIp = peerIp;
  }

  public VpnResponse peerSharedKey(String peerSharedKey) {
    this.peerSharedKey = peerSharedKey;
    return this;
  }

   /**
   * Get peerSharedKey
   * @return peerSharedKey
  **/
  @ApiModelProperty(example = "5bb2424e888bd", required = true, value = "")
  public String getPeerSharedKey() {
    return peerSharedKey;
  }

  public void setPeerSharedKey(String peerSharedKey) {
    this.peerSharedKey = peerSharedKey;
  }

  public VpnResponse remoteAsn(Long remoteAsn) {
    this.remoteAsn = remoteAsn;
    return this;
  }

   /**
   * Remote Customer ASN - Customer side
   * @return remoteAsn
  **/
  @ApiModelProperty(example = "65413", required = true, value = "Remote Customer ASN - Customer side")
  public Long getRemoteAsn() {
    return remoteAsn;
  }

  public void setRemoteAsn(Long remoteAsn) {
    this.remoteAsn = remoteAsn;
  }

  public VpnResponse remoteIpAddress(String remoteIpAddress) {
    this.remoteIpAddress = remoteIpAddress;
    return this;
  }

   /**
   * Remote Customer IP Address - Customer side
   * @return remoteIpAddress
  **/
  @ApiModelProperty(example = "100.210.1.31", required = true, value = "Remote Customer IP Address - Customer side")
  public String getRemoteIpAddress() {
    return remoteIpAddress;
  }

  public void setRemoteIpAddress(String remoteIpAddress) {
    this.remoteIpAddress = remoteIpAddress;
  }

  public VpnResponse password(String password) {
    this.password = password;
    return this;
  }

   /**
   * BGP Password
   * @return password
  **/
  @ApiModelProperty(example = "pass123", required = true, value = "BGP Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public VpnResponse localAsn(Long localAsn) {
    this.localAsn = localAsn;
    return this;
  }

   /**
   * Local ASN - Equinix side
   * @return localAsn
  **/
  @ApiModelProperty(example = "65414", value = "Local ASN - Equinix side")
  public Long getLocalAsn() {
    return localAsn;
  }

  public void setLocalAsn(Long localAsn) {
    this.localAsn = localAsn;
  }

  public VpnResponse tunnelIp(String tunnelIp) {
    this.tunnelIp = tunnelIp;
    return this;
  }

   /**
   * Local Tunnel IP Address in CIDR format
   * @return tunnelIp
  **/
  @ApiModelProperty(example = "192.168.7.2/30", required = true, value = "Local Tunnel IP Address in CIDR format")
  public String getTunnelIp() {
    return tunnelIp;
  }

  public void setTunnelIp(String tunnelIp) {
    this.tunnelIp = tunnelIp;
  }

  public VpnResponse bgpState(String bgpState) {
    this.bgpState = bgpState;
    return this;
  }

   /**
   * Get bgpState
   * @return bgpState
  **/
  @ApiModelProperty(example = "ESTABLISHED", value = "")
  public String getBgpState() {
    return bgpState;
  }

  public void setBgpState(String bgpState) {
    this.bgpState = bgpState;
  }

  public VpnResponse inboundBytes(String inboundBytes) {
    this.inboundBytes = inboundBytes;
    return this;
  }

   /**
   * Get inboundBytes
   * @return inboundBytes
  **/
  @ApiModelProperty(example = "8780", value = "")
  public String getInboundBytes() {
    return inboundBytes;
  }

  public void setInboundBytes(String inboundBytes) {
    this.inboundBytes = inboundBytes;
  }

  public VpnResponse inboundPackets(String inboundPackets) {
    this.inboundPackets = inboundPackets;
    return this;
  }

   /**
   * Get inboundPackets
   * @return inboundPackets
  **/
  @ApiModelProperty(example = "8780", value = "")
  public String getInboundPackets() {
    return inboundPackets;
  }

  public void setInboundPackets(String inboundPackets) {
    this.inboundPackets = inboundPackets;
  }

  public VpnResponse outboundBytes(String outboundBytes) {
    this.outboundBytes = outboundBytes;
    return this;
  }

   /**
   * Get outboundBytes
   * @return outboundBytes
  **/
  @ApiModelProperty(example = "8765", value = "")
  public String getOutboundBytes() {
    return outboundBytes;
  }

  public void setOutboundBytes(String outboundBytes) {
    this.outboundBytes = outboundBytes;
  }

  public VpnResponse outboundPackets(String outboundPackets) {
    this.outboundPackets = outboundPackets;
    return this;
  }

   /**
   * Get outboundPackets
   * @return outboundPackets
  **/
  @ApiModelProperty(example = "8765", value = "")
  public String getOutboundPackets() {
    return outboundPackets;
  }

  public void setOutboundPackets(String outboundPackets) {
    this.outboundPackets = outboundPackets;
  }

  public VpnResponse tunnelStatus(String tunnelStatus) {
    this.tunnelStatus = tunnelStatus;
    return this;
  }

   /**
   * Get tunnelStatus
   * @return tunnelStatus
  **/
  @ApiModelProperty(example = "UP", value = "")
  public String getTunnelStatus() {
    return tunnelStatus;
  }

  public void setTunnelStatus(String tunnelStatus) {
    this.tunnelStatus = tunnelStatus;
  }

  public VpnResponse custOrgId(Long custOrgId) {
    this.custOrgId = custOrgId;
    return this;
  }

   /**
   * Get custOrgId
   * @return custOrgId
  **/
  @ApiModelProperty(example = "65555", value = "")
  public Long getCustOrgId() {
    return custOrgId;
  }

  public void setCustOrgId(Long custOrgId) {
    this.custOrgId = custOrgId;
  }

  public VpnResponse createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(example = "2018-05-18 06:34:26", value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public VpnResponse createdByFirstName(String createdByFirstName) {
    this.createdByFirstName = createdByFirstName;
    return this;
  }

   /**
   * Get createdByFirstName
   * @return createdByFirstName
  **/
  @ApiModelProperty(example = "John", value = "")
  public String getCreatedByFirstName() {
    return createdByFirstName;
  }

  public void setCreatedByFirstName(String createdByFirstName) {
    this.createdByFirstName = createdByFirstName;
  }

  public VpnResponse createdByLastName(String createdByLastName) {
    this.createdByLastName = createdByLastName;
    return this;
  }

   /**
   * Get createdByLastName
   * @return createdByLastName
  **/
  @ApiModelProperty(example = "Smith", value = "")
  public String getCreatedByLastName() {
    return createdByLastName;
  }

  public void setCreatedByLastName(String createdByLastName) {
    this.createdByLastName = createdByLastName;
  }

  public VpnResponse createdByEmail(String createdByEmail) {
    this.createdByEmail = createdByEmail;
    return this;
  }

   /**
   * Get createdByEmail
   * @return createdByEmail
  **/
  @ApiModelProperty(example = "alpha@beta.com", value = "")
  public String getCreatedByEmail() {
    return createdByEmail;
  }

  public void setCreatedByEmail(String createdByEmail) {
    this.createdByEmail = createdByEmail;
  }

  public VpnResponse createdByUserKey(Long createdByUserKey) {
    this.createdByUserKey = createdByUserKey;
    return this;
  }

   /**
   * Get createdByUserKey
   * @return createdByUserKey
  **/
  @ApiModelProperty(example = "123", value = "")
  public Long getCreatedByUserKey() {
    return createdByUserKey;
  }

  public void setCreatedByUserKey(Long createdByUserKey) {
    this.createdByUserKey = createdByUserKey;
  }

  public VpnResponse createdByAccountUcmId(Long createdByAccountUcmId) {
    this.createdByAccountUcmId = createdByAccountUcmId;
    return this;
  }

   /**
   * Get createdByAccountUcmId
   * @return createdByAccountUcmId
  **/
  @ApiModelProperty(example = "456", value = "")
  public Long getCreatedByAccountUcmId() {
    return createdByAccountUcmId;
  }

  public void setCreatedByAccountUcmId(Long createdByAccountUcmId) {
    this.createdByAccountUcmId = createdByAccountUcmId;
  }

  public VpnResponse createdByUserName(String createdByUserName) {
    this.createdByUserName = createdByUserName;
    return this;
  }

   /**
   * Get createdByUserName
   * @return createdByUserName
  **/
  @ApiModelProperty(example = "jsmith", value = "")
  public String getCreatedByUserName() {
    return createdByUserName;
  }

  public void setCreatedByUserName(String createdByUserName) {
    this.createdByUserName = createdByUserName;
  }

  public VpnResponse createdByCustOrgId(Long createdByCustOrgId) {
    this.createdByCustOrgId = createdByCustOrgId;
    return this;
  }

   /**
   * Get createdByCustOrgId
   * @return createdByCustOrgId
  **/
  @ApiModelProperty(example = "7863", value = "")
  public Long getCreatedByCustOrgId() {
    return createdByCustOrgId;
  }

  public void setCreatedByCustOrgId(Long createdByCustOrgId) {
    this.createdByCustOrgId = createdByCustOrgId;
  }

  public VpnResponse createdByCustOrgName(String createdByCustOrgName) {
    this.createdByCustOrgName = createdByCustOrgName;
    return this;
  }

   /**
   * Get createdByCustOrgName
   * @return createdByCustOrgName
  **/
  @ApiModelProperty(example = "My Awesome Org", value = "")
  public String getCreatedByCustOrgName() {
    return createdByCustOrgName;
  }

  public void setCreatedByCustOrgName(String createdByCustOrgName) {
    this.createdByCustOrgName = createdByCustOrgName;
  }

  public VpnResponse createdByUserStatus(String createdByUserStatus) {
    this.createdByUserStatus = createdByUserStatus;
    return this;
  }

   /**
   * Get createdByUserStatus
   * @return createdByUserStatus
  **/
  @ApiModelProperty(example = "ACTIVATED", value = "")
  public String getCreatedByUserStatus() {
    return createdByUserStatus;
  }

  public void setCreatedByUserStatus(String createdByUserStatus) {
    this.createdByUserStatus = createdByUserStatus;
  }

  public VpnResponse createdByCompanyName(String createdByCompanyName) {
    this.createdByCompanyName = createdByCompanyName;
    return this;
  }

   /**
   * Get createdByCompanyName
   * @return createdByCompanyName
  **/
  @ApiModelProperty(example = "My Awesome Company", value = "")
  public String getCreatedByCompanyName() {
    return createdByCompanyName;
  }

  public void setCreatedByCompanyName(String createdByCompanyName) {
    this.createdByCompanyName = createdByCompanyName;
  }

  public VpnResponse lastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(example = "2018-07-21 05:20:20", value = "")
  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public VpnResponse updatedByFirstName(String updatedByFirstName) {
    this.updatedByFirstName = updatedByFirstName;
    return this;
  }

   /**
   * Get updatedByFirstName
   * @return updatedByFirstName
  **/
  @ApiModelProperty(example = "John", value = "")
  public String getUpdatedByFirstName() {
    return updatedByFirstName;
  }

  public void setUpdatedByFirstName(String updatedByFirstName) {
    this.updatedByFirstName = updatedByFirstName;
  }

  public VpnResponse updatedByLastName(String updatedByLastName) {
    this.updatedByLastName = updatedByLastName;
    return this;
  }

   /**
   * Get updatedByLastName
   * @return updatedByLastName
  **/
  @ApiModelProperty(example = "Smith", value = "")
  public String getUpdatedByLastName() {
    return updatedByLastName;
  }

  public void setUpdatedByLastName(String updatedByLastName) {
    this.updatedByLastName = updatedByLastName;
  }

  public VpnResponse updatedByEmail(String updatedByEmail) {
    this.updatedByEmail = updatedByEmail;
    return this;
  }

   /**
   * Get updatedByEmail
   * @return updatedByEmail
  **/
  @ApiModelProperty(example = "alpha@beta.com", value = "")
  public String getUpdatedByEmail() {
    return updatedByEmail;
  }

  public void setUpdatedByEmail(String updatedByEmail) {
    this.updatedByEmail = updatedByEmail;
  }

  public VpnResponse updatedByUserKey(Long updatedByUserKey) {
    this.updatedByUserKey = updatedByUserKey;
    return this;
  }

   /**
   * Get updatedByUserKey
   * @return updatedByUserKey
  **/
  @ApiModelProperty(example = "123", value = "")
  public Long getUpdatedByUserKey() {
    return updatedByUserKey;
  }

  public void setUpdatedByUserKey(Long updatedByUserKey) {
    this.updatedByUserKey = updatedByUserKey;
  }

  public VpnResponse updatedByAccountUcmId(Long updatedByAccountUcmId) {
    this.updatedByAccountUcmId = updatedByAccountUcmId;
    return this;
  }

   /**
   * Get updatedByAccountUcmId
   * @return updatedByAccountUcmId
  **/
  @ApiModelProperty(example = "456", value = "")
  public Long getUpdatedByAccountUcmId() {
    return updatedByAccountUcmId;
  }

  public void setUpdatedByAccountUcmId(Long updatedByAccountUcmId) {
    this.updatedByAccountUcmId = updatedByAccountUcmId;
  }

  public VpnResponse updatedByUserName(String updatedByUserName) {
    this.updatedByUserName = updatedByUserName;
    return this;
  }

   /**
   * Get updatedByUserName
   * @return updatedByUserName
  **/
  @ApiModelProperty(example = "jsmith", value = "")
  public String getUpdatedByUserName() {
    return updatedByUserName;
  }

  public void setUpdatedByUserName(String updatedByUserName) {
    this.updatedByUserName = updatedByUserName;
  }

  public VpnResponse updatedByCustOrgId(Long updatedByCustOrgId) {
    this.updatedByCustOrgId = updatedByCustOrgId;
    return this;
  }

   /**
   * Get updatedByCustOrgId
   * @return updatedByCustOrgId
  **/
  @ApiModelProperty(example = "7863", value = "")
  public Long getUpdatedByCustOrgId() {
    return updatedByCustOrgId;
  }

  public void setUpdatedByCustOrgId(Long updatedByCustOrgId) {
    this.updatedByCustOrgId = updatedByCustOrgId;
  }

  public VpnResponse updatedByCustOrgName(String updatedByCustOrgName) {
    this.updatedByCustOrgName = updatedByCustOrgName;
    return this;
  }

   /**
   * Get updatedByCustOrgName
   * @return updatedByCustOrgName
  **/
  @ApiModelProperty(example = "My Awesome Org", value = "")
  public String getUpdatedByCustOrgName() {
    return updatedByCustOrgName;
  }

  public void setUpdatedByCustOrgName(String updatedByCustOrgName) {
    this.updatedByCustOrgName = updatedByCustOrgName;
  }

  public VpnResponse updatedByUserStatus(String updatedByUserStatus) {
    this.updatedByUserStatus = updatedByUserStatus;
    return this;
  }

   /**
   * Get updatedByUserStatus
   * @return updatedByUserStatus
  **/
  @ApiModelProperty(example = "ACTIVATED", value = "")
  public String getUpdatedByUserStatus() {
    return updatedByUserStatus;
  }

  public void setUpdatedByUserStatus(String updatedByUserStatus) {
    this.updatedByUserStatus = updatedByUserStatus;
  }

  public VpnResponse updatedByCompanyName(String updatedByCompanyName) {
    this.updatedByCompanyName = updatedByCompanyName;
    return this;
  }

   /**
   * Get updatedByCompanyName
   * @return updatedByCompanyName
  **/
  @ApiModelProperty(example = "My Awesome Company", value = "")
  public String getUpdatedByCompanyName() {
    return updatedByCompanyName;
  }

  public void setUpdatedByCompanyName(String updatedByCompanyName) {
    this.updatedByCompanyName = updatedByCompanyName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpnResponse vpnResponse = (VpnResponse) o;
    return Objects.equals(this.siteName, vpnResponse.siteName) &&
        Objects.equals(this.uuid, vpnResponse.uuid) &&
        Objects.equals(this.virtualDeviceUUID, vpnResponse.virtualDeviceUUID) &&
        Objects.equals(this.configName, vpnResponse.configName) &&
        Objects.equals(this.status, vpnResponse.status) &&
        Objects.equals(this.peerIp, vpnResponse.peerIp) &&
        Objects.equals(this.peerSharedKey, vpnResponse.peerSharedKey) &&
        Objects.equals(this.remoteAsn, vpnResponse.remoteAsn) &&
        Objects.equals(this.remoteIpAddress, vpnResponse.remoteIpAddress) &&
        Objects.equals(this.password, vpnResponse.password) &&
        Objects.equals(this.localAsn, vpnResponse.localAsn) &&
        Objects.equals(this.tunnelIp, vpnResponse.tunnelIp) &&
        Objects.equals(this.bgpState, vpnResponse.bgpState) &&
        Objects.equals(this.inboundBytes, vpnResponse.inboundBytes) &&
        Objects.equals(this.inboundPackets, vpnResponse.inboundPackets) &&
        Objects.equals(this.outboundBytes, vpnResponse.outboundBytes) &&
        Objects.equals(this.outboundPackets, vpnResponse.outboundPackets) &&
        Objects.equals(this.tunnelStatus, vpnResponse.tunnelStatus) &&
        Objects.equals(this.custOrgId, vpnResponse.custOrgId) &&
        Objects.equals(this.createdDate, vpnResponse.createdDate) &&
        Objects.equals(this.createdByFirstName, vpnResponse.createdByFirstName) &&
        Objects.equals(this.createdByLastName, vpnResponse.createdByLastName) &&
        Objects.equals(this.createdByEmail, vpnResponse.createdByEmail) &&
        Objects.equals(this.createdByUserKey, vpnResponse.createdByUserKey) &&
        Objects.equals(this.createdByAccountUcmId, vpnResponse.createdByAccountUcmId) &&
        Objects.equals(this.createdByUserName, vpnResponse.createdByUserName) &&
        Objects.equals(this.createdByCustOrgId, vpnResponse.createdByCustOrgId) &&
        Objects.equals(this.createdByCustOrgName, vpnResponse.createdByCustOrgName) &&
        Objects.equals(this.createdByUserStatus, vpnResponse.createdByUserStatus) &&
        Objects.equals(this.createdByCompanyName, vpnResponse.createdByCompanyName) &&
        Objects.equals(this.lastUpdatedDate, vpnResponse.lastUpdatedDate) &&
        Objects.equals(this.updatedByFirstName, vpnResponse.updatedByFirstName) &&
        Objects.equals(this.updatedByLastName, vpnResponse.updatedByLastName) &&
        Objects.equals(this.updatedByEmail, vpnResponse.updatedByEmail) &&
        Objects.equals(this.updatedByUserKey, vpnResponse.updatedByUserKey) &&
        Objects.equals(this.updatedByAccountUcmId, vpnResponse.updatedByAccountUcmId) &&
        Objects.equals(this.updatedByUserName, vpnResponse.updatedByUserName) &&
        Objects.equals(this.updatedByCustOrgId, vpnResponse.updatedByCustOrgId) &&
        Objects.equals(this.updatedByCustOrgName, vpnResponse.updatedByCustOrgName) &&
        Objects.equals(this.updatedByUserStatus, vpnResponse.updatedByUserStatus) &&
        Objects.equals(this.updatedByCompanyName, vpnResponse.updatedByCompanyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteName, uuid, virtualDeviceUUID, configName, status, peerIp, peerSharedKey, remoteAsn, remoteIpAddress, password, localAsn, tunnelIp, bgpState, inboundBytes, inboundPackets, outboundBytes, outboundPackets, tunnelStatus, custOrgId, createdDate, createdByFirstName, createdByLastName, createdByEmail, createdByUserKey, createdByAccountUcmId, createdByUserName, createdByCustOrgId, createdByCustOrgName, createdByUserStatus, createdByCompanyName, lastUpdatedDate, updatedByFirstName, updatedByLastName, updatedByEmail, updatedByUserKey, updatedByAccountUcmId, updatedByUserName, updatedByCustOrgId, updatedByCustOrgName, updatedByUserStatus, updatedByCompanyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpnResponse {\n");
    
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    virtualDeviceUUID: ").append(toIndentedString(virtualDeviceUUID)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    peerIp: ").append(toIndentedString(peerIp)).append("\n");
    sb.append("    peerSharedKey: ").append(toIndentedString(peerSharedKey)).append("\n");
    sb.append("    remoteAsn: ").append(toIndentedString(remoteAsn)).append("\n");
    sb.append("    remoteIpAddress: ").append(toIndentedString(remoteIpAddress)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    localAsn: ").append(toIndentedString(localAsn)).append("\n");
    sb.append("    tunnelIp: ").append(toIndentedString(tunnelIp)).append("\n");
    sb.append("    bgpState: ").append(toIndentedString(bgpState)).append("\n");
    sb.append("    inboundBytes: ").append(toIndentedString(inboundBytes)).append("\n");
    sb.append("    inboundPackets: ").append(toIndentedString(inboundPackets)).append("\n");
    sb.append("    outboundBytes: ").append(toIndentedString(outboundBytes)).append("\n");
    sb.append("    outboundPackets: ").append(toIndentedString(outboundPackets)).append("\n");
    sb.append("    tunnelStatus: ").append(toIndentedString(tunnelStatus)).append("\n");
    sb.append("    custOrgId: ").append(toIndentedString(custOrgId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdByFirstName: ").append(toIndentedString(createdByFirstName)).append("\n");
    sb.append("    createdByLastName: ").append(toIndentedString(createdByLastName)).append("\n");
    sb.append("    createdByEmail: ").append(toIndentedString(createdByEmail)).append("\n");
    sb.append("    createdByUserKey: ").append(toIndentedString(createdByUserKey)).append("\n");
    sb.append("    createdByAccountUcmId: ").append(toIndentedString(createdByAccountUcmId)).append("\n");
    sb.append("    createdByUserName: ").append(toIndentedString(createdByUserName)).append("\n");
    sb.append("    createdByCustOrgId: ").append(toIndentedString(createdByCustOrgId)).append("\n");
    sb.append("    createdByCustOrgName: ").append(toIndentedString(createdByCustOrgName)).append("\n");
    sb.append("    createdByUserStatus: ").append(toIndentedString(createdByUserStatus)).append("\n");
    sb.append("    createdByCompanyName: ").append(toIndentedString(createdByCompanyName)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    updatedByFirstName: ").append(toIndentedString(updatedByFirstName)).append("\n");
    sb.append("    updatedByLastName: ").append(toIndentedString(updatedByLastName)).append("\n");
    sb.append("    updatedByEmail: ").append(toIndentedString(updatedByEmail)).append("\n");
    sb.append("    updatedByUserKey: ").append(toIndentedString(updatedByUserKey)).append("\n");
    sb.append("    updatedByAccountUcmId: ").append(toIndentedString(updatedByAccountUcmId)).append("\n");
    sb.append("    updatedByUserName: ").append(toIndentedString(updatedByUserName)).append("\n");
    sb.append("    updatedByCustOrgId: ").append(toIndentedString(updatedByCustOrgId)).append("\n");
    sb.append("    updatedByCustOrgName: ").append(toIndentedString(updatedByCustOrgName)).append("\n");
    sb.append("    updatedByUserStatus: ").append(toIndentedString(updatedByUserStatus)).append("\n");
    sb.append("    updatedByCompanyName: ").append(toIndentedString(updatedByCompanyName)).append("\n");
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
