package com.traddis.awsimageupAndDown.bucket;

public enum BucketName {
    PROFILE_IMAGE("traddis-image-up-and-down");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName=bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
