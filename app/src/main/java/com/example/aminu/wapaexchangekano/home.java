package com.example.aminu.wapaexchangekano;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class home extends Fragment {
    TextView latest;
    TextView date;

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

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();


    DatabaseReference usbt1Ref = mRootRef.child("usbt1");
    DatabaseReference usst1Ref = mRootRef.child("usst1");
    DatabaseReference ukbt1Ref = mRootRef.child("ukbt1");
    DatabaseReference ukst1Ref = mRootRef.child("ukst1");
    DatabaseReference eubt1Ref = mRootRef.child("eubt1");
    DatabaseReference eust1Ref = mRootRef.child("eust1");
    DatabaseReference cnbt1Ref = mRootRef.child("cnbt1");
    DatabaseReference cnst1Ref = mRootRef.child("cnst1");

    DatabaseReference usbt2Ref = mRootRef.child("usbt2");
    DatabaseReference usst2Ref = mRootRef.child("usst2");
    DatabaseReference ukbt2Ref = mRootRef.child("ukbt2");
    DatabaseReference ukst2Ref = mRootRef.child("ukst2");
    DatabaseReference eubt2Ref = mRootRef.child("eubt2");
    DatabaseReference eust2Ref = mRootRef.child("eust2");
    DatabaseReference cnbt2Ref = mRootRef.child("cnbt2");
    DatabaseReference cnst2Ref = mRootRef.child("cnst2");

    DatabaseReference usbt3Ref = mRootRef.child("usbt3");
    DatabaseReference usst3Ref = mRootRef.child("usst3");
    DatabaseReference ukbt3Ref = mRootRef.child("ukbt3");
    DatabaseReference ukst3Ref = mRootRef.child("ukst3");
    DatabaseReference eubt3Ref = mRootRef.child("eubt3");
    DatabaseReference eust3Ref = mRootRef.child("eust3");
    DatabaseReference cnbt3Ref = mRootRef.child("cnbt3");
    DatabaseReference cnst3Ref = mRootRef.child("cnst3");

    DatabaseReference dateRef = mRootRef.child("date");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.activity_home, container, false);

        date = rootView.findViewById(R.id.date);

        usbt1 =  rootView.findViewById(R.id.usbt1);
        usst1 =  rootView.findViewById(R.id.usst1);
        ukbt1 =  rootView.findViewById(R.id.ukbt1);
        ukst1 =  rootView.findViewById(R.id.ukst1);
        eubt1 =  rootView.findViewById(R.id.eubt1);
        eust1 =  rootView.findViewById(R.id.eust1);
        cnbt1 =  rootView.findViewById(R.id.cnbt1);
        cnst1 =  rootView.findViewById(R.id.cnst1);

        usbt2 =  rootView.findViewById(R.id.usbt2);
        usst2 =  rootView.findViewById(R.id.usst2);
        ukbt2 =  rootView.findViewById(R.id.ukbt2);
        ukst2 =  rootView.findViewById(R.id.ukst2);
        eubt2 =  rootView.findViewById(R.id.eubt2);
        eust2 =  rootView.findViewById(R.id.eust2);
        cnbt2 =  rootView.findViewById(R.id.cnbt2);
        cnst2 =  rootView.findViewById(R.id.cnst2);

        usbt3 = rootView.findViewById(R.id.usbt3);
        usst3 = rootView.findViewById(R.id.usst3);
        ukbt3 = rootView.findViewById(R.id.ukbt3);
        ukst3 = rootView.findViewById(R.id.ukst3);
        eubt3 = rootView.findViewById(R.id.eubt3);
        eust3 = rootView.findViewById(R.id.eust3);
        cnbt3 = rootView.findViewById(R.id.cnbt3);
        cnst3 = rootView.findViewById(R.id.cnst3);

        return rootView;
    }

    @Override
    public void  onStart(){
        super.onStart();

        dateRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                date.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        usbt1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                usbt1.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        usst1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                usst1.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ukbt1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                ukbt1.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ukst1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                ukst1.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        eubt1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                eubt1.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        eust1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                eust1.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cnbt1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                cnbt1.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cnst1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                cnst1.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        usbt2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                usbt2.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        usst2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                usst2.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ukbt2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                ukbt2.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ukst2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                ukst2.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        eubt2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                eubt2.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        eust2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                eust2.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cnbt2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                cnbt2.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cnst2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                cnst2.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        usbt3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                usbt3.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        usst3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                usst3.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ukbt3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                ukbt3.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ukst3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                ukst3.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        eubt3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                eubt3.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        eust3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                eust3.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cnbt3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                cnbt3.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cnst3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                cnst3.setText(text);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
