package com.example.aminu.wapaexchangekano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weekly extends AppCompatActivity {

    private Button next;
    private Button pre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly);

        next = (Button) findViewById(R.id.next);
        pre = (Button) findViewById(R.id.pre);
    }

    public void nextday(View view){
        Intent a = new Intent(this, Tuesday.class);
        startActivity(a);
    }

}
