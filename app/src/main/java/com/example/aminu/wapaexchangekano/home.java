package com.example.aminu.wapaexchangekano;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class home extends Fragment {

    TextView usbp1t1;
    TextView ussp1t1;
    TextView ukbp1t1;
    TextView uksp1t1;
    TextView eubp1t1;
    TextView eusp1t1;
    TextView cnbp1t1;
    TextView cnsp1t1;

    TextView usbp1t2;
    TextView ussp1t2;
    TextView ukbp1t2;
    TextView uksp1t2;
    TextView eubp1t2;
    TextView eusp1t2;
    TextView cnbp1t2;
    TextView cnsp1t2;

    TextView usbp1t3;
    TextView ussp1t3;
    TextView ukbp1t3;
    TextView uksp1t3;
    TextView eubp1t3;
    TextView eusp1t3;
    TextView cnbp1t3;
    TextView cnsp1t3;

    FirebaseDatabase database;
    DatabaseReference ChangeRef;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.activity_home, container, false);

        database = FirebaseDatabase.getInstance();
        ChangeRef = database.getReference("ChangeRef");

        usbp1t1 = (TextView) rootView.findViewById(R.id.usbp1t1);
        ussp1t1 = (TextView) rootView.findViewById(R.id.ussp1t1);

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();

        ChangeRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String text = dataSnapshot.getValue(String.class);
                usbp1t1.setText(text);

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                String text = dataSnapshot.getValue(String.class);
                usbp1t1.setText(text);

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
