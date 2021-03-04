package com.example.recycle_serializabledemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class RecycleSerailization_GridL1 extends AppCompatActivity {
    Button btnproductadd;
    RecyclerView RecycleView;
    List<RecycleModelClass> RModelList;
    RecycleModelClass Rmodelclass;
    RecycleAdapterClass RAdapterclass;
    static final int Request_Code=111;
    int NumberofColumns = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_serailization__grid_l1);

        btnproductadd = findViewById(R.id.addproductbtn);
        RecycleView = findViewById(R.id.list_recycle);
        btnproductadd.setOnClickListener(new ProductAddBtn());

        RModelList = new ArrayList<>();
        RAdapterclass = new RecycleAdapterClass(this,RModelList);
        RecycleView.setHasFixedSize(true);
        RecycleView.setAdapter(RAdapterclass);
        RecycleView.setLayoutManager(new GridLayoutManager(this,NumberofColumns));

    }

    class ProductAddBtn implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(RecycleSerailization_GridL1.this,RecycleSerailization_GridL2.class);
            startActivityForResult(intent,Request_Code);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (Request_Code==requestCode){
            if (Activity.RESULT_OK==resultCode){

                String Name = data.getStringExtra("Name");
                String Content = data.getStringExtra("Content");
                String Style= data.getStringExtra("Style");
                String Pattern = data.getStringExtra("Pattern");
                String Colour= data.getStringExtra("Colour");
                String Price=data.getStringExtra("Price");
                String Material= data.getStringExtra("Material");
                String Dimensions=data.getStringExtra("Dimension");
                String Note =data.getStringExtra("Note");
                byte[] image = data.getByteArrayExtra("Image");

                Rmodelclass = new RecycleModelClass();
                Rmodelclass.setProudctname(Name);
                Rmodelclass.setProductcontent(Content);
                Rmodelclass.setProductstyle(Style);
                Rmodelclass.setProductpattern(Pattern);
                Rmodelclass.setProductcolour(Colour);
                Rmodelclass.setProductprice(Price);
                Rmodelclass.setProductmaterial(Material);
                Rmodelclass.setProductdimension(Dimensions);
                Rmodelclass.setProductnote(Note);
                Rmodelclass.setProductimage(image);
                RModelList.add(Rmodelclass);
                RAdapterclass.notifyDataSetChanged();
            }
        }
    }
}