package com.digitalindia.digirail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import static com.digitalindia.digirail.ContractClasses.CoachContractClass.*;
import com.digitalindia.digirail.DataUtils.CoachAdapter;
import com.digitalindia.digirail.DataUtils.EarningAdapterMonthlyChart;

public class CoachList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach_list);
        RecyclerView ac_coach_list = (RecyclerView)findViewById(R.id.ac_coach_list_view);
        RecyclerView sleeper_coach_list = (RecyclerView) findViewById(R.id.sleeper_coach_list_view);
        LinearLayoutManager linearLayoutManager_1 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager linearLayoutManager_2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        ac_coach_list.setLayoutManager(linearLayoutManager_1);
        sleeper_coach_list.setLayoutManager(linearLayoutManager_2);
        CoachAdapter coachAdapter_1 = new CoachAdapter("AC",4);
        CoachAdapter coachAdapter_2 = new CoachAdapter("S",9);
        ac_coach_list.setAdapter(coachAdapter_1);
        sleeper_coach_list.setAdapter(coachAdapter_2);
    }
}
