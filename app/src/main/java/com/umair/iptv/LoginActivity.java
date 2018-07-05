package com.umair.iptv;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.umair.iptv.Profile.ProfileActivity;

public class LoginActivity extends AppCompatActivity {
private Toolbar toolbar;
private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context=this;
        setContentView(R.layout.activity_login2);
        toolbar=findViewById(R.id.logintoolbar);
        toolbar.setTitle(R.string.loginbtn);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    public void onclick(View view){
        Intent intent= new Intent(LoginActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
