package com.example.android.booklistingapp;

/**
 * Created by Lukas on 2017-07-07.
 */

public class Book {


    private String mTitle;
    private String mAuthor;
    private String mDate;
    private String mImage;
    private String mUrl;


    public Book(String Title, String Author, String Date, String Image, String Url) {
        mTitle = Title;
        mAuthor = Author;
        mDate = Date;
        mImage = Image;
        mUrl = Url;
    }


    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getDate() {
        return mDate;
    }

    public String getImage() {
        return mImage;
    }

    public String getUrl() {
        return mUrl;
    }
}
