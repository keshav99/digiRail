package com.digitalindia.digirail.DataUtils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.digitalindia.digirail.R;

import java.util.List;



public class EarningAdapterMonthlyChart extends RecyclerView.Adapter<EarningAdapterMonthlyChart.CustomViewHolder>{

    int[] amount = new int[]{10000,12356,95623,15864,53685,96357,26543,69851,756238,6523,56985};
    String[] months = new String[]{"Nov","Oct","Sep","Aug","Jul","Jun","May","Apr","Mar","Feb","Jan"};

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layout_id = R.layout.monthly_earning_list_item;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(layout_id,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position, List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.bind(months[position],amount[position]);
        if(position==0)
            holder.changeBg();
    }

    public int totalEarning(){
        int total=0;
        for(int i:amount){
            total += i*5/100;
        }
        return total;
    }

    @Override
    public int getItemCount() {
        return amount.length;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{

        public TextView mMonth;
        public TextView mAmount;
        public TextView mEarn;
        public ImageView mRupee;

        public CustomViewHolder(View itemView) {
            super(itemView);
            mMonth = (TextView)itemView.findViewById(R.id.earning_month_edit);
            mAmount = (TextView)itemView.findViewById(R.id.earning_amount_edit);
            mEarn = (TextView)itemView.findViewById(R.id.earning_earn_edit);
            mRupee = (ImageView)itemView.findViewById(R.id.earning_rupee);
        }

        public void bind(String month,int amount){
            mMonth.setText(month);
            int earn = amount*5/100;
            mAmount.setText(""+amount);
            mEarn.setText(""+earn);
        }

        public void changeBg(){
            mEarn.setBackgroundResource(R.drawable.current_month_border);
            mRupee.setImageResource(R.drawable.earning_money);
        }

    }

}
