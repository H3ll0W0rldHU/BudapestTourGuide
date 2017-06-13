
package com.example.android.budapesttourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.budapesttourguide.R.string.durer_kert;
import static com.example.android.budapesttourguide.R.string.durer_kert_address;
import static com.example.android.budapesttourguide.R.string.grandio;
import static com.example.android.budapesttourguide.R.string.grandio_address;
import static com.example.android.budapesttourguide.R.string.instant;
import static com.example.android.budapesttourguide.R.string.instant_address;
import static com.example.android.budapesttourguide.R.string.kuplung;
import static com.example.android.budapesttourguide.R.string.kuplung_address;
import static com.example.android.budapesttourguide.R.string.szimpla_kert;
import static com.example.android.budapesttourguide.R.string.szimpla_kert_address;

/**
 * {@link Fragment} that displays a list of Ruinpubs.
 */
public class RuinpubsFragment extends Fragment {


    public RuinpubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(szimpla_kert, szimpla_kert_address,
                R.drawable.szimpla_kert));
        places.add(new Place(instant, instant_address,
                R.drawable.instant));
        places.add(new Place(kuplung, kuplung_address,
                R.drawable.kuplung));
        places.add(new Place(grandio, grandio_address,
                R.drawable.grandio));
        places.add(new Place(durer_kert, durer_kert_address,
                R.drawable.durer));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_ruinpubs);

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
