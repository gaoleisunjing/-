package com.com.gaolei.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.com.gaolei.likebean.Like;
import com.com.gaolei.load.HandlerUtilsLike;
import com.gaolei.recycler_adapter.Fragment4RecyclerAdapter;
import com.geolei.freshvideo.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Administrator on 16-9-26.
 */
public class Fragment4 extends Fragment {


    RecyclerView recyclerView;
    private View view;
    List<Like> datalist;
    Fragment4RecyclerAdapter adapter;


    String PATH_URL = "http://api.fresh.moliv.cn/Personalized.aspx";
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 5) {
                datalist = (List<Like>) msg.obj;
                adapter = new Fragment4RecyclerAdapter(getActivity(), datalist);
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

                adapter.setOnGaoleiClickListener(new Fragment4RecyclerAdapter.OnGaoleiClickListener() {
                    @Override
                    public void OnGaoleiClick(RecyclerView recyclerView, View view, int position) {
                        Toast.makeText(getActivity(), "" + String.format(Locale.CHINA, "这是第%02d条数据%s", position, position % 2 == 0 ? "ggggg" : "====="), Toast.LENGTH_SHORT).show();

                    }
                });

            }

        }
    };


    public Fragment4 getInstance() {
        Fragment4 fragment1 = new Fragment4();
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
        view = inflater.inflate(R.layout.fragment4, container, false);

        initView();
        initData();

        return view;
    }

    private void initData() {
        HandlerUtilsLike likeString = new HandlerUtilsLike(handler);
        likeString.loadJstring(PATH_URL);

    }

    private void initView() {
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_fragment4Id);
        datalist = new ArrayList<>();
        recyclerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
    }
}
