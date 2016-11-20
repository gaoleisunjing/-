package com.com.gaolei.load;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.com.gaolei.bean.Selection;
import com.com.gaolei.bean.Selection2;
import com.com.gaolei.bean.Selection4;
import com.com.gaolei.bean.Slection3;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 16-9-26.
 */
public class HandlerUtilsHot {

    Handler handler;
    Gson gson=new Gson();
    List<Selection.RecommendBean> recommendBeanList;
    Selection selection;




    public HandlerUtilsHot(Handler handler){
        this.handler=handler;
    }

    public static ExecutorService executor= Executors.newFixedThreadPool(20);

    public void  loadJstring(final String url){

        executor.execute(new Runnable() {
            @Override
            public void run() {
                String string=DownLoadUtils.getJsonString(url);

                selection=gson.fromJson(string,Selection.class);
                recommendBeanList=selection.getRecommend();

                Log.d("gl","recommendBeanList=====size"+recommendBeanList.size());
                Log.d("gl","recommendBeanList=====getLayout"+recommendBeanList.get(0).getUi().getLayout());
                Log.d("gl","recommendBeanList=====getTitle"+recommendBeanList.get(0).getUi().getTitle());
                Log.d("gl","recommendBeanList=====getImage"+recommendBeanList.get(0).getUi().getImage());
                Log.d("gl","recommendBeanList=====getPageUrl"+recommendBeanList.get(0).getObj().getFirstvideo().getPageUrl());

                Message message=Message.obtain();
                message.what=10;
                message.obj=recommendBeanList;
                handler.sendMessage(message);
            }
        });

    }

}
