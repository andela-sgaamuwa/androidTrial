package com.example.android.miwok;

/**
 * Created by samuel on 04/08/2017.
 */

public class Word {

    private String englishTranslation;
    private String miwokTranslation;

    public Word(String englishTranslation, String miwokTranslation){
        this.englishTranslation = englishTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return englishTranslation;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

}
