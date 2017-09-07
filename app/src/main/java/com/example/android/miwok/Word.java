package com.example.android.miwok;

/**
 * Created by samuel on 04/08/2017.
 */

public class Word {

    private String englishTranslation;
    private String miwokTranslation;
    private int imageResource = NO_IMAGE_RESOURCE;
    private int soundResource;
    private static final int NO_IMAGE_RESOURCE = -1;

    public Word(String englishTranslation, String miwokTranslation, int soundResource){
        this.englishTranslation = englishTranslation;
        this.miwokTranslation = miwokTranslation;
        this.soundResource = soundResource;
    }

    public Word(String englishTranslation, String miwokTranslation, int soundResource, int imageResource){
        this(englishTranslation, miwokTranslation, soundResource);
        this.imageResource = imageResource;
    }

    public String getDefaultTranslation(){
        return this.englishTranslation;
    }

    public String getMiwokTranslation(){
        return this.miwokTranslation;
    }

    public int getImageResource() { return this.imageResource; }

    public int getSoundResource() { return this.soundResource; }

    public boolean hasImage(){
        return imageResource != NO_IMAGE_RESOURCE;
    }

    @Override
    public String toString() {
        return "Word{" +
                "englishTranslation='" + englishTranslation + '\'' +
                ", miwokTranslation='" + miwokTranslation + '\'' +
                ", imageResource=" + imageResource +
                ", soundResource=" + soundResource +
                '}';
    }
}
