package com.example.ylsn.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        if(view==findViewById(R.id.login)){
            Intent login_to_map=new Intent(this,MapActivity.class);
            startActivity(login_to_map);
        }
        if(view==findViewById(R.id.found)){
        Intent login_to_found=new Intent(this,FoundActivity.class);
        startActivity(login_to_found);}
        if(view==findViewById(R.id.sig)){
            Intent login_to_sign=new Intent(this,SignActivity.class);
            startActivity(login_to_sign);
        }
    }
}
