package com.prakriti.myarrays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtIndex = findViewById(R.id.txtIndex);
        TextView txtValue = findViewById(R.id.txtValue);

        int SIZE = 12;
        float[] myArray = new float[SIZE];

        for(int i=0;i<myArray.length;i++) {
            myArray[i]=5+3*i;
        }

        for(int i = 0; i<myArray.length; i++) {

            String oldIndex = txtIndex.getText().toString();
            String oldValue = txtValue.getText().toString();

            txtIndex.setText(oldIndex+i+"\n");
            txtValue.setText(oldValue+myArray[i]+"\n");

        }

    }
}