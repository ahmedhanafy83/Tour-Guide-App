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
public class IslamicTourism extends Fragment {


    public IslamicTourism() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageOne = inflater.inflate(R.layout.tour_list, container, false);


        // Create a list of words
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(getString(R.string.hakim), R.drawable.al_hakim_mosque, getString(R.string.hakim_text),getString(R.string.hakim_link)));
        tour.add(new Tour(getString(R.string.haggag), R.drawable.abu_haggag_mosque_luxor, getString(R.string.haggag_text),getString(R.string.haggag_link)));
        tour.add(new Tour(getString(R.string.muhammed_ali), R.drawable.mosque_of_mohamed_ali, getString(R.string.muhammed_ali_text),getString(R.string.muhammed_ali_link)));
        tour.add(new Tour(getString(R.string.al_azhar_mosque), R.drawable.mosque_of_al_azhar_cairo,getString(R.string.al_azhar_mosque_text),getString(R.string.al_azhar_mosque_link)));

        // creating rootView and setting it up with the ArrayAdapter
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        TourAdapter adapter = new TourAdapter(getActivity(), tour,R.color.islamic_egypt_background);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }

}
