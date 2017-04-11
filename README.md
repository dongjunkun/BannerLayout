[![](https://jitpack.io/v/dongjunkun/BannerLayout.svg)](https://jitpack.io/#dongjunkun/BannerLayout)

一款简洁实用的android广告栏，参考了[AndroidImageSlider](https://github.com/daimajia/AndroidImageSlider)和[BGABanner-Android](https://github.com/bingoogolapple/BGABanner-Android)结合自己的理解而成

### 预览
<img src="https://raw.githubusercontent.com/dongjunkun/BannerLayoutDemo/master/art/bannerLayoutDemo1.gif"/>

<a href="https://raw.githubusercontent.com/dongjunkun/BannerLayout/master/bannerlayoutsimple.apk">DownLoad APK</a>

或者扫描二维码下载

<img src="https://raw.githubusercontent.com/dongjunkun/BannerLayoutDemo/master/art/1453087757.png"/>

## Gradle Dependency
```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}

dependencies {
     compile 'com.github.dongjunkun:BannerLayout:1.0.6'
}

```

### 使用
**xml**
```
<com.yyydjk.library.BannerLayout
        android:id="@+id/banner"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        app:autoPlayDuration="5000"
        app:indicatorMargin="10dp"
        app:indicatorPosition="rightBottom"
        app:indicatorShape="rect"
        app:indicatorSpace="3dp"
        app:scrollDuration="1100"
        app:selectedIndicatorColor="?attr/colorPrimary"
        app:selectedIndicatorHeight="6dp"
        app:selectedIndicatorWidth="6dp"
        app:unSelectedIndicatorColor="#99ffffff"
        app:unSelectedIndicatorHeight="6dp"
        app:unSelectedIndicatorWidth="6dp" />
```

**代码中使用**
```
//网络地址
bannerLayout.setViewUrls(urls);

//设置加载器
bannerLayout.setImageLoader(new GlideImageLoader());

//本地资源
bannerLayout.setViewRes(viewRes);

//添加点击监听
bannerLayout.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
```

### 关于我
简书：[dongjunkun](http://www.jianshu.com/users/f07458c1a8f3/latest_articles)
