package com.ivoafsilva.viewpagerspike;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by iafsilva on 3/13/18.
 */

public class ViewPagerAdapter extends PagerAdapter {
    /**
     * {@link Context} used to get the {@link LayoutInflater}
     */
    private Context mContext;
    /**
     * The array of image ids to be shown with this adapter.
     */
    private int[] mImageIds;

    public ViewPagerAdapter(Context context, int[] imageIds) {
        mContext = context;
        mImageIds = imageIds;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflater =(LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ImageView imageView = (ImageView) layoutInflater.inflate(R.layout.view_pager_item, container, false);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager)container).removeView((View)object);
    }
}
