package com.example.windvalley.lession3_1.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.windvalley.lession3_1.R;

import java.util.List;

/**
 * Created by windvalley on 2018/2/16.
 */

public class FruitRecyclerAdaper extends RecyclerView.Adapter<FruitRecyclerAdaper.ViewHolder> {
    private List<Fruit> mFruitList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
        TextView fruitPrice;

        public ViewHolder(View itemView) {
            super(itemView);
            fruitImage = (ImageView) itemView.findViewById(R.id.fruit_imageId);
            fruitName = (TextView) itemView.findViewById(R.id.fruit_name);
            fruitPrice = (TextView) itemView.findViewById(R.id.fruit_price);
        }
    }

    public FruitRecyclerAdaper(List<Fruit> fruitList){
        mFruitList = fruitList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruititem, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fruit fruit = mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
        holder.fruitPrice.setText(String.valueOf(fruit.getPrice()));
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
