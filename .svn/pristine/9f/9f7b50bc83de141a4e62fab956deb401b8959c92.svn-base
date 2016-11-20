package com.com.gaolei.load;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.com.gaolei.bean.Selection4;
import com.com.gaolei.likebean.Like;
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
public class HandlerUtilsLike {

    Handler handler;
    Gson gson=new Gson();

    List<Like> likeList;
    Like like;


    public HandlerUtilsLike(Handler handler){
        this.handler=handler;
    }

    public static ExecutorService executor= Executors.newFixedThreadPool(20);

    public void  loadJstring(final String url){

        executor.execute(new Runnable() {
            @Override
            public void run() {
                String string1=DownLoadUtils.getJsonString(url);
                Log.d("gl","string1======"+string1);
                Log.d("gl","string1======"+string1.length());
                Type type1=new TypeToken<List<Like>>(){}.getType();
                likeList=gson.fromJson(string1,type1);
                Log.d("gl","likeList======"+likeList);
                Log.d("gl","likeList======"+likeList.size());
                Log.d("gl","likeList======"+likeList.get(0).getUi().getImage());

                Message message=Message.obtain();
                message.what=5;
                message.obj=likeList;
                handler.sendMessage(message);



            }
        });

    }

}
