package com.com.gaolei.fragment;

import android.graphics.Bitmap;
import android.media.DrmInitData;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.com.gaolei.bean.Selection;
import com.com.gaolei.load.HandlerUtilsHot;
import com.geolei.freshvideo.R;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Locale;

/**
 * Created by Administrator on 16-9-26.
 */
public class Fragment1 extends Fragment implements View.OnClickListener {

    View view;

    String PATH_URL = "http://api.fresh.moliv.cn/home.aspx?fv=&v=26&u=4e386bfc-cf76-44ad-9f76-de06b7743905&app=mf&os=5.1&c=android&bt=1&vn=1.1.26&did=mac683e345131e2&uid=mac683e345131e2&vb=1.1.26(Official)&md=m2+note&mc=Market_MP&bd=m2note&tv=0&bus=&vs=1&service=0&atd=1&appseid=92962d6e-e7a9-4bbe-87e1-bf01336da8f0&lr=self";
    private AbsoluteLayout layout;

    List<Selection.RecommendBean> datalist;

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 10) {
                datalist = (List<Selection.RecommendBean>) msg.obj;
                setDataToUi();
            }

        }
    };


    public Fragment1 getInstance() {
        Fragment1 fragment1 = new Fragment1();
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
        view = inflater.inflate(R.layout.fragment1, container, false);
        layout = (AbsoluteLayout) view.findViewById(R.id.absoluteLayoutId);
        //layout.addView();
        initData();

        return view;
    }

    private void initData() {

        HandlerUtilsHot jsonString = new HandlerUtilsHot(handler);
        jsonString.loadJstring(PATH_URL);

    }

    public AbsoluteLayout.LayoutParams getParmas(String str) {
        String[] strs = str.split(",");
        int width = Integer.parseInt(strs[0]);
        int height = Integer.parseInt(strs[1]);
        int x = Integer.parseInt(strs[2]);
        int y = Integer.parseInt(strs[3]);
        AbsoluteLayout.LayoutParams params = new AbsoluteLayout.LayoutParams(width, height, x, y);
        return params;
    }

    public void setDataToUi() {


        int len = datalist.size();
        for (int i = 0; i < len; i++) {
            String str = datalist.get(i).getUi().getLayout();
            String title = datalist.get(i).getUi().getTitle() + "";
            String IMAGE_PATH = datalist.get(i).getUi().getImage();
            CardView cardView = new CardView(getActivity());
            ImageView image = new ImageView(getActivity());
            if (TextUtils.isEmpty(IMAGE_PATH)) {
                image.setImageResource(R.drawable.girl);
            } else {
                Picasso.with(getActivity()).load(IMAGE_PATH).error(R.drawable.girl).into(image);
                cardView.addView(image, getParmas(str));
            }
            TextView textview = new TextView(getContext());
            textview.setText(title);
            cardView.addView(textview);
            cardView.setTag(i);
            layout.addView(cardView, getParmas(str));
            cardView.setOnClickListener(this);
        }
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
       int postition= (int) view.getTag();
        Log.d("gl","position========"+postition);
        //Toast.makeText(getActivity(),String.format(Locale.CHINA,"第%02d个数据%s",postition,postition%2==0?"oooo":"xxxx"),Toast.LENGTH_SHORT).show();

        WebView webView= (WebView) LayoutInflater.from(getActivity()).inflate(R.layout.item_html_webview,null);
       String string=datalist.get(postition).getObj().getFirstvideo().getPageUrl();
        webView.loadUrl(string);
       //给webView设置了一个控制器
//        webView.setWebViewClient(new WebViewClient(){
//            @Override
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                super.onPageStarted(view, url, favicon);
//
//
//            }
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                super.onPageFinished(view, url);
//            }
//        });
//        webView.setWebChromeClient(new WebChromeClient(){
//
//            @Override
//            public void onProgressChanged(WebView view, int newProgress) {
//                super.onProgressChanged(view, newProgress);
//            }
//
//            @Override
//            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
//
////                new AlertDialog.Builder(H5Activity.this).setTitle("提示")
////                        .setCancelable(false).setMessage("无法获取用户信息").create();
////                result.confirm();//确认结果
//
//                return super.onJsAlert(view, url, message, result);
//            }
//        });



        WebSettings settings=webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(true);
        settings.supportMultipleWindows();
    }
    //onKeyDown
}
