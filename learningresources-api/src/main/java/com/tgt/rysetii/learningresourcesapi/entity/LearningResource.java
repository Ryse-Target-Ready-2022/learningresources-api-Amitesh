package com.tgt.rysetii.learningresourcesapi.entity;

import java.time.LocalDate;

public class LearningResource {
    Integer resourceId;
    String name;
    Double costPrice;
    Double sellingPrice;
    LearningResourceStatus productStatus;
    LocalDate createdDate;
    LocalDate publishedDate;
    LocalDate retiredDate;

    public LearningResource(){

    }
    public LearningResource(Integer resourceId, String name, Double costPrice, Double sellingPrice, LearningResourceStatus productStatus, LocalDate createdDate, LocalDate publishedDate, LocalDate retiredDate){
        this.resourceId=resourceId;
        this.name=name;
        this.costPrice=costPrice;
        this.sellingPrice=sellingPrice;
        this.productStatus=productStatus;
        this.createdDate=createdDate;
        this.publishedDate=publishedDate;
        this.retiredDate=retiredDate;
    }
}


