一款简洁实用的android广告栏，参考了[AndroidImageSlider](https://github.com/daimajia/AndroidImageSlider)和[BGABanner-Android](https://github.com/bingoogolapple/BGABanner-Android)结合自己的理解而成

###预览

###使用
**xml**

```
<com.yyydjk.sliderlayoutdemo.BannerLayout
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

**代码中**

```
bannerLayout.setViewUrls(urls);
```

###关于我
简书：[dongjunkun](http://www.jianshu.com/users/f07458c1a8f3/latest_articles)