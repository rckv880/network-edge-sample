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
import com.equinix.networkedge.model.LicenseOptions;
import com.equinix.networkedge.model.Metro;
import com.equinix.networkedge.model.SoftwarePackage;
import com.equinix.networkedge.model.Throughput;

import java.util.ArrayList;
import java.util.List;

/**
 * VirtualDeviceType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class VirtualDeviceType {
  @SerializedName("availableMetros")
  private List<Metro> availableMetros = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("deviceTypeCode")
  private String deviceTypeCode = null;

  @SerializedName("licenseOptions")
  private List<LicenseOptions> licenseOptions = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("softwarePackages")
  private List<SoftwarePackage> softwarePackages = null;

  @SerializedName("throughputOptions")
  private List<Throughput> throughputOptions = null;

  @SerializedName("vendor")
  private String vendor = null;

  public VirtualDeviceType availableMetros(List<Metro> availableMetros) {
    this.availableMetros = availableMetros;
    return this;
  }

  public VirtualDeviceType addAvailableMetrosItem(Metro availableMetrosItem) {
    if (this.availableMetros == null) {
      this.availableMetros = new ArrayList<Metro>();
    }
    this.availableMetros.add(availableMetrosItem);
    return this;
  }

   /**
   * Array of metros where the device is available
   * @return availableMetros
  **/
  @ApiModelProperty(value = "Array of metros where the device is available")
  public List<Metro> getAvailableMetros() {
    return availableMetros;
  }

  public void setAvailableMetros(List<Metro> availableMetros) {
    this.availableMetros = availableMetros;
  }

  public VirtualDeviceType category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Type of virtual device, whether router or firewall
   * @return category
  **/
  @ApiModelProperty(example = "ROUTER", value = "Type of virtual device, whether router or firewall")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public VirtualDeviceType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Device description
   * @return description
  **/
  @ApiModelProperty(example = "Extend your enterprise network to public and private clouds with the CSR 1000V series.", value = "Device description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VirtualDeviceType deviceTypeCode(String deviceTypeCode) {
    this.deviceTypeCode = deviceTypeCode;
    return this;
  }

   /**
   * Device type code
   * @return deviceTypeCode
  **/
  @ApiModelProperty(example = "CSR1000V", value = "Device type code")
  public String getDeviceTypeCode() {
    return deviceTypeCode;
  }

  public void setDeviceTypeCode(String deviceTypeCode) {
    this.deviceTypeCode = deviceTypeCode;
  }

  public VirtualDeviceType licenseOptions(List<LicenseOptions> licenseOptions) {
    this.licenseOptions = licenseOptions;
    return this;
  }

  public VirtualDeviceType addLicenseOptionsItem(LicenseOptions licenseOptionsItem) {
    if (this.licenseOptions == null) {
      this.licenseOptions = new ArrayList<LicenseOptions>();
    }
    this.licenseOptions.add(licenseOptionsItem);
    return this;
  }

   /**
   * Array of available license options, subscription or BYOL (Bring Your Own License)
   * @return licenseOptions
  **/
  @ApiModelProperty(value = "Array of available license options, subscription or BYOL (Bring Your Own License)")
  public List<LicenseOptions> getLicenseOptions() {
    return licenseOptions;
  }

  public void setLicenseOptions(List<LicenseOptions> licenseOptions) {
    this.licenseOptions = licenseOptions;
  }

  public VirtualDeviceType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the device
   * @return name
  **/
  @ApiModelProperty(example = "CSR 1000V", value = "Name of the device")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VirtualDeviceType softwarePackages(List<SoftwarePackage> softwarePackages) {
    this.softwarePackages = softwarePackages;
    return this;
  }

  public VirtualDeviceType addSoftwarePackagesItem(SoftwarePackage softwarePackagesItem) {
    if (this.softwarePackages == null) {
      this.softwarePackages = new ArrayList<SoftwarePackage>();
    }
    this.softwarePackages.add(softwarePackagesItem);
    return this;
  }

   /**
   * Array of available software packages
   * @return softwarePackages
  **/
  @ApiModelProperty(value = "Array of available software packages")
  public List<SoftwarePackage> getSoftwarePackages() {
    return softwarePackages;
  }

  public void setSoftwarePackages(List<SoftwarePackage> softwarePackages) {
    this.softwarePackages = softwarePackages;
  }

  public VirtualDeviceType throughputOptions(List<Throughput> throughputOptions) {
    this.throughputOptions = throughputOptions;
    return this;
  }

  public VirtualDeviceType addThroughputOptionsItem(Throughput throughputOptionsItem) {
    if (this.throughputOptions == null) {
      this.throughputOptions = new ArrayList<Throughput>();
    }
    this.throughputOptions.add(throughputOptionsItem);
    return this;
  }

   /**
   * Array of available throughput options
   * @return throughputOptions
  **/
  @ApiModelProperty(value = "Array of available throughput options")
  public List<Throughput> getThroughputOptions() {
    return throughputOptions;
  }

  public void setThroughputOptions(List<Throughput> throughputOptions) {
    this.throughputOptions = throughputOptions;
  }

  public VirtualDeviceType vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Vendor of the device
   * @return vendor
  **/
  @ApiModelProperty(example = "Cisco", value = "Vendor of the device")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualDeviceType virtualDeviceType = (VirtualDeviceType) o;
    return Objects.equals(this.availableMetros, virtualDeviceType.availableMetros) &&
        Objects.equals(this.category, virtualDeviceType.category) &&
        Objects.equals(this.description, virtualDeviceType.description) &&
        Objects.equals(this.deviceTypeCode, virtualDeviceType.deviceTypeCode) &&
        Objects.equals(this.licenseOptions, virtualDeviceType.licenseOptions) &&
        Objects.equals(this.name, virtualDeviceType.name) &&
        Objects.equals(this.softwarePackages, virtualDeviceType.softwarePackages) &&
        Objects.equals(this.throughputOptions, virtualDeviceType.throughputOptions) &&
        Objects.equals(this.vendor, virtualDeviceType.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableMetros, category, description, deviceTypeCode, licenseOptions, name, softwarePackages, throughputOptions, vendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualDeviceType {\n");
    
    sb.append("    availableMetros: ").append(toIndentedString(availableMetros)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceTypeCode: ").append(toIndentedString(deviceTypeCode)).append("\n");
    sb.append("    licenseOptions: ").append(toIndentedString(licenseOptions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    softwarePackages: ").append(toIndentedString(softwarePackages)).append("\n");
    sb.append("    throughputOptions: ").append(toIndentedString(throughputOptions)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

