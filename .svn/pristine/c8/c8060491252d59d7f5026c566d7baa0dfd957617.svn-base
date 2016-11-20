package com.com.gaolei.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.com.gaolei.bean.Selection;
import com.com.gaolei.bean.Selection2;
import com.com.gaolei.load.HandlerUtils;
import com.gaolei.recycler_adapter.Fragment2RecycleAdapter;
import com.geolei.freshvideo.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Administrator on 16-9-26.
 */
public class Fragment2 extends Fragment {

    View view;
    RecyclerView recyclerView;
    String PATH_DATA = "http://api.fresh.moliv.cn/home.aspx?fv=&v=26&u=4e386bfc-cf76-44ad-9f76-de06b7743905&app=mf&os=5.1&c=android&bt=1&vn=1.1.26&did=mac683e345131e2&uid=mac683e345131e2&vb=1.1.26%28Official%29&md=m2+note&mc=Market_MP&bd=m2note&tv=0&bus=&vs=1&service=0&atd=1&appseid=92962d6e-e7a9-4bbe-87e1-bf01336da8f0&lr=self";
    List<Selection.DataBean> data;
    List<Selection.TabsBean> tabData;
    List<Selection2.DataBean> datas;
    Fragment2RecycleAdapter adapter;


    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            switch (msg.what) {
//                case 1:
//                data= (List<Selection.DataBean>) msg.obj;
//
//
//                    break;
//                case 2:
//                tabData= (List<Selection.TabsBean>) msg.obj;

                case 3:
                    datas = (List<Selection2.DataBean>) msg.obj;
       //             Log.d("gl", "datas====" + datas.get(1).getUi().getTitle());
                    adapter = new Fragment2RecycleAdapter(datas, getActivity());
                    recyclerView.setAdapter(adapter);
                    // recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
                    recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL));
                    adapter.setOnFragment2ClickListener(new Fragment2RecycleAdapter.OnFragment2ClickListener() {
                        @Override
                        public void onClick(RecyclerView recyclerView, View view, int posititon) {
                            Toast.makeText(getActivity(),String.format(Locale.CHINA,"这是第%02d个数据%s",posititon+1,posititon%2==0?"gggg":"pppp"),Toast.LENGTH_SHORT).show();
                        }
                    });
                    break;
            }
        }
    };
    public Fragment2 getInstance() {
        Fragment2 fragment1 = new Fragment2();
        Bundle bundle = new Bundle();
        bundle.putString("fragment1", "xx");
        fragment1.setArguments(bundle);

        return fragment1;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment2, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_fragment2Id);
        initListener();
        initData();

        return view;
    }

    private void initListener() {

        recyclerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
             recyclerView.getParent().requestDisallowInterceptTouchEvent(true);

                return false;
            }
        });

    }

    private void initData() {
        data = new ArrayList<>();
        tabData = new ArrayList<>();
        datas = new ArrayList<>();

        HandlerUtils js = new HandlerUtils(handler);
        js.loadJstring(PATH_DATA);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
    }
}
