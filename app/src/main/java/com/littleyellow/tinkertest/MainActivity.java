package com.littleyellow.tinkertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Tinker",BuildConfig.VERSION_NAME);
        TextView test = findViewById(R.id.test);
        test.setText(BuildConfig.VERSION_NAME+"%%%%%%%%%%%%");
    }
}
