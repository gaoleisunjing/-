package com.gaolei.recycler_adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.com.gaolei.bean.Selection;
import com.com.gaolei.bean.Selection2;
import com.geolei.freshvideo.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 16-9-26.
 */
public class Fragment2RecycleAdapter extends RecyclerView.Adapter<Fragment2RecycleAdapter.MyViewHolder> {

    List<Selection.DataBean> dataBeen;
    List<Selection2.DataBean> dataBeen2;
    Context context;
    View view;
    RecyclerView recyclerView;


    public Fragment2RecycleAdapter(List<Selection2.DataBean> dataBeen2, Context context) {

        this.dataBeen2 = dataBeen2;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {


        return super.getItemViewType(position);

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fragment2_baseadapter, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        //MyViewHolder holder1=new MyViewHolder(view);
        String title = dataBeen2.get(position).getUi().getTitle();
        String desc = dataBeen2.get(position).getUi().getDesc();
      //  Log.d("gl", "onBindViewHolder" + dataBeen2.get(position).getUi().getTitle());
        holder.title.setText(title);
      //  Log.d("gl", "desc========" + desc);
        holder.desc.setText(desc);

        String Image_Path = dataBeen2.get(position).getUi().getImage();
        String Image_Path1=dataBeen2.get(position).getObj().getImage();
        if (TextUtils.isEmpty(Image_Path)) {
            //TextUtils.isEmpty(Image_Path)  注意了  这是一个重点
        //    Log.d("gl", "path=====Image_Path====空" + Image_Path);

            if(TextUtils.isEmpty(Image_Path1)){
            //    Log.d("gl", "path=====Image_Path1====空" + Image_Path);
                holder.imageView.setImageResource(R.drawable.aaa);
            }else {
                Picasso.with(context).load(Image_Path).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(holder.imageView);
            }
        } else {
          //  Log.d("gl", "path=====" + Image_Path);
            Picasso.with(context).load(Image_Path).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(holder.imageView);

        }

        //holder.itemView.setTag(holder);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(recyclerView,view,position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataBeen2.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title, desc;

        public MyViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.image_fragment2_baseadapterId);
            title = (TextView) itemView.findViewById(R.id.textView_fragment2_baseadapter1Id);
            desc = (TextView) itemView.findViewById(R.id.textView_fragment2_baseadapter2Id);

        }

    }

    OnFragment2ClickListener listener;

    public void setOnFragment2ClickListener(OnFragment2ClickListener listener){
        this.listener=listener;
    }
    public interface OnFragment2ClickListener{

       void onClick(RecyclerView recyclerView,View view,int posititon);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView=recyclerView;
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerView=null;
    }
}
