package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumTourism extends Fragment {


    public MuseumTourism() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageOne = inflater.inflate(R.layout.tour_list, container, false);


        // Create a list of words
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(getString(R.string.grand), R.drawable.the_grand_egyptian_museum, getString(R.string.grand_text),getString(R.string.grand_link)));
        tour.add(new Tour(getString(R.string.museum_of_art), R.drawable.museum_of_modern_egyptian_art, getString(R.string.museum_of_art_text),getString(R.string.museum_of_art_link)));
        tour.add(new Tour(getString(R.string.egyptian_museum), R.drawable.the_museum_of_egyptian, getString(R.string.egyptian_museum_text),getString(R.string.egyptian_museum_link)));
        tour.add(new Tour(getString(R.string.nubian), R.drawable.the_nubian_museum_in_aswan, getString(R.string.nubian_text),getString(R.string.nubian_link)));

        // creating rootView and setting it up with the ArrayAdapter
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        TourAdapter adapter = new TourAdapter(getActivity(), tour,R.color.museum_egypt_background);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }


}
