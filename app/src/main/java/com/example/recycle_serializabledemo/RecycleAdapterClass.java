package com.example.recycle_serializabledemo;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapterClass extends RecyclerView.Adapter<RecycleAdapterClass.ViewHolder> {

    Context mContext;
    List<RecycleModelClass> mModelRecycle;

    public RecycleAdapterClass(Context mContext, List<RecycleModelClass> mModelRecycle) {
        this.mContext = mContext;
        this.mModelRecycle = mModelRecycle;
    }

    @NonNull
    @Override
    public RecycleAdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View customrecycle = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recyclecustom,parent,false);
        return new ViewHolder(customrecycle);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapterClass.ViewHolder holder, int position) {

        RecycleModelClass modelclass = mModelRecycle.get(position);
        holder.Name.setText(modelclass.getProudctname());
        holder.Style.setText(modelclass.getProductstyle());
        holder.Content.setText(modelclass.getProductcontent());
        holder.Colour.setText(modelclass.getProductcolour());
        holder.Pattern.setText(modelclass.getProductpattern());
        holder.Price.setText(modelclass.getProductprice());
        holder.Material.setText(modelclass.getProductmaterial());
        holder.Note.setText(modelclass.getProductnote());
        holder.Dimension.setText(modelclass.getProductdimension());

        byte[] getImage =modelclass.getProductimage();
        Bitmap bmp = BitmapFactory.decodeByteArray(getImage,0,getImage.length);
        holder.Image.setImageBitmap(bmp);



    }

    @Override
    public int getItemCount() {
        return mModelRecycle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView Name,Content,Pattern,Price,Style,Colour,Material,Dimension,Note;
        ImageView Image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.customname);
            Content = itemView.findViewById(R.id.customcontent);
            Pattern = itemView.findViewById(R.id.custompattern);
            Price = itemView.findViewById(R.id.customprice);
            Style = itemView.findViewById(R.id.customstyle);
            Colour = itemView.findViewById(R.id.customcolour);
            Material = itemView.findViewById(R.id.custommaterial);
            Dimension = itemView.findViewById(R.id.customdimension);
            Note = itemView.findViewById(R.id.custonnote);
            Image = itemView.findViewById(R.id.customimage);

            Name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    RecycleModelClass classmodel =  mModelRecycle.get(getAdapterPosition());
                    Intent intent = new Intent(mContext,RecycleSerailization_GridL3.class);
                    intent.putExtra("Namee",classmodel);
                    mContext.startActivity(intent);
                }
            });
        }
    }
}
