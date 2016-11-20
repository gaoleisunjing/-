package com.gaolei.recycler_adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.com.gaolei.likebean.Like;
import com.geolei.freshvideo.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 16-9-28.
 */
public class Fragment4RecyclerAdapter extends RecyclerView.Adapter<Fragment4RecyclerAdapter.MyViewHolderLike> {

    Context context;
    List<Like> datalist;
    private OnGaoleiClickListener listener;
    RecyclerView recyclerView;
    CardView cardView;


    public Fragment4RecyclerAdapter(Context context, List<Like> datalist) {
        this.context = context;
        this.datalist = datalist;
    }

    @Override
    public MyViewHolderLike onCreateViewHolder(ViewGroup parent, int viewType) {

         cardView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fragment4_baseadapter, parent, false);
         // cardView.setOnContextClickListener(this);

       // cardView.setOnClickListener(this);


        return new MyViewHolderLike(cardView);
    }


    @Override
    public void onBindViewHolder(MyViewHolderLike holder, final int position) {


        String imagePath_1 = datalist.get((position * 5)).getUi().getImage();
        Log.d("gl", "Fragment4======image1" + imagePath_1);
        String imagePath_2 = datalist.get(1 + (position * 5)).getUi().getImage();
        String imagePath_3 = datalist.get(2 + (position * 5)).getUi().getImage();
        String imagePath_4 = datalist.get(3 + (position * 5)).getUi().getImage();
        String imagePath_5 = datalist.get(4 + (position * 5)).getUi().getImage();

        Picasso.with(context).load(imagePath_1).error(R.drawable.girl).into(holder.image1);
        Picasso.with(context).load(imagePath_2).error(R.drawable.girl).into(holder.image2);
        Picasso.with(context).load(imagePath_3).error(R.drawable.girl).into(holder.image3);
        Picasso.with(context).load(imagePath_4).error(R.drawable.girl).into(holder.image4);
        Picasso.with(context).load(imagePath_5).error(R.drawable.girl).into(holder.image5);

        String title_1 = datalist.get(position + (position * 5)).getUi().getTitle() + "";
        Log.d("gl", "fragemnt4========title1" + title_1);
        String title_2 = datalist.get(1 + (position * 5)).getUi().getTitle() + "";
        String title_3 = datalist.get(2 + (position * 5)).getUi().getTitle() + "";
        String title_4 = datalist.get(3 + (position * 5)).getUi().getTitle() + "";
        String title_5 = datalist.get(4 + (position * 5)).getUi().getTitle() + "";

        holder.title2.setText(title_2);
        holder.title3.setText(title_3);
        holder.title4.setText(title_4);
        holder.title5.setText(title_5);


//        cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//              listener.OnGaoleiClick(recyclerView,view,position);
//            }
//        });


        holder.image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getId();
                listener.OnGaoleiClick(recyclerView,view,position*5+1);
            }
        });
        holder.image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getId();
                listener.OnGaoleiClick(recyclerView,view,5*position+2);
            }
        });
        holder.image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getId();
                listener.OnGaoleiClick(recyclerView,view,5*position+3);
            }
        });
        holder.image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getId();
                listener.OnGaoleiClick(recyclerView,view,5*position+4);
            }
        });
        holder.image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getId();
                listener.OnGaoleiClick(recyclerView,view,5*position+5);
            }
        });


    }


    @Override
    public int getItemCount() {
        return datalist.size() / 5;
    }

    //@Override
//    public void onClick(View view) {
//        int position=recyclerView.getChildAdapterPosition(view);
//        listener.OnGaoleiClick(recyclerView,view,position);
 //   }

//    @Override
//    public boolean onContextClick(View view) {
//        int position=recyclerView.getChildAdapterPosition(view);
//        listener.setOnGaoleiClickListener(recyclerView,view,position);
//        return false;
//    }

    class MyViewHolderLike extends RecyclerView.ViewHolder {

        ImageView image1, image2, image3, image4, image5;
        TextView title2, title3, title4, title5;


        public MyViewHolderLike(View itemView) {
            super(itemView);
            if (itemView instanceof CardView) {
                final CardView cardView = (CardView) itemView;

                image1 = (ImageView) cardView.findViewById(R.id.image1_fragment4_baseAdapterId);
                image2 = (ImageView) cardView.findViewById(R.id.image2_fragment4_baseAdapterId);
                image3 = (ImageView) cardView.findViewById(R.id.image3_fragment4_baseAdapterId);
                image4 = (ImageView) cardView.findViewById(R.id.image4_fragment4_baseAdapterId);
                image5 = (ImageView) cardView.findViewById(R.id.image5_fragment4_baseAdapterId);


                title2 = (TextView) cardView.findViewById(R.id.textView1_fragment4_baseadapterId);
                title3 = (TextView) cardView.findViewById(R.id.textView2_fragment4_baseadapterId);
                title4 = (TextView) cardView.findViewById(R.id.textView3_fragment4_baseadapterId);
                title5 = (TextView) cardView.findViewById(R.id.textView4_fragment4_baseadapterId);


            }
        }
    }

    public void setOnGaoleiClickListener(OnGaoleiClickListener listener) {
        this.listener=listener;
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

    public interface OnGaoleiClickListener {
        void OnGaoleiClick(RecyclerView recyclerView,View view,int position);
    }


}
