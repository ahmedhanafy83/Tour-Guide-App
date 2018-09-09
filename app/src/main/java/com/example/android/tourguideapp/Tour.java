package com.example.android.tourguideapp;

public class Tour {

    private String mHeader;
    private String mText;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mLink;

    public Tour(String header,  int imageResourceId ,String text, String Link) {

        mHeader = header;
        mImageResourceId = imageResourceId;
        mText = text;
        mLink = Link;

    }

    public String getHeader() {
        return mHeader;
    }

    public String getText() {
        return mText;
    }

    public int getImage() {
        return mImageResourceId;
    }

    public String getLink() {
        return mLink;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
