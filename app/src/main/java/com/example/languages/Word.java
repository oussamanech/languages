package com.example.languages;

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Miwok translation for the word */
    private int mImageResourceID=NO_IMAGE_PROVIDE;

    private static final int NO_IMAGE_PROVIDE = -1;

    private int mAudioResId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int audioResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResId = audioResId;

    }

    public Word(String defaultTranslation, String miwokTranslation, int mimageResourceID,int audioResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = mimageResourceID;
        mAudioResId = audioResId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage(){      return mImageResourceID != NO_IMAGE_PROVIDE;    }

    public int getmAudioResId() {       return mAudioResId;    }



}
