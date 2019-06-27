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
 * AgreementAcceptRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class AgreementAcceptRequest {
  @SerializedName("accountNumber")
  private String accountNumber = null;

  @SerializedName("activationDate")
  private String activationDate = null;

  @SerializedName("apttusId")
  private String apttusId = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("fileType")
  private String fileType = null;

  @SerializedName("signatureType")
  private String signatureType = null;

  @SerializedName("signedPDF")
  private String signedPDF = null;

  @SerializedName("source")
  private String source = null;

  public AgreementAcceptRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AgreementAcceptRequest activationDate(String activationDate) {
    this.activationDate = activationDate;
    return this;
  }

   /**
   * Get activationDate
   * @return activationDate
  **/
  @ApiModelProperty(value = "")
  public String getActivationDate() {
    return activationDate;
  }

  public void setActivationDate(String activationDate) {
    this.activationDate = activationDate;
  }

  public AgreementAcceptRequest apttusId(String apttusId) {
    this.apttusId = apttusId;
    return this;
  }

   /**
   * Get apttusId
   * @return apttusId
  **/
  @ApiModelProperty(value = "")
  public String getApttusId() {
    return apttusId;
  }

  public void setApttusId(String apttusId) {
    this.apttusId = apttusId;
  }

  public AgreementAcceptRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AgreementAcceptRequest fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @ApiModelProperty(value = "")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public AgreementAcceptRequest signatureType(String signatureType) {
    this.signatureType = signatureType;
    return this;
  }

   /**
   * Get signatureType
   * @return signatureType
  **/
  @ApiModelProperty(value = "")
  public String getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(String signatureType) {
    this.signatureType = signatureType;
  }

  public AgreementAcceptRequest signedPDF(String signedPDF) {
    this.signedPDF = signedPDF;
    return this;
  }

   /**
   * Get signedPDF
   * @return signedPDF
  **/
  @ApiModelProperty(value = "")
  public String getSignedPDF() {
    return signedPDF;
  }

  public void setSignedPDF(String signedPDF) {
    this.signedPDF = signedPDF;
  }

  public AgreementAcceptRequest source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementAcceptRequest agreementAcceptRequest = (AgreementAcceptRequest) o;
    return Objects.equals(this.accountNumber, agreementAcceptRequest.accountNumber) &&
        Objects.equals(this.activationDate, agreementAcceptRequest.activationDate) &&
        Objects.equals(this.apttusId, agreementAcceptRequest.apttusId) &&
        Objects.equals(this.fileName, agreementAcceptRequest.fileName) &&
        Objects.equals(this.fileType, agreementAcceptRequest.fileType) &&
        Objects.equals(this.signatureType, agreementAcceptRequest.signatureType) &&
        Objects.equals(this.signedPDF, agreementAcceptRequest.signedPDF) &&
        Objects.equals(this.source, agreementAcceptRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, activationDate, apttusId, fileName, fileType, signatureType, signedPDF, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementAcceptRequest {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    apttusId: ").append(toIndentedString(apttusId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    signedPDF: ").append(toIndentedString(signedPDF)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

