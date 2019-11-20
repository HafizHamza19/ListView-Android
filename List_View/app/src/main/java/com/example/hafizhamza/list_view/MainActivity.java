package com.example.hafizhamza.list_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.MylistView);
        final ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Karachi");
        arrayList.add("Lahore");
        arrayList.add("Islamabad");
        arrayList.add("Quetta");
        arrayList.add("Peshawar");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast toast=Toast.makeText(getApplicationContext(),arrayList.get(i),Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
