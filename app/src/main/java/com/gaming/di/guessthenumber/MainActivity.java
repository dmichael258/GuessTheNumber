package com.gaming.di.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Fish = (TextView)findViewById(R.id.textView2);

        Fish.setText("Fishing");
    }
}
