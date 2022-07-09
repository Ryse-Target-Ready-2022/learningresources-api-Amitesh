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
}


