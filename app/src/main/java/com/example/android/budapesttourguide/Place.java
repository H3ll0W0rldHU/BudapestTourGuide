
package com.example.android.budapesttourguide;

import static com.example.android.budapesttourguide.R.id.location;

/**
 * {@link Place} represents a fun place in Budapest.
 * It contains resource IDs for the name of the place, the location, and
 * a small photo of the place.
 */
public class Place {

    /** String resource ID for the name of the place */
    private int mPlaceNameId;

    /** String resource ID for the location of the place */
    private int mLocationId;

    /** Image resource ID for the place */
    private int mImageResourceId;

    /**
     * Create a new Place object.
     *
     * @param placeNameId is the string resource ID for the name of the place
     * @param locationId is the full address of the place in a String
     */
    public Place(int placeNameId, int locationId) {
        mPlaceNameId = placeNameId;
        mLocationId = locationId;
    }

    /**
     * Create a new Place object.
     *
     * @param placeNameId is the string resource ID for the name of the place
     * @param locationId is the Location object which contains the location data of the place
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     */
    public Place(int placeNameId, int locationId, int imageResourceId) {
        mPlaceNameId = placeNameId;
        mLocationId = locationId;
        mImageResourceId = imageResourceId;
    }

    public int getPlaceNameId() {
        return mPlaceNameId;
    }

    public int getLocationId() {return mLocationId;    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}