package com.example.android.miwok;

import android.media.MediaPlayer;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageAdress = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResource;

    public Word(String DefaultTranslation, String MiwokTranslation, int audioResource) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResource = audioResource;
    }

    public Word(String DefaultTranslation, String MiwokTranslation, int ImageAdress, int audioResource) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageAdress = ImageAdress;
        mAudioResource = audioResource;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public int getmImageAdress() {
        return mImageAdress;
    }

    public void setmImageAdress(int mImageAdress) {
        this.mImageAdress = mImageAdress;
    }

    public boolean hasImage(){
        return mImageAdress != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResource() {
        return mAudioResource;
    }

    public void setmAudioResource(int mAudioResource) {
        this.mAudioResource = mAudioResource;
    }
}
