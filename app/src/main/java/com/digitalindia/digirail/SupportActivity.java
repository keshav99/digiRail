package com.digitalindia.digirail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
        View[] array = new View[]{findViewById(R.id.tech_no),findViewById(R.id.tran_no),
            findViewById(R.id.tech_id),findViewById(R.id.tran_id)};
        String[] keys = new String[]{"Technical :","Railway :"};
        String[] vals = new String[]{"+919423867235","+919075094956","yashtodkar2@gmail.com","jacktodkar@railways.in"};
        int i;
        TextView key;
        TextView val;
        for(i=0;i<array.length;i++){
            key = (TextView)array[i].findViewById(R.id.key);
            val = (TextView)array[i].findViewById(R.id.value);
            key.setText(keys[i%2]);
            val.setText(vals[i]);
        }
    }
}
