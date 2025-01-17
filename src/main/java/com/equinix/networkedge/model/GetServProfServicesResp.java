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
import com.equinix.networkedge.model.GetServProfServicesRespContent;

import java.util.ArrayList;
import java.util.List;

/**
 * GetServProfServicesResp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:45:54.773-07:00")
public class GetServProfServicesResp {
  @SerializedName("isLastPage")
  private Boolean isLastPage = null;

  @SerializedName("totalCount")
  private Integer totalCount = null;

  @SerializedName("isFirstPage")
  private Boolean isFirstPage = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("content")
  private List<GetServProfServicesRespContent> content = null;

  public GetServProfServicesResp isLastPage(Boolean isLastPage) {
    this.isLastPage = isLastPage;
    return this;
  }

   /**
   * Get isLastPage
   * @return isLastPage
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsLastPage() {
    return isLastPage;
  }

  public void setIsLastPage(Boolean isLastPage) {
    this.isLastPage = isLastPage;
  }

  public GetServProfServicesResp totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(example = "55", value = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public GetServProfServicesResp isFirstPage(Boolean isFirstPage) {
    this.isFirstPage = isFirstPage;
    return this;
  }

   /**
   * Get isFirstPage
   * @return isFirstPage
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsFirstPage() {
    return isFirstPage;
  }

  public void setIsFirstPage(Boolean isFirstPage) {
    this.isFirstPage = isFirstPage;
  }

  public GetServProfServicesResp pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(example = "1000", value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public GetServProfServicesResp pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public GetServProfServicesResp content(List<GetServProfServicesRespContent> content) {
    this.content = content;
    return this;
  }

  public GetServProfServicesResp addContentItem(GetServProfServicesRespContent contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<GetServProfServicesRespContent>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public List<GetServProfServicesRespContent> getContent() {
    return content;
  }

  public void setContent(List<GetServProfServicesRespContent> content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetServProfServicesResp getServProfServicesResp = (GetServProfServicesResp) o;
    return Objects.equals(this.isLastPage, getServProfServicesResp.isLastPage) &&
        Objects.equals(this.totalCount, getServProfServicesResp.totalCount) &&
        Objects.equals(this.isFirstPage, getServProfServicesResp.isFirstPage) &&
        Objects.equals(this.pageSize, getServProfServicesResp.pageSize) &&
        Objects.equals(this.pageNumber, getServProfServicesResp.pageNumber) &&
        Objects.equals(this.content, getServProfServicesResp.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLastPage, totalCount, isFirstPage, pageSize, pageNumber, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServProfServicesResp {\n");
    
    sb.append("    isLastPage: ").append(toIndentedString(isLastPage)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    isFirstPage: ").append(toIndentedString(isFirstPage)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

