package com.example.ylsn.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;

public class MapActivity extends AppCompatActivity {

    private MapView mapView = null;
    private AMap aMap = null;
    private Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        mapView = (MapView) findViewById(R.id.map);
        //保存地图状态
        mapView.onCreate(savedInstanceState);
        if(aMap == null) {
            //显示地图
            aMap = mapView.getMap();
        }
        spin=(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                TextView view0=(TextView) findViewById(R.id.text);
                String str="您现在在"+getResources().getStringArray(R.array.medal)[position]+"，该博物馆。。。。";
                view0.setText(str);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

}
