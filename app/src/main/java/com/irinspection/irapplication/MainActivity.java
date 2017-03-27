package com.irinspection.irapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("IR App");
        toolbar.setNavigationIcon(R.drawable.ic_action_back);
        setSupportActionBar(toolbar);

        Button customerBtn = (Button)findViewById(R.id.customer_btn);
        Button expertBtn = (Button)findViewById(R.id.expert_btn);

        customerBtn.setOnClickListener(this);
        expertBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.customer_btn || v.getId()==R.id.expert_btn ){
            Intent intent = new Intent(this,SignIn.class);
            startActivity(intent);
        }
    }
}
