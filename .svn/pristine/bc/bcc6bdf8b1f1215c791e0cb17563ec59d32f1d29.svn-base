package com.com.gaolei.load;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.com.gaolei.bean.Selection;
import com.com.gaolei.bean.Selection2;
import com.com.gaolei.bean.Selection4;
import com.com.gaolei.bean.Slection3;
import com.com.gaolei.likebean.Like;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 16-9-26.
 */
public class HandlerUtils {

    Handler handler;
    Gson gson=new Gson();
    List<Selection.TabsBean> tabsBeanList;
    Selection selection;

    List<Selection.DataBean> data;

    List<Selection2.DataBean> data2;
    Selection2 selection2;


    List<Slection3.TabsBean> data3;
    Slection3 slection3;

    List<Selection4>  data4;
    Selection4 selection4;



    public HandlerUtils(Handler handler){
        this.handler=handler;
    }

    public static ExecutorService executor= Executors.newFixedThreadPool(20);

    public void  loadJstring(final String url){

        executor.execute(new Runnable() {
            @Override
            public void run() {
                String string=DownLoadUtils.getJsonString(url);
                selection = gson.fromJson(string,Selection.class);
                try {
                    JSONObject object=new JSONObject(string);
                    String s=object.getJSONArray("tabs").get(1).toString();
                    JSONObject object1=new JSONObject(s);
                    String s1 =object1.getJSONArray("data").toString();
                    Type type=new TypeToken<List<Selection4>>(){}.getType();
                     data4  = gson.fromJson(s1, type);

//                    Log.d("gl","data4====="+data4.size());
//                    Log.d("gl","data4====title"+data4.get(1).getUi().getImage());
//                    Log.d("gl","data4====title"+data4.get(1).getUi().getTitle());
//                    Log.d("gl","data4====title"+data4.get(0).getUi().getImage());
//                    Log.d("gl","data4====title"+data4.get(0).getUi().getTitle());
//                    Log.d("gl","data4====title"+data4.get(4).getUi().getTitle());

                } catch (JSONException e) {
                    e.printStackTrace();
                }


//                Log.d("gl","selection========"+selection);
//                tabsBeanList=selection.getTabs();
//                Log.d("gl","tabBeanList");





//                 data = selection.getData();
//                Log.d("gl","selection===title==="+selection.getData().get(1).getUi().getTitle());
//                Log.d("gl","selection===title2==="+selection.getData().get(1).getUi().getDesc());
//                Log.d("gl","selection===image===="+selection.getData().get(1).getUi().getImage());


                selection2=gson.fromJson(string,Selection2.class);
                data2=selection2.getData();

//                Log.d("gl","data2====title1"+data2.get(1).getUi().getTitle());
//                Log.d("gl","data2====title2"+data2.get(1).getUi().getDesc());
//                Log.d("gl","data2====image"+data2.get(1).getUi().getImage());
//                Log.d("gl","data2==="+data2.get(1).getUi());


//                slection3 =gson.fromJson(string,Slection3.class);
//                data3=slection3.getTabs();
//                Log.d("gl","data3====image"+data3.get(1).getData().get(1).toString());




                Message message=Message.obtain();
//                message.what=1;
//                message.obj=data;
//                message.what=2;
//                message.obj=tabsBeanList;

                if(data2!=null){
                    message.what=3;
                    message.obj=data2;
                    handler.sendMessage(message);
                }

            }
        });

    }

}
