package com.example.recycle_serializabledemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class RecycleSerailization_GridL2 extends AppCompatActivity {
    EditText pdtName, pdtContent, pdtColour, pdtPattern, pdtMaterial, pdtDimension, pdtNote, pdtPrice, pdtStyle;
    Button pdtimageaddbtn, BtnAdd;
    ImageView pdtImage;
    int GALLERY_REQUEST_CODE = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_serailization__grid_l2);

        pdtName = findViewById(R.id.productname);
        pdtContent = findViewById(R.id.productcontent);
        pdtColour = findViewById(R.id.productcolour);
        pdtPattern = findViewById(R.id.productpattern);
        pdtMaterial = findViewById(R.id.productmaterial);
        pdtDimension = findViewById(R.id.productdimension);
        pdtPrice = findViewById(R.id.productprice);
        pdtStyle = findViewById(R.id.productstyle);
        pdtNote = findViewById(R.id.productnote);
        pdtimageaddbtn = findViewById(R.id.productbtn);
        pdtImage = findViewById(R.id.productimage);
        BtnAdd = findViewById(R.id.ButtonAdd);

        BtnAdd.setOnClickListener(new ADDclicklistener());
        pdtimageaddbtn.setOnClickListener(new ImagebtnAdd());
    }

    class ADDclicklistener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            byte[] get_byt_array = new byte[0];

            try {
                get_byt_array = convert_byet_array(pdtImage);
            } catch (Exception e) {
                Toast.makeText(RecycleSerailization_GridL2.this, "Error" + e, Toast.LENGTH_LONG).show();
            }

                Intent intent = new Intent(RecycleSerailization_GridL2.this, RecycleSerailization_GridL1.class);

            String name = pdtName.getText().toString().trim();
            String content = pdtContent.getText().toString().trim();
            String colour = pdtColour.getText().toString().trim();
            String pattern = pdtPattern.getText().toString().trim();
            String material = pdtMaterial.getText().toString().trim();
            String dimension = pdtDimension.getText().toString().trim();
            String price = pdtPrice.getText().toString().trim();
            String style = pdtStyle.getText().toString().trim();
            String note = pdtNote.getText().toString().trim();

                intent.putExtra("Name", name);
                intent.putExtra("Content", content);
                intent.putExtra("Colour", colour);
                intent.putExtra("Pattern", pattern);
                intent.putExtra("Material", material);
                intent.putExtra("Dimension", dimension);
                intent.putExtra("Price", price);
                intent.putExtra("Style", style);
                intent.putExtra("Note", note);
                intent.putExtra("Image",get_byt_array);
                setResult(Activity.RESULT_OK, intent);
                finish();

        }
    }

        class ImagebtnAdd implements View.OnClickListener {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                Toast.makeText(RecycleSerailization_GridL2.this, "RECENT IMAGES HAS OPENED", Toast.LENGTH_LONG).show();
                startActivityForResult(intent, GALLERY_REQUEST_CODE);

            }
        }

        @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GALLERY_REQUEST_CODE && resultCode == RecycleSerailization_GridL2.RESULT_OK) {
          //  Bitmap image = (Bitmap) data.getExtras().get("data");      //set capture image to imageview
           // pdtImage.setImageBitmap(image);
           Uri image = data.getData();
           pdtImage.setImageURI(image);

        }

    }

    byte[] convert_byet_array(ImageView im)
    {
        Bitmap image = ((BitmapDrawable) im.getDrawable()).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.PNG,100,stream);
        byte[] bytearray = stream.toByteArray();
        return bytearray;
    }
}



