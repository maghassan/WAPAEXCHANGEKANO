package com.example.aminu.wapaexchangekano;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class home extends Fragment {

    TextView usbt1;
    TextView usst1;
    TextView ukbt1;
    TextView ukst1;
    TextView eubt1;
    TextView eust1;
    TextView cnbt1;
    TextView cnst1;

    TextView usbt2;
    TextView usst2;
    TextView ukbt2;
    TextView ukst2;
    TextView eubt2;
    TextView eust2;
    TextView cnbt2;
    TextView cnst2;

    TextView usbt3;
    TextView usst3;
    TextView ukbt3;
    TextView ukst3;
    TextView eubt3;
    TextView eust3;
    TextView cnbt3;
    TextView cnst3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.activity_home, container, false);

        usbt1 = (TextView) rootView.findViewById(R.id.usbt1);
        usst1 = (TextView) rootView.findViewById(R.id.usst1);

        return rootView;
    }
}
