package com.example.android.tourguideapp;

import android.content.Context;
import android.net.Uri;
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
public class ModernTourism extends Fragment {


    public ModernTourism() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageOne = inflater.inflate(R.layout.tour_list, container, false);


        // Create a list of words
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(getString(R.string.tower), R.drawable.cairo_tower, getString(R.string.cairo_tower),getString(R.string.cairo_tower_link)));
        tour.add(new Tour(getString(R.string.azhar), R.drawable.azhar_park, getString(R.string.al_azhar_park),getString(R.string.al_azhar_link)));
        tour.add(new Tour(getString(R.string.sound_show), R.drawable.giza_pyramids_sound_and_light_show, getString(R.string.sound_light),getString(R.string.sound_light_link)));
        tour.add(new Tour(getString(R.string.opera_cairo), R.drawable.cairo_opera_house_aerial,getString(R.string.opera),getString(R.string.opera_link)));
        tour.add(new Tour(getString(R.string.village) , R.drawable.pharaonic_village_cairo,getString(R.string.pharaonic),getString(R.string.pharaonic_link)));

        // creating rootView and setting it up with the ArrayAdapter
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        TourAdapter adapter = new TourAdapter(getActivity(), tour,R.color.modern_egypt_background);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }


}
