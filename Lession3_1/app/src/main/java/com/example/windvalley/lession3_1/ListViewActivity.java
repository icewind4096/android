package com.example.windvalley.lession3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.windvalley.lession3_1.adapter.Fruit;
import com.example.windvalley.lession3_1.adapter.FruitAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private String[] data = {"apple", "banana", "orange", "wateMelon", "pear",
                            "grape", "pineapple", "strawberry", "cherry", "mango",
                            "apple_A", "banana_A", "orange_A", "wateMelon_A", "pear_A",
                            "grape_A", "pineapple_A", "strawberry_A", "cherry_A", "mango_A"};

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        initFruits();

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

/*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this,
                android.R.layout.simple_list_item_1,
                data);
*/
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
