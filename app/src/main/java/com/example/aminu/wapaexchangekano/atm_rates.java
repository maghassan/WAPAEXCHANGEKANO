package com.example.aminu.wapaexchangekano;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class atm_rates extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference PostRef;

    TextView hello;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm_rates);

        database = FirebaseDatabase.getInstance();
        PostRef = database.getReference("PostRef");

        hello = (TextView)findViewById(R.id.hello);
    }

    @Override
    public void  onStart(){
        super.onStart();

        PostRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String text = dataSnapshot.getValue(String.class);
                hello.setText(text);

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                String text = dataSnapshot.getValue(String.class);
                hello.setText(text);

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
