package com.example.menuitems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class Main3Activity extends AppCompatActivity {
    public Integer[] mThumbIds = {
            R.drawable.shoes1, R.drawable.shoes2,
            R.drawable.shoes1, R.drawable.shoes2,
            R.drawable.shoes1, R.drawable.shoes2,
            R.drawable.shoes1, R.drawable.shoes2,
            R.drawable.shoes1, R.drawable.shoes2,
            R.drawable.shoes1, R.drawable.shoes2,
            R.drawable.shoes1, R.drawable.shoes2,
            R.drawable.shoes1, R.drawable.shoes2,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        GridView gridView = (GridView) findViewById(R.id.g2);

        gridView.setAdapter(new ImageAdapter(this,mThumbIds));

    }
}
