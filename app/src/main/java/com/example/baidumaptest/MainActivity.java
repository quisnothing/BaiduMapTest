package com.example.baidumaptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.activity_main);
        mapView=(MapView)findViewById(R.id.map_view);
    }

    protected void onDestroy(){
        super.onDestroy();
        mapView.onDestroy();
    }

    protected void onPause(){
        super.onPause();
        mapView.onPause();
    }

    protected void onResume(){
        super.onResume();
        mapView.onResume();
    }
}
