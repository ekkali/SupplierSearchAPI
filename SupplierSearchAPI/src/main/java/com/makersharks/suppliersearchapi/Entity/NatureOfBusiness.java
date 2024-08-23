package com.makersharks.suppliersearchapi.Entity;

public enum NatureOfBusiness {
    SMALL_SCALE("small_scale"),
    MEDIUM_SCALE("medium_scale"),
    LARGE_SCALE("large_scale");

    private final String businessType;

    NatureOfBusiness(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessType() {
        return businessType;
    }



}
