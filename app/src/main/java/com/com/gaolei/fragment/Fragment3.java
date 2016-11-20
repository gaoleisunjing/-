package com.com.gaolei.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.com.gaolei.bean.Selection4;
import com.com.gaolei.load.HandlerUtils;
import com.com.gaolei.load.HandlerUtilsSelection;
import com.gaolei.recycler_adapter.Fragment3RecycleAdapter;
import com.geolei.freshvideo.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Administrator on 16-9-26.
 */
public class Fragment3 extends Fragment {

    View view;
    RecyclerView recyclerView;
    Fragment3RecycleAdapter adapter;
    List<Selection4> datalist;
    String PATH_DATA = "http://api.fresh.moliv.cn/home.aspx?fv=&v=26&u=4e386bfc-cf76-44ad-9f76-de06b7743905&app=mf&os=5.1&c=android&bt=1&vn=1.1.26&did=mac683e345131e2&uid=mac683e345131e2&vb=1.1.26%28Official%29&md=m2+note&mc=Market_MP&bd=m2note&tv=0&bus=&vs=1&service=0&atd=1&appseid=92962d6e-e7a9-4bbe-87e1-bf01336da8f0&lr=self";

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 4) {
                datalist = (List<Selection4>) msg.obj;
                Log.d("gl", "datalist" + datalist.size());
                adapter = new Fragment3RecycleAdapter(getActivity(), datalist);
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
                adapter.setOnFragemnt3ClickListener(new Fragment3RecycleAdapter.OnFragment3ClickListener() {
                    @Override
                    public void onClick(RecyclerView recyclerView, View view, int position) {
                        Toast.makeText(getActivity(),String.format(Locale.CHINA,"第%02d个数据%s",position,position%2==0?"高磊":"陈杰熙"),Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    };

    public Fragment3 getInstance() {
        Fragment3 fragment1 = new Fragment3();
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
        view = inflater.inflate(R.layout.fragment3, container, false);

        initView();
        initData();
        return view;
    }

    private void initData() {
        HandlerUtilsSelection jsonString = new HandlerUtilsSelection(handler);
        jsonString.loadJstring(PATH_DATA);

    }


    private void initView() {
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_fragment3Id);
        datalist = new ArrayList<>();
        recyclerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //事件分发  要求父类不要拦截 自己就可以处理数据了
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return super.onContextItemSelected(item);

    }
}
