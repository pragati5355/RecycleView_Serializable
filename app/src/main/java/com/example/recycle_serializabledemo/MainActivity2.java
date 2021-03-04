package com.example.recycle_serializabledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtname,txtmob,txtemail,txtadd,txtdob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtname = findViewById(R.id.TxtNameEdt);
        txtmob = findViewById(R.id.Txtmobedt);
        txtemail = findViewById(R.id.TxtEmailedt);
        txtadd = findViewById(R.id.TxtAddedt);
        txtdob = findViewById(R.id.TxtDobedt);

        MainActivity_Model namesmodel = (MainActivity_Model) getIntent().getSerializableExtra("Name");

        txtname.setText(namesmodel.getTextName());
        txtmob.setText(namesmodel.getTextMob());
        txtemail.setText(namesmodel.getTextEmail());
        txtadd.setText(namesmodel.getTextAdd());
        txtdob.setText(namesmodel.getTextDob());





    }
}