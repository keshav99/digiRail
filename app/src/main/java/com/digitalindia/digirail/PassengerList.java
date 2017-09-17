package com.digitalindia.digirail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static com.digitalindia.digirail.ContractClasses.CoachContractClass.*;
import com.digitalindia.digirail.DataUtils.PassengerAdapter;

public class PassengerList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_list);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        View view = findViewById(R.id.coach);
        TextView textView = (TextView)view.findViewById(R.id.coach_name);
        textView.setText((String)bundle.get(coachIntent));
        int Coach = bundle.getInt(coachNumberIntent);
        PassengerAdapter passengerAdapter = new PassengerAdapter(Coach);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.passenger_info_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(passengerAdapter);
    }
}
