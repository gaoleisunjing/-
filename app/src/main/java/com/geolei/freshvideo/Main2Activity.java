package com.geolei.freshvideo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;

import com.com.gaolei.myview.MyViewPager;
import com.com.gaolei.fragment.Fragment1;
import com.com.gaolei.fragment.Fragment2;
import com.com.gaolei.fragment.Fragment3;
import com.com.gaolei.fragment.Fragment4;
import com.gaolei.fragmentadapter.Main2FragmentAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends FragmentActivity {

    TabLayout tabLayout;
    MyViewPager pager;
    List<Fragment> list;
    Main2FragmentAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setTheme(R.style.FreshTheme);
        setContentView(R.layout.activity_main2);

        initView();
        initData();
        initAdapter();

    }

    private void initAdapter() {
        adapter = new Main2FragmentAdapter(getSupportFragmentManager(), list);
        pager.setAdapter(adapter);

//        tabLayout.setupWithViewPager(pager);
//        for (int i = 0; i <adapter.getCount() ; i++) {
//            TabLayout.Tab tab=tabLayout.getTabAt(i);
//            if(i==0){
//                tab.setText("热门");
//                pager.setCurrentItem(0);
//            }else if(i==1){
//                tab.setText("分类");
//                pager.setCurrentItem(1);
//
//            }else if(i==2){
//                tab.setText("精选");
//                pager.setCurrentItem(2);
//            }else {
//                tab.setText("猜你喜欢");
//                pager.setCurrentItem(3);
//            }
//        }
//        pager.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                return true;
//            }
//        });

    }

    private void initData() {
//        Fragment1 fragment1=new Fragment1();
//        Fragment2 fragment2=new Fragment2();
        Fragment3 fragment3 = new Fragment3();
//        Fragment4 fragment4=new Fragment4();

        list = new ArrayList<>();
//        list.add(fragment1);
//       list.add(fragment2);
        list.add(fragment3);
//        list.add(fragment4);

    }

    private void initView() {
        tabLayout = (TabLayout) findViewById(R.id.tabId);
        pager = (MyViewPager) findViewById(R.id.pageId);

    }

}
