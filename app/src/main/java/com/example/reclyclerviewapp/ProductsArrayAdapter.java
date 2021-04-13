package com.example.reclyclerviewapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductsArrayAdapter extends
        RecyclerView.Adapter<ProductsArrayAdapter.ViewHolder> {
    @NonNull
    @Override
    public ProductsArrayAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsArrayAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewName;
        TextView textViewPrice;
        CheckBox checkBox;


        public ViewHolder(View itemView){
            super(itemView);
            textViewName= itemView.findViewById(R.id.textViewName);
            textViewPrice=itemView.findViewById(R.id.textViewPrice);
            checkBox= itemView.findViewById(R.id.checkBox);


        }


    }



}
