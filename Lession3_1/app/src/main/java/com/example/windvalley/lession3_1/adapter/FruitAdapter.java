package com.example.windvalley.lession3_1.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.windvalley.lession3_1.R;

import java.util.List;

/**
 * Created by windvalley on 2018/2/15.
 */

public class FruitAdapter extends ArrayAdapter {
    private int resourceId;

    public FruitAdapter(@NonNull Context context, int resource, @NonNull List<Fruit> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int APosition, View AConvertView, ViewGroup AParent){
        Fruit fruit = (Fruit) getItem(APosition);
        View view;
        ViewHolder viewHolder;
        if (AConvertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, AParent, false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView) view.findViewById(R.id.fruit_imageId);
            viewHolder.fruitName = (TextView) view.findViewById(R.id.fruit_name);
            viewHolder.fruitPrice = (TextView) view.findViewById(R.id.fruit_price);
            view.setTag(viewHolder);
        } else {
            view = AConvertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());;
        viewHolder.fruitName.setText(fruit.getName());
        viewHolder.fruitPrice.setText(String.valueOf(fruit.getPrice()));
        return view;
    }

    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
        TextView fruitPrice;
    }
}
