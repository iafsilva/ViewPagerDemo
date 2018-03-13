package com.ivoafsilva.viewpagerspike;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * Constant array containing the image ids to be inserted into the ViewPager.
     */
    private static final int[] sViewPagerImageIds = {R.drawable.check, R.drawable.error, R.drawable.star};

    /**
     * The {@link ViewPager} instance
     */
    private ViewPager mViewPager;

    /**
     * The {@link PagerAdapter} used with {@code mViewPager}
     */
    private ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.viewpager);
        mViewPagerAdapter = new ViewPagerAdapter(this, sViewPagerImageIds);
        mViewPager.setAdapter(mViewPagerAdapter);
    }
}
