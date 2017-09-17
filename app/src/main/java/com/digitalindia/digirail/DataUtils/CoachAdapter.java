package com.digitalindia.digirail.DataUtils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.digitalindia.digirail.PassengerList;
import com.digitalindia.digirail.R;
import static com.digitalindia.digirail.ContractClasses.CoachContractClass.*;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by root on 1/7/17.
 */

public class CoachAdapter extends RecyclerView.Adapter<CoachAdapter.CustomView>{

    public String mType;
    public int mNumber;

    public CoachAdapter(String cT,int nOC){
        mType = cT;
        mNumber = nOC;
    }

    @Override
    public CustomView onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layout_id = R.layout.coach_name_item;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(layout_id,parent,false);
        return new CustomView(view);
    }

    @Override
    public int getItemCount() {
        return mNumber;
    }

    @Override
    public void onBindViewHolder(CustomView holder, int position, List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public void onBindViewHolder(CustomView holder, int position) {
        holder.bind(position);
    }

    public class CustomView extends RecyclerView.ViewHolder{

        TextView textView;

        public CustomView(View itemView){
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.coach_name);
            final int number = mNumber;
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context,PassengerList.class);
                    Bundle bundle = new Bundle();
                    TextView textView = (TextView)view;
                    bundle.putString(coachIntent,textView.getText().toString());
                    bundle.putInt(coachNumberIntent,getAdapterPosition());
                    Log.d("CoachAdapter", "onClick: "+getAdapterPosition());
                    intent.putExtras(bundle);
                    context.startActivity(intent);
                }
            });
        }

        public void bind(int number){
            String data = mType+"-"+(number+1);
            textView.setText(data);
        }
    }

}
