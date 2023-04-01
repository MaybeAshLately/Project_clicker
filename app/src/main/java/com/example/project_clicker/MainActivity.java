package com.example.project_clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.util.Log;
import android.widget.TextView;




//implements View.OnClickListener
public class MainActivity extends AppCompatActivity  {
    int n=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.textView);

         TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(String.valueOf(n));
        button.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View v) {
                                          ++n;
                                          textView2.setText(String.valueOf(n));

                                      }
                                  });



    }



}
