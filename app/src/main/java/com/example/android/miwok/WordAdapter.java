package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;
    public WordAdapter(@NonNull Context context, ArrayList<Word> objects, int backgroundColor) {
        super(context, 0, objects);
        mColorResourceId = backgroundColor;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_words);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_words);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        englishTextView.setText(currentWord.getmDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.minow_image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if (currentWord.hasImage()){
            iconView.setImageResource(currentWord.getmImageAdress());
            iconView.setVisibility(View.VISIBLE);
        }
        else {
            iconView.setVisibility(View.GONE);
        }
        View layoutView = (View) listItemView.findViewById(R.id.layout_color_change);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        layoutView.setBackgroundColor(color);


        return listItemView;
    }
}
