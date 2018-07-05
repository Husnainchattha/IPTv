package com.umair.iptv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class Registration extends AppCompatActivity {
 private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        toolbar=findViewById(R.id.registrationtoolbar);
        toolbar.setTitle(R.string.registrationbtn);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
  toolbar.setNavigationOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          onBackPressed();
      }
  });
}}
