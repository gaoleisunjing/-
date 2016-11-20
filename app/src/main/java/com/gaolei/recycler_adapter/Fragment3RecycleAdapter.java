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
import com.com.gaolei.bean.Selection4;
import com.geolei.freshvideo.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 16-9-27.
 */
public class Fragment3RecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    int TYPE_1 = 0;
    int TYPE_2 = 1;
    int TYPE_3 = 2;
    int TYPE_4 = 3;


    Context context;
    List<Selection4>  list;
    RecyclerView recyclerView;


    public Fragment3RecycleAdapter(Context context, List<Selection4> list) {

        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==TYPE_1){
            CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.item1_fragment3_baseadapter, parent, false);
            return new MyViewHolder(cardView);
        }else if(viewType==TYPE_2){
            CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.item3_fragment3_baseadapter, parent, false);
            return new MyViewHolder2(cardView);
        }else if(viewType==TYPE_3){
            CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.item4_fragment3_baseadapter, parent, false);
            return new MyViewHolder3(cardView);
        }else {
            CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.item2_fragment3_baseadapter, parent, false);
            return new MyViewHolder4(cardView);
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        if(holder instanceof MyViewHolder){

            Log.d("gl","MyViewHolder1============"+list.get(position).getUi().getImage());
            Picasso.with(context).load(list.get(position).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder) holder).image11);
            Picasso.with(context).load(list.get(position+1).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder) holder).image12);
            Picasso.with(context).load(list.get(position+2).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder) holder).image13);

//            ((MyViewHolder) holder).image11.setImageResource(R.drawable.girl);
//            ((MyViewHolder) holder).image12.setImageResource(R.drawable.girl);
//            ((MyViewHolder) holder).image13.setImageResource(R.drawable.girl);


            ((MyViewHolder) holder).image11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+1);
                }
            });
            ((MyViewHolder) holder).image12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+2);
                }
            });((MyViewHolder) holder).image13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+3);
                }
            });

        }else if(holder instanceof MyViewHolder2){

            Log.d("gl","MyViewHolder2============"+list.get(position+2).getUi().getImage());

            Picasso.with(context).load(list.get(position+2).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder2) holder).image31);
            Picasso.with(context).load(list.get(position+3).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder2) holder).image32);
            Picasso.with(context).load(list.get(position+4).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder2) holder).image33);
            Picasso.with(context).load(list.get(position+5).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder2) holder).image34);
            Picasso.with(context).load(list.get(position+6).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder2) holder).image35);

            String title1=list.get(position+2).getUi().getTitle()+"";
            String dexe1=list.get(position+2).getUi().getDesc()+"";

            String title2=list.get(position+3).getUi().getTitle()+"";
            String dexe2=list.get(position+3).getUi().getDesc()+"";

            String title3=list.get(position+4).getUi().getTitle()+"";
            String dexe3=list.get(position+4).getUi().getDesc()+"";

            String title4=list.get(position+5).getUi().getTitle()+"";
            String dexe4=list.get(position+5).getUi().getDesc()+"";

            String title5=list.get(position+6).getUi().getTitle()+"";
            String dexe5=list.get(position+6).getUi().getDesc()+"";

            ((MyViewHolder2) holder).title21.setText(title1);
            ((MyViewHolder2) holder).decs21.setText(dexe1);

            ((MyViewHolder2) holder).title22.setText(title2);
            ((MyViewHolder2) holder).decs22.setText(dexe2);

            ((MyViewHolder2) holder).title23.setText(title3);
            ((MyViewHolder2) holder).decs23.setText(dexe3);

            ((MyViewHolder2) holder).title24.setText(title4);
            ((MyViewHolder2) holder).decs24.setText(dexe4);

            ((MyViewHolder2) holder).title25.setText(title5);
            ((MyViewHolder2) holder).decs25.setText(dexe5);


//            ((MyViewHolder2) holder).image31.setImageResource(R.drawable.girl);
//            ((MyViewHolder2) holder).image32.setImageResource(R.drawable.girl);
//            ((MyViewHolder2) holder).image33.setImageResource(R.drawable.girl);
//            ((MyViewHolder2) holder).image34.setImageResource(R.drawable.girl);
//            ((MyViewHolder2) holder).image35.setImageResource(R.drawable.girl);

            ((MyViewHolder2) holder).image31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+3);
                }
            });
            ((MyViewHolder2) holder).image32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+4);
                }
            });
            ((MyViewHolder2) holder).image33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+5);
                }
            });
            ((MyViewHolder2) holder).image34.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+6);
                }
            });
            ((MyViewHolder2) holder).image35.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+7);
                }
            });




        }else if(holder instanceof MyViewHolder3){


            Log.d("gl","MyViewHolder2============"+list.get(position+6).getUi().getImage());

            Picasso.with(context).load(list.get(position+6).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder3) holder).image41);
            Picasso.with(context).load(list.get(position+7).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder3) holder).image42);
            Picasso.with(context).load(list.get(position+8).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder3) holder).image43);
            Picasso.with(context).load(list.get(position+9).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder3) holder).image44);
            Picasso.with(context).load(list.get(position+10).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder3) holder).image45);


            String title1=list.get(position+6).getUi().getTitle()+"";
            String dexe1=list.get(position+6).getUi().getDesc()+"";

            String title2=list.get(position+7).getUi().getTitle()+"";
            String dexe2=list.get(position+7).getUi().getDesc()+"";

            String title3=list.get(position+8).getUi().getTitle()+"";
            String dexe3=list.get(position+8).getUi().getDesc()+"";

            String title4=list.get(position+9).getUi().getTitle()+"";
            String dexe4=list.get(position+9).getUi().getDesc()+"";

            String title5=list.get(position+10).getUi().getTitle()+"";
            String dexe5=list.get(position+10).getUi().getDesc()+"";

            ((MyViewHolder3) holder).title31.setText(title1);
            ((MyViewHolder3) holder).decs31.setText(dexe1);

            Log.d("gl","viewHolder3======"+title1+"====="+dexe1);
            ((MyViewHolder3) holder).title32.setText(title2);
            ((MyViewHolder3) holder).decs32.setText(dexe2);

            ((MyViewHolder3) holder).title33.setText(title3);
            ((MyViewHolder3) holder).decs33.setText(dexe3);

            ((MyViewHolder3) holder).title34.setText(title4);
            ((MyViewHolder3) holder).decs34.setText(dexe4);

            ((MyViewHolder3) holder).title35.setText(title5);
            ((MyViewHolder3) holder).decs35.setText(dexe5);


//           ((MyViewHolder3) holder).image41.setImageResource(R.drawable.girl);
//           ((MyViewHolder3) holder).image42.setImageResource(R.drawable.girl);
//           ((MyViewHolder3) holder).image43.setImageResource(R.drawable.girl);
//           ((MyViewHolder3) holder).image44.setImageResource(R.drawable.girl);
//           ((MyViewHolder3) holder).image45.setImageResource(R.drawable.girl);

            ((MyViewHolder3) holder).image41.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+7);
                }
            });
            ((MyViewHolder3) holder).image42.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+8);
                }
            });((MyViewHolder3) holder).image43.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+9);
                }
            });((MyViewHolder3) holder).image44.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+10);
                }
            });((MyViewHolder3) holder).image45.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+11);
                }
            });






        }else if (holder instanceof MyViewHolder4){


            Picasso.with(context).load(list.get(position+9).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder4) holder).image21);
            Picasso.with(context).load(list.get(position+10).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder4) holder).image22);
            Picasso.with(context).load(list.get(position+11).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder4) holder).image23);
            Picasso.with(context).load(list.get(position+12).getUi().getImage()).error(R.mipmap.ic_launcher).into(((MyViewHolder4) holder).image24);


            String title1=list.get(position+9).getUi().getTitle()+"";
            String dexe1=list.get(position+9).getUi().getDesc()+"";

            String title2=list.get(position+10).getUi().getTitle()+"";
            String dexe2=list.get(position+10).getUi().getDesc()+"";

            String title3=list.get(position+11).getUi().getTitle()+"";
            String dexe3=list.get(position+11).getUi().getDesc()+"";

            String title4=list.get(position+12).getUi().getTitle()+"";
            String dexe4=list.get(position+12).getUi().getDesc()+"";

            ((MyViewHolder4) holder).title11.setText(title1);
            ((MyViewHolder4) holder).decs11.setText(dexe1);

            ((MyViewHolder4) holder).title12.setText(title2);
            ((MyViewHolder4) holder).decs13.setText(dexe2);

            ((MyViewHolder4) holder).title13.setText(title3);
            ((MyViewHolder4) holder).decs13.setText(dexe3);

            ((MyViewHolder4) holder).title14.setText(title4);
            ((MyViewHolder4) holder).decs14.setText(dexe4);




//            ((MyViewHolder4) holder).image21.setImageResource(R.drawable.girl);
//            ((MyViewHolder4) holder).image22.setImageResource(R.drawable.girl);
//            ((MyViewHolder4) holder).image23.setImageResource(R.drawable.girl);
//            ((MyViewHolder4) holder).image24.setImageResource(R.drawable.girl);


            ((MyViewHolder4) holder).image21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+11);
                }
            });
            ((MyViewHolder4) holder).image22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+12);
                }
            });
            ((MyViewHolder4) holder).image23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+13);
                }
            });
            ((MyViewHolder4) holder).image24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(recyclerView,view,position+14);
                }
            });

        }else {
            Log.d("gl","=========全都不属于");
        }


    }

    @Override
    public int getItemViewType(int position) {

//        switch (position){
//            case 0:
//             return TYPE_1;
//            case 1:
//              return TYPE_2;
//            case 2:
//                return TYPE_3;
//            case 3:
//                return TYPE_4;
//        }

        return position % 4 == 3 ? TYPE_4 : position % 4 == 2 ? TYPE_3 : position % 4 == 1 ? TYPE_2 : position % 4 == 0 ? TYPE_1 : null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image11, image12, image13;

        public MyViewHolder(View itemView) {
            super(itemView);
            if (itemView instanceof CardView) {
                CardView cardView = (CardView) itemView;
                image11 = (ImageView) cardView.findViewById(R.id.image11_fragment3_baseadapterId);
                image12 = (ImageView) cardView.findViewById(R.id.image12_fragment3_baseadapterId);
                image13 = (ImageView) cardView.findViewById(R.id.image13_fragment3_baseadapterId);
            }
        }
    }


    class MyViewHolder2 extends RecyclerView.ViewHolder {

        ImageView image31, image32, image33, image34, image35;
        TextView title21, decs21, title22, decs22, title23, decs23, title24, decs24, title25, decs25;


        public MyViewHolder2(View itemView) {
            super(itemView);
            if (itemView instanceof CardView) {
                CardView cardView = (CardView) itemView;

                image31 = (ImageView) cardView.findViewById(R.id.image31_fragment3_baseadapter3Id);
                image32 = (ImageView) cardView.findViewById(R.id.image32_fragment3_baseadapter3Id);
                image33 = (ImageView) cardView.findViewById(R.id.image33_fragment3_baseadapter3Id);
                image34 = (ImageView) cardView.findViewById(R.id.image34_fragment3_baseadapter3Id);
                image35 = (ImageView) cardView.findViewById(R.id.image35_fragment3_baseadapter3Id);


                title21 = (TextView) cardView.findViewById(R.id.textView31_fragment3_baseadapterId);
                decs21 = (TextView) cardView.findViewById(R.id.textView32_fragment3_baseadapterId);
                title22 = (TextView) cardView.findViewById(R.id.textView33_fragment3_baseadapterId);
                decs22 = (TextView) cardView.findViewById(R.id.textView34_fragment3_baseadapterId);
                title23 = (TextView) cardView.findViewById(R.id.textView35_fragment3_baseadapterId);
                decs23 = (TextView) cardView.findViewById(R.id.textView36_fragment3_baseadapterId);
                title24 = (TextView) cardView.findViewById(R.id.textView37_fragment3_baseadapterId);
                decs24 = (TextView) cardView.findViewById(R.id.textView38_fragment3_baseadapterId);
                title25 = (TextView) cardView.findViewById(R.id.textView39_fragment3_baseadapterId);
                decs25 = (TextView) cardView.findViewById(R.id.textView310_fragment3_baseadapterId);

            }

        }
    }

    class MyViewHolder3 extends RecyclerView.ViewHolder {

        ImageView image41, image42, image43, image44, image45;

        TextView title31, decs31, title32, decs32, title33, decs33, title34, decs34, title35, decs35;

        public MyViewHolder3(View itemView) {
            super(itemView);
            if (itemView instanceof CardView) {
                CardView cardView = (CardView) itemView;

                image41 = (ImageView) cardView.findViewById(R.id.image41_fragment3_baseadapter3Id);
                image42 = (ImageView) cardView.findViewById(R.id.image42_fragment3_baseadapter3Id);
                image43 = (ImageView) cardView.findViewById(R.id.image43_fragment3_baseadapter3Id);
                image44 = (ImageView) cardView.findViewById(R.id.image44_fragment3_baseadapter3Id);
                image45 = (ImageView) cardView.findViewById(R.id.image45_fragment3_baseadapter3Id);


                title31 = (TextView) cardView.findViewById(R.id.textView41_fragment3_baseadapterId);
                decs31 = (TextView) cardView.findViewById(R.id.textView42_fragment3_baseadapterId);
                title32 = (TextView) cardView.findViewById(R.id.textView43_fragment3_baseadapterId);
                decs32 = (TextView) cardView.findViewById(R.id.textView44_fragment3_baseadapterId);
                title33 = (TextView) cardView.findViewById(R.id.textView45_fragment3_baseadapterId);
                decs33 = (TextView) cardView.findViewById(R.id.textView46_fragment3_baseadapterId);
                title34 = (TextView) cardView.findViewById(R.id.textView47_fragment3_baseadapterId);
                decs34 = (TextView) cardView.findViewById(R.id.textView48_fragment3_baseadapterId);
                title35 = (TextView) cardView.findViewById(R.id.textView49_fragment3_baseadapterId);
                decs35 = (TextView) cardView.findViewById(R.id.textView410_fragment3_baseadapterId);


            }
        }
    }

    class MyViewHolder4 extends RecyclerView.ViewHolder {

        ImageView image21, image22, image23, image24;
        TextView title11, decs11, title12, decs12, title13, decs13, title14, decs14;

        public MyViewHolder4(View itemView) {
            super(itemView);
            if (itemView instanceof CardView) {
                CardView cardView = (CardView) itemView;
                image21 = (ImageView) cardView.findViewById(R.id.image21_fragment3_baseadapter3Id);
                image22 = (ImageView) cardView.findViewById(R.id.image22_fragment3_baseadapter3Id);
                image23 = (ImageView) cardView.findViewById(R.id.image23_fragment3_baseadapter3Id);
                image24 = (ImageView) cardView.findViewById(R.id.image24_fragment3_baseadapter3Id);

                title11 = (TextView) cardView.findViewById(R.id.textView21_fragment3_baseadapterId);
                decs11 = (TextView) cardView.findViewById(R.id.textView22_fragment3_baseadapterId);
                title12 = (TextView) cardView.findViewById(R.id.textView23_fragment3_baseadapterId);
                decs12 = (TextView) cardView.findViewById(R.id.textView24_fragment3_baseadapterId);
                title13 = (TextView) cardView.findViewById(R.id.textView25_fragment3_baseadapterId);
                decs13 = (TextView) cardView.findViewById(R.id.textView26_fragment3_baseadapterId);
                title14 = (TextView) cardView.findViewById(R.id.textView27_fragment3_baseadapterId);
                decs14 = (TextView) cardView.findViewById(R.id.textView28_fragment3_baseadapterId);

            }

        }
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

    OnFragment3ClickListener listener;

    public void setOnFragemnt3ClickListener(OnFragment3ClickListener listener){
        this.listener=listener;
    }

    public interface OnFragment3ClickListener{
       void onClick(RecyclerView recyclerView,View view,int position);
    }
}
