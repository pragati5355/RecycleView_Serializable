package com.example.recycle_serializabledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecycleSerailization_GridL3 extends AppCompatActivity {
    ImageView PdtImage;
    TextView PdtStyle,Pdtprice,PdtContent,PdtColour,PdtPattern,PdtMaterial,PdtDimension,PdtNote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_serailization__grid_l3);

        PdtImage = findViewById(R.id.Grid3Image);
        PdtStyle = findViewById(R.id.Grid3Style);
        Pdtprice = findViewById(R.id.Grid3price);
        PdtContent = findViewById(R.id.Grid3content);
        PdtColour = findViewById(R.id.Grid3colour);
        PdtPattern = findViewById(R.id.Grid3pattern);
        PdtMaterial = findViewById(R.id.Grid3material);
        PdtDimension = findViewById(R.id.Grid3dimension);
        PdtNote = findViewById(R.id.Grid3Note);

         RecycleModelClass ClassModel = (RecycleModelClass) getIntent().getSerializableExtra("Namee");

         PdtStyle.setText(ClassModel.getProductstyle());
         Pdtprice.setText(ClassModel.getProductprice());
         PdtContent.setText(ClassModel.getProductcontent());
         PdtColour.setText(ClassModel.getProductcolour());
         PdtPattern.setText(ClassModel.getProductpattern());
         PdtNote.setText(ClassModel.getProductnote());
         PdtMaterial.setText(ClassModel.getProductmaterial());
         PdtDimension.setText(ClassModel.getProductdimension());

         byte[] getImage= ClassModel.getProductimage();
         Bitmap bmp = BitmapFactory.decodeByteArray(getImage,0,getImage.length);
         PdtImage.setImageBitmap(bmp);

    }
}