package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by samuel on 04/08/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        if (convertView == null) {
            // if the view is not being recycled then inflate it and connect it to the view that will use it
            convertView  = LayoutInflater.from(getContext()).inflate(R.layout.content, parent, false);
        }

        Word word = getItem(position);

        if (word != null) {
            TextView tt1 = (TextView) convertView.findViewById(R.id.miwak_number);
            TextView tt2 = (TextView) convertView.findViewById(R.id.english_number);

            if (tt1 != null) {
                tt1.setText(word.getMiwokTranslation());
            }

            if (tt2 != null) {
                tt2.setText(word.getDefaultTranslation());
            }
        }

        return convertView;
    }
}
