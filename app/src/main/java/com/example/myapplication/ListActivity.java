package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    GridView appleGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        appleGrid=findViewById(R.id.apple);
        appleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedItem=(String)appleGrid.getItemAtPosition(position);
                Toast.makeText(ListActivity.this,clickedItem,Toast.LENGTH_LONG).show();
                Intent i=new Intent(ListActivity.this,DeviceDetail.class);
                startActivity(i);
            }
        });
    }
}
