package com.jonmid.qiuz;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PantallaUnoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_uno);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivityTwo(view);
            }
        });
    }

    public void goActivityTwo(View view){
        Intent intent = new Intent(this, PantallaDosActivity.class);
        startActivity(intent);
    }
}
