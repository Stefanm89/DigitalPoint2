package com.example.digital05.digitalpoint;

import java.io.Serializable;

/**
 * Created by digital05 on 5/3/16.
 */
public class Project implements Serializable {

    private String mTitle;
    private String mDescription;
    private int mPhoto;

    public Project(String title, String description, int photo) {
        mTitle = title;
        mDescription = description;
        mPhoto = photo;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getmPhoto() {
        return mPhoto;
    }

    public void setmPhoto(int mPhoto) {
        this.mPhoto = mPhoto;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
