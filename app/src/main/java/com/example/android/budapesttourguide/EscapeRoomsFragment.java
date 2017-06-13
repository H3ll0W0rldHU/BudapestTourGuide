
package com.example.android.budapesttourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.budapesttourguide.R.string.claustrophilia;
import static com.example.android.budapesttourguide.R.string.claustrophilia_address;
import static com.example.android.budapesttourguide.R.string.locked_room_budapest;
import static com.example.android.budapesttourguide.R.string.locked_room_budapest_address;
import static com.example.android.budapesttourguide.R.string.logiqrooms;
import static com.example.android.budapesttourguide.R.string.logiqrooms_address;
import static com.example.android.budapesttourguide.R.string.mystique_room;
import static com.example.android.budapesttourguide.R.string.mystique_room_address;
import static com.example.android.budapesttourguide.R.string.trap;
import static com.example.android.budapesttourguide.R.string.trap_address;

/**
 * {@link Fragment} that displays a list of Escape Rooms.
 */
public class EscapeRoomsFragment extends Fragment {


    public EscapeRoomsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(trap, trap_address,
                R.drawable.trap));
        places.add(new Place(mystique_room, mystique_room_address,
                R.drawable.mystique_room));
        places.add(new Place(claustrophilia, claustrophilia_address,
                R.drawable.claustrophilia));
        places.add(new Place(locked_room_budapest, locked_room_budapest_address,
                R.drawable.locked_room));
        places.add(new Place(logiqrooms, logiqrooms_address,
                R.drawable.logiqrooms));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_escape_rooms);

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
