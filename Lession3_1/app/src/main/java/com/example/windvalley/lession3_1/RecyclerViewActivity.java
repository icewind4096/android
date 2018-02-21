package com.example.windvalley.lession3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.windvalley.lession3_1.adapter.Fruit;
import com.example.windvalley.lession3_1.adapter.FruitRecyclerAdaper;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initFruits();

        FruitRecyclerAdaper adapter = new FruitRecyclerAdaper(fruitList);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.mipmap.ic_launcher, 1.1);
        Fruit balana = new Fruit("Balana", R.mipmap.ic_launcher, 2.1);
        Fruit orange = new Fruit("Orange", R.mipmap.ic_launcher_round, 3.1);
        Fruit wateMelon = new Fruit("WateMelon", R.mipmap.ic_launcher_round, 4.1);
        fruitList.add(apple);
        fruitList.add(apple);
        fruitList.add(apple);
        fruitList.add(apple);
        fruitList.add(apple);
        fruitList.add(apple);
        fruitList.add(apple);
        fruitList.add(apple);
        fruitList.add(apple);
        fruitList.add(apple);
        fruitList.add(apple);
        fruitList.add(balana);
        fruitList.add(orange);
        fruitList.add(wateMelon);
    }
}

/*
        FruitAdapter adapter = new FruitAdapter(ListViewActivity.this, R.layout.fruititem, fruitList);
        ListView listView = findViewById(R.id.listViewListViewActivity);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit fruit = fruitList.get(i);
                Toast.makeText(ListViewActivity.this, fruit.getName(),Toast.LENGTH_LONG).show();
            }
        });

 */