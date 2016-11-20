package com.com.gaolei.myview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

/**
 * Created by Administrator on 16-9-27.
 */
public class MyViewPager extends ViewPager {

    private boolean flag=true;

    public MyViewPager(Context context) {
        super(context);
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void scrollTo(int x, int y) {
       if(flag){
           super.scrollTo(x, y);
       }
    }


}
