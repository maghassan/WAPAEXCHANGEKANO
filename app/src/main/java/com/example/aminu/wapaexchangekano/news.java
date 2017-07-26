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

public class news extends Fragment {

    FirebaseDatabase database;
    DatabaseReference NewsRef;

    TextView news1;

    public news(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.activity_news, container, false);

        database = FirebaseDatabase.getInstance();
        NewsRef = database.getReference("NewsRef");

        news1 = (TextView) rootView.findViewById(R.id.news1);

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();

        NewsRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String text = dataSnapshot.getValue(String.class);
                news1.setText(text);

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                String text = dataSnapshot.getValue(String.class);
                news1.setText(text);

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
