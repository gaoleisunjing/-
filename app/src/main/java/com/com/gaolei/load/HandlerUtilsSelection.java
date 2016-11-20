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
public class HandlerUtilsSelection {

    Handler handler;
    Gson gson=new Gson();

    List<Selection4>  data4;
    Selection4 selection4;

    public HandlerUtilsSelection(Handler handler){
        this.handler=handler;
    }

    public static ExecutorService executor= Executors.newFixedThreadPool(20);

    public void  loadJstring(final String url){

        executor.execute(new Runnable() {
            @Override
            public void run() {
                String string=DownLoadUtils.getJsonString(url);

                try {
                    JSONObject object=new JSONObject(string);
                    String s=object.getJSONArray("tabs").get(1).toString();
                    JSONObject object1=new JSONObject(s);
                    String s1 =object1.getJSONArray("data").toString();
                    Type type=new TypeToken<List<Selection4>>(){}.getType();
                     data4  = gson.fromJson(s1, type);



                    Log.d("gl","data4====="+data4.size());
                    Log.d("gl","data4====title"+data4.get(1).getUi().getImage());
                    Log.d("gl","data4====title"+data4.get(1).getUi().getTitle());
                    Log.d("gl","data4====title"+data4.get(0).getUi().getImage());
                    Log.d("gl","data4====title"+data4.get(0).getUi().getTitle());
                    Log.d("gl","data4====title"+data4.get(4).getUi().getTitle());

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Message message=Message.obtain();
                message.what=4;
                message.obj=data4;
                handler.sendMessage(message);



            }
        });

    }

}
