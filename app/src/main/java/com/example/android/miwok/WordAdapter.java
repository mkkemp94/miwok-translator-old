package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kempm on 12/11/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackgroundColor;

    /**
     * Constructor
     * @param context
     * @param words
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int backgroundColor) {
        super(context, 0, words);

        mBackgroundColor = backgroundColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the (@link Word) object located at this position in the lise
        Word currentWord = getItem(position);

        // Set the miwok text view to show the curren  t word's translation
        TextView miwokTextView = (TextView) listViewItem.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Set the default text view to show the current word's translation
        TextView defaultTextView = (TextView) listViewItem.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Set the image view to show the current word's image (if it exists)
        ImageView imageView = (ImageView) listViewItem.findViewById(R.id.image_view);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the image
            imageView.setVisibility(View.GONE);
        }

        // Get the view that holds the text views
        View view = listViewItem.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);

        // Set color
        view.setBackgroundColor(color);

        // Return the item in the list with view contents set
        return listViewItem;
    }
}
