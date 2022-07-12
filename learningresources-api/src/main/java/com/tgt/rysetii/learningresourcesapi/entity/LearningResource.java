package com.tgt.rysetii.learningresourcesapi.entity;

import java.time.LocalDate;

public class LearningResource {
    Integer resourceId;
    String productName;
    Double costPrice;
    Double sellingPrice;
    LearningResourceStatus productStatus;
    LocalDate createdDate;
    LocalDate publishedDate;
    LocalDate retiredDate;

    public LearningResource(){

    }
    public LearningResource(Integer resourceId, String productName, Double costPrice, Double sellingPrice, LearningResourceStatus productStatus, LocalDate createdDate, LocalDate publishedDate, LocalDate retiredDate){
        this.resourceId=resourceId;
        this.productName=productName;
        this.costPrice=costPrice;
        this.sellingPrice=sellingPrice;
        this.productStatus=productStatus;
        this.createdDate=createdDate;
        this.publishedDate=publishedDate;
        this.retiredDate=retiredDate;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public LearningResourceStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(LearningResourceStatus productStatus) {
        this.productStatus = productStatus;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public LocalDate getRetiredDate() {
        return retiredDate;
    }

    public void setRetiredDate(LocalDate retiredDate) {
        this.retiredDate = retiredDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}


