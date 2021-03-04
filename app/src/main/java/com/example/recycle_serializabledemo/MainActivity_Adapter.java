package com.example.recycle_serializabledemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity_Adapter extends RecyclerView.Adapter<MainActivity_Adapter.ViewHolder> {

    Context nContext;
    List<MainActivity_Model> nModelClass;

    public MainActivity_Adapter(Context nContext, List<MainActivity_Model> nModelClass) {
        this.nContext = nContext;
        this.nModelClass = nModelClass;
    }

    @NonNull
    @Override
    public MainActivity_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View recycleCustom = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlist,parent,false);
        return new ViewHolder(recycleCustom);

    }

    @Override
    public void onBindViewHolder(@NonNull MainActivity_Adapter.ViewHolder holder, int position) {

        MainActivity_Model modelclass = nModelClass.get(position);
        holder.TxtName.setText(modelclass.getTextName());
        holder.TxtMob.setText(modelclass.getTextMob());
        holder.TxtEmail.setText(modelclass.getTextEmail());
        holder.TxtAdd.setText(modelclass.getTextAdd());
        holder.TxtDob.setText(modelclass.getTextDob());

    }

    @Override
    public int getItemCount() {
        return nModelClass.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView TxtName,TxtMob,TxtEmail,TxtAdd,TxtDob;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            TxtName = itemView.findViewById(R.id.Recycletxtchange);
            TxtMob = itemView.findViewById(R.id.txtcustommobile);
            TxtEmail=itemView.findViewById(R.id.txtcustomemail);
            TxtAdd = itemView.findViewById(R.id.txtcustomaddress);
            TxtDob = itemView.findViewById(R.id.txtcustomdob);


            TxtName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    MainActivity_Model modeltext = nModelClass.get(getAdapterPosition());
                    Intent intent = new Intent(nContext,MainActivity2.class);
                    intent.putExtra("Name",modeltext);
                    nContext.startActivity(intent);

                }
            });


        }
    }


}
