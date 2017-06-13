
package com.example.android.budapesttourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * {@link Fragment} that displays a list of Museums.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.history_museum, R.string.history_museum_address,
                R.drawable.history_museum));
        places.add(new Place(R.string.house_of_terror_museum, R.string.house_of_terror_address,
                R.drawable.house_of_terror));
        places.add(new Place(R.string.hungarian_national_gallery, R.string.hungarian_national_gallery_address,
                R.drawable.national_gallery));
        places.add(new Place(R.string.museum_of_transportation, R.string.museum_of_transportation_address,
                R.drawable.museum_of_transportation));
        places.add(new Place(R.string.hungarian_national_museum, R.string.hungarian_national_museum_address,
                R.drawable.national_museum));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_museums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }
}
