
package com.example.android.budapesttourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * {@link Fragment} that displays a list of Restaurants.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.onyx, R.string.onyx_address,
                R.drawable.onyx));
        places.add(new Place(R.string.megyeri_csarda_tavern, R.string.megyeri_csarda_address,
                R.drawable.megyeri_csarda));
        places.add(new Place(R.string.fishermans_bastion, R.string.fishermans_bastion_address,
                R.drawable.fishermans_bastion));
        places.add(new Place(R.string.museum_cafe_restaurant, R.string.museum_cafe_address,
                R.drawable.museum_cafe));
        places.add(new Place(R.string.gundel, R.string.gundel_address,
                R.drawable.gundel));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_restaurants);

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
