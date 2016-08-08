package com.lp.trynus;

import android.content.Context;
import android.provider.Settings;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


/**
 * Created by root on 3/30/16.
 */
public class GridAdapter extends BaseAdapter {

    private Context context;

    public GridAdapter(Context context){

        this.context = context;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(context);
            //imageView.setLayoutParams(new GridView.LayoutParams(100,100));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(1, 1, 1, 1);
            imageView.setAdjustViewBounds(true);//si si si ss isis isis
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;

    }

    private Integer[] mThumbIds = {
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example,
            R.drawable.example, R.drawable.example

    };

}
