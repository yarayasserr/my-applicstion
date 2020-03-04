package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listactivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listactivity1);
        final ListView list=findViewById(R.id.listt);
        ArrayList<String> ARRAY=new ArrayList<>();
        ARRAY.add("Apple");
        ARRAY.add("Android");
        ARRAY.add("Windows");
        ARRAY.add("Linux");
        ARRAY.add("BlackBerry");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ARRAY);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clicked=(String)list.getItemAtPosition(position);
                Toast.makeText(listactivity1.this,clicked,Toast.LENGTH_LONG).show();
                Intent intent_1=new Intent(listactivity1.this,DeviceDetail.class);
                startActivity(intent_1);
            }
        });


    }
}
