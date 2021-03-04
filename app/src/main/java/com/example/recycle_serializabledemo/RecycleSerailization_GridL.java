package com.example.recycle_serializabledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RecycleSerailization_GridL extends AppCompatActivity {
    ImageView Myntralogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_serailization__grid_l);

        Myntralogo = findViewById(R.id.Myntralogo);
        Myntralogo.setOnClickListener(new myntraclicklistener());


    }

    class myntraclicklistener implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(RecycleSerailization_GridL.this, RecycleSerailization_GridL1.class);
            startActivity(intent);

        }
    }
}