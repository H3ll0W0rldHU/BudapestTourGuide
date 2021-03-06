package com.example.android.budapesttourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place>  {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Place}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of places
     */
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_of_place.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_of_place);
        // Get the name of the Place from the currentPlace object and set this text on
        // the Name TextView.
        nameTextView.setText(currentPlace.getPlaceNameId());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        // Get the location of the place from the currentPlace object and set this text on
        // the Location TextView.
        locationTextView.setText(currentPlace.getLocationId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.picture_of_place);

        // Display the provided image based on the resource ID
        imageView.setImageResource(currentPlace.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}