package com.example.android.miwok;

/**
 * Created by kempm on 12/11/2016.
 */

public class Word {
    // Default translation of the word
    private String mDefaultTranslation;

    // Miwok translation of the word
    private String mMiwokTranslation;

    // Recording associated with this word
    private int mMediaResourceId;

    // Image associated with this word
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructor
     * @param defaultTranslation
     * @param miwokTranslation
     */
    public Word(String defaultTranslation, String miwokTranslation, int mediaResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mMediaResourceId = mediaResourceId;
    }

    /**
     * Constructor with images
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int mediaResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mMediaResourceId = mediaResourceId;
    }

    /**
     * Get the default translation of the word
     * @return
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok tranlation of the word
     * @return
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the recorded pronounciation of the word
     */
    public int getMediaResourceId() { return mMediaResourceId; }

    /**
     * Get the image associated with this word object
     * @return
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return whether or not there is an image for this word
     * @return
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * With this I can print out the object as a string
     * @return
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mMediaResourceId=" + mMediaResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
