package com.juborajsarker.assignment.fragments;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.juborajsarker.assignment.activity.MainActivity;
import com.juborajsarker.assignment.R;
import com.juborajsarker.assignment.adapter.CustomAdapter;
import com.juborajsarker.assignment.json_class.MainStation;
import com.juborajsarker.assignment.utils.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;


public class WeatherStationFragment extends Fragment {

    View view;
    List<MainStation> mainStationList = new ArrayList<>();

    RecyclerView recyclerView;
    CustomAdapter adapter;

    public WeatherStationFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_weather_stations, container, false);

        mainStationList = MainActivity.weatherStationsList;
        init();

        return view;
    }

    private void init() {

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        adapter = new CustomAdapter(getContext(), mainStationList, recyclerView, "weather");

        RecyclerView.LayoutManager layoutManagerBeforeMeal = new GridLayoutManager(getContext(), 1);
        recyclerView.setLayoutManager(layoutManagerBeforeMeal);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(1, dpToPx(2), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }


    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

}
