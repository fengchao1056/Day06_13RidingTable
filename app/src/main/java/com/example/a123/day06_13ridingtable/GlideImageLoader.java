package com.example.a123.day06_13ridingtable;


import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object o, ImageView imageView) {
        Glide.with(context).load(o).into(imageView);
    }

    @Override
    public ImageView createImageView(Context context) {
        ImageView imageView=new ImageView(context);
        return imageView;

    }
}
