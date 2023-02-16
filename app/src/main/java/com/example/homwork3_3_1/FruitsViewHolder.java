package com.example.homwork3_3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
 public class FruitsViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_fruits;
    public FruitsViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_fruits=itemView.findViewById(R.id.lv_ftuits);


    }


    void bind(String food){
        tv_fruits.setText(food);

        }
        }


