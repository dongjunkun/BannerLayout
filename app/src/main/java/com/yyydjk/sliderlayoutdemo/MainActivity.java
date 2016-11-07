package com.yyydjk.sliderlayoutdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.yyydjk.library.BannerLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BannerLayout bannerLayout = (BannerLayout) findViewById(R.id.banner);
        BannerLayout bannerLayout2 = (BannerLayout) findViewById(R.id.banner2);
        //setListener必须在setViewUrls之前
        bannerLayout.setListener(new BannerLayout.ImageSetListener() {
            @Override
            public void setImage(Object res, ImageView imageView, int defaultImage) {
                if (defaultImage != 0) {
                    Glide.with(MainActivity.this).load(res).placeholder(defaultImage).centerCrop().into(imageView);
                } else {
                    Glide.with(MainActivity.this).load(res).centerCrop().into(imageView);
                }
            }
        });
        bannerLayout2.setListener(new BannerLayout.ImageSetListener() {
            @Override
            public void setImage(Object res, ImageView imageView, int defaultImage) {
                if (defaultImage != 0) {
                    Glide.with(MainActivity.this).load(res).placeholder(defaultImage).centerCrop().into(imageView);
                } else {
                    Glide.with(MainActivity.this).load(res).centerCrop().into(imageView);
                }
            }
        });

        final List<String> urls = new ArrayList<>();
        urls.add("http://img3.imgtn.bdimg.com/it/u=2674591031,2960331950&fm=23&gp=0.jpg");
        urls.add("http://img5.imgtn.bdimg.com/it/u=3639664762,1380171059&fm=23&gp=0.jpg");
        urls.add("http://img0.imgtn.bdimg.com/it/u=1095909580,3513610062&fm=23&gp=0.jpg");
        urls.add("http://img4.imgtn.bdimg.com/it/u=1030604573,1579640549&fm=23&gp=0.jpg");
        urls.add("http://img5.imgtn.bdimg.com/it/u=2583054979,2860372508&fm=23&gp=0.jpg");
        bannerLayout.setViewUrls(urls);

        //添加监听事件
        bannerLayout.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });

        //低于三张
        final List<String> urls2 = new ArrayList<>();
        urls2.add("http://img3.imgtn.bdimg.com/it/u=2674591031,2960331950&fm=23&gp=0.jpg");
        urls2.add("http://img5.imgtn.bdimg.com/it/u=3639664762,1380171059&fm=23&gp=0.jpg");
        bannerLayout2.setViewUrls(urls2);
    }
}
