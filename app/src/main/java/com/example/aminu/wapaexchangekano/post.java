package com.example.aminu.wapaexchangekano;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class post extends AppCompatActivity {

    TextView hello;

    FirebaseDatabase database;
    DatabaseReference myRef;

    DatabaseReference mHello = myRef.child("hello");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Data");

        hello = (TextView)findViewById(R.id.hello);
    }

    @Override
    public void  onStart(){
        super.onStart();

        mHello.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                hello.setText(text);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
