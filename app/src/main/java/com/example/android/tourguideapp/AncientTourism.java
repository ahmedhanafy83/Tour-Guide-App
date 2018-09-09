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
public class AncientTourism extends Fragment {


    public AncientTourism() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageOne = inflater.inflate(R.layout.tour_list, container, false);


        // Create a list of words
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(getString(R.string.pyramid), R.drawable.pyramids_of_giza, getString(R.string.pyramids),getString(R.string.pyramids_link)));
        tour.add(new Tour(getString(R.string.simbel), R.drawable.abu_simbel, getString(R.string.abu_simbel),getString(R.string.abu_simbel_link)));
        tour.add(new Tour(getString(R.string.great), R.drawable.great_sphinx, getString(R.string.sphinx),getString(R.string.sphinx_link)));
        tour.add(new Tour(getString(R.string.karnk), R.drawable.karnak,getString(R.string.karnak),getString(R.string.karnak_link)));
        tour.add(new Tour(getString(R.string.queen) , R.drawable.queen_hatshepsut_temple,getString(R.string.hatshepsut),getString(R.string.hatshepsut_link)));

        // creating rootView and setting it up with the ArrayAdapter
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        TourAdapter adapter = new TourAdapter(getActivity(), tour,R.color.ancient_egypt_background);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }

}
