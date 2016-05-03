package com.example.digital05.digitalpoint;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by digital05 on 5/3/16.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private ImageView mImageView;

    public ImageAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return mImages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mImages[position]);
        return imageView;*/
        LayoutInflater myInflater = LayoutInflater.from(mContext);
        View customView = myInflater.inflate(R.layout.custom_row_view, parent, false);
        mImageView = (ImageView) customView.findViewById(R.id.row_image);
        mImageView.setImageResource(mImages[position]);

        return customView;

    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private Integer[] mImages = {
            R.drawable.image_2,
            R.drawable.image_4,
            R.drawable.image_4

    };
}
