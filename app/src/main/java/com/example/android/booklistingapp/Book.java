package com.example.android.booklistingapp;

public class Book {

    /** Title of the book */
    private String mTitle;

    /** Author name of the book */
    private String mAuthors;

    /** Description of the book */
    private String mDescription;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param title is the title of the book
     * @param authors is the name of the author of the book
     * @param description is the description of the book
     */
    public Book(String title, String authors, String description, String url) {
        mTitle = title;
        mAuthors = authors;
        mDescription = description;
    }

    /**
     * Returns the title of the book.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the author name of the book.
     */
    public String getAuthors() {
        return mAuthors;
    }

    /**
     * Returns the description of the book.
     */
    public String getDescription() {
        return mDescription;
    }

}
