package com.example.homwork3_3_1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<FruitsViewHolder> {
    private ArrayList<String>fruitsList;

    public Adapter(ArrayList<String> foodList) {
        this.fruitsList = fruitsList;
    }

    @NonNull
    @Override
    public FruitsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FruitsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ftuits,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FruitsViewHolder holder, int position) {
        holder.bind(fruitsList.get(position));

    }

    @Override
    public int getItemCount() {
        return fruitsList.size() ;
    }
}


