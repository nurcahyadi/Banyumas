package com.example.nurcahyadiperdana.banyumas.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.nurcahyadiperdana.banyumas.R;

/**
 * Created by nurcahyadiperdana on 11/4/17.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public ImageAdapter(Context c){
        mContext = c;
    }
    @Override
    public int getCount() {
        return mThumbs.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (view==null){

            imageView = new ImageView(mContext);

            imageView.setLayoutParams(new GridView.LayoutParams(400,400));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setPadding(0,0,0,0);
        }
        else {
            imageView = (ImageView) view;
        }

        imageView.setImageResource(mThumbs[i]);

        return imageView;
    }

    private Integer[] mThumbs={
            R.drawable.store, R.drawable.wisata, R.drawable.kuliner,R.drawable.event
    };
}
