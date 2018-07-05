package com.umair.iptv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void OnClick(View view)
    {
        Intent intent= new Intent(Main.this,LoginActivity.class);
        startActivity(intent);
    }
    public void Onclick(View view){
        Intent intent=new Intent(Main.this,Registration.class);
        startActivity(intent);

    }
}
