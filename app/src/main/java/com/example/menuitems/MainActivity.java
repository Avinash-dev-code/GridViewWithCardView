package com.example.menuitems;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    public Integer[] mThumbIds = {
            R.drawable.mobile1, R.drawable.mobile1,
            R.drawable.mobile1, R.drawable.mobile1,
            R.drawable.mobile1, R.drawable.mobile1,
            R.drawable.mobile1, R.drawable.mobile1,
            R.drawable.mobile1, R.drawable.mobile1,
            R.drawable.mobile1, R.drawable.mobile1,
            R.drawable.mobile1, R.drawable.mobile1,
            R.drawable.mobile1, R.drawable.mobile1,
    };
    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView) findViewById(R.id.g1);
        GridView gridView1 = (GridView) findViewById(R.id.g2);


        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this,mThumbIds));

        dl = (DrawerLayout)findViewById(R.id.mmmm);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();




        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {

                    case R.id.Shoes:
                        Intent acc=new Intent(MainActivity.this,Main3Activity.class);
                        startActivity(acc);
                        break;






                    default:
                        return true;
                }


                return true;

            }
        });

    }
}
