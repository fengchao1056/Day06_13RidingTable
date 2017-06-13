package com.example.a123.day06_13ridingtable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.youth.banner.Banner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Banner banner;
    private ArrayList<String> list=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image();
        initView();


    }

    private void image() {
        list = new ArrayList<String>();
        String url1 = "http://i2.hoopchina.com.cn/blogfile/201109/11/131575128186250.jpg";
        String url2 = "http://img5.imgtn.bdimg.com/it/u=79204278,223740785&fm=23&gp=0.jpg";
        String url3 = "http://img4.imgtn.bdimg.com/it/u=3352680925,2639186071&fm=23&gp=0.jpg";
        String url4 = "http://img4.imgtn.bdimg.com/it/u=1126414475,2320204853&fm=11&gp=0.jpg";
        String url5 = "http://img3.imgtn.bdimg.com/it/u=1146435381,3068752404&fm=23&gp=0.jpg";
        String url6 = "http://img0.imgtn.bdimg.com/it/u=1728852316,293619434&fm=23&gp=0.jpg";
        String url7 = "http://img5.imgtn.bdimg.com/it/u=3225780280,342083917&fm=23&gp=0.jpg";
        String url8 = "http://img5.imgtn.bdimg.com/it/u=1420069936,911018443&fm=23&gp=0.jpg";
        String url9 = "http://img4.imgtn.bdimg.com/it/u=1893143688,2461133000&fm=23&gp=0.jpg";
        String url10 = "http://img1.imgtn.bdimg.com/it/u=3572078768,4251688599&fm=23&gp=0.jpg";
        String url11 = "http://img4.imgtn.bdimg.com/it/u=381963663,1414631635&fm=23&gp=0.jpg";
        String url12 = "http://img2.imgtn.bdimg.com/it/u=934912900,4180268966&fm=11&gp=0.jpg";
        String url13 = "http://img3.imgtn.bdimg.com/it/u=1737769840,647347577&fm=11&gp=0.jpg";
        list.add(url1);
        list.add(url2);
        list.add(url3);
        list.add(url4);
        list.add(url5);
        list.add(url6);
        list.add(url7);
        list.add(url8);

    }

    private void initView() {
        banner = (Banner) findViewById(R.id.mybanner);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(2000);
        //设置图片集合
        banner.setImages(list);
        banner.start();

    }
}
