package com.example.android.miwok;

/**
 * Created by samuel on 04/08/2017.
 */

public class Word {

    private String englishTranslation;
    private String miwokTranslation;
    private int imageResource = NO_IMAGE_RESOURCE;
    private static final int NO_IMAGE_RESOURCE = -1;

    public Word(String englishTranslation, String miwokTranslation){
        this.englishTranslation = englishTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String englishTranslation, String miwokTranslation, int imageResource){
        this(englishTranslation, miwokTranslation);
        this.imageResource = imageResource;
    }

    public String getDefaultTranslation(){
        return this.englishTranslation;
    }

    public String getMiwokTranslation(){
        return this.miwokTranslation;
    }

    public int getImageResource() { return this.imageResource; }

    public boolean hasImage(){
        return imageResource != NO_IMAGE_RESOURCE;
    }

}
