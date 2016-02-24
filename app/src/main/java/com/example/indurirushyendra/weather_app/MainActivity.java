package com.example.indurirushyendra.weather_app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.d("OnCreate", "Activity Created");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("OnStop", "Activity Stopped");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("OnStart", "Activity Started");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("OnPause", "Activity Paused");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("OnResume", "Activity resumed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Ondestroy", "Activity Desstroyed");
    }

    public void worldClicked(View view){
        Toast.makeText(this,"World Clicked",Toast.LENGTH_LONG).show();
    }
    public void rushiClicked(View view){
        Toast.makeText(this,"Rushi Clicked",Toast.LENGTH_LONG).show();
    }
    public void androidClicked(View view){
        Toast.makeText(this,"Android Clicked",Toast.LENGTH_LONG).show();
    }
    public void weatherClicked(View view){
        Toast.makeText(this,"Weather App Clicked",Toast.LENGTH_LONG).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
