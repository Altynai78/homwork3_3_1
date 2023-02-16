package com.example.homwork3_3_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import com.example.homwork3_3_1.FruitsAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> fruitsList;
    private FruitsAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.lv_ftuits);
        loaData();
        adapter = new FruitsAdapter(fruitsList) {


        };
    }




    private void loaData() {
        fruitsList= new ArrayList<>();
        fruitsList.add("Алма");
        fruitsList.add("Алмурут");
        fruitsList.add("Алма");
        fruitsList.add("Алча");
        fruitsList.add("Анар");
        fruitsList.add("Орук");
        fruitsList.add("Мандарин");
        fruitsList.add("Апельсин");
        fruitsList.add("Жузум");
        fruitsList.add("Банан");
        fruitsList.add("Киви");


    }


    }
