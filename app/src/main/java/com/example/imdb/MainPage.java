package com.example.imdb;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Vector;

public class MainPage extends AppCompatActivity {
    private Vector<MyItem> items;
    ListView listNums;
    String []numbers={"one","two","three","four","five","six"};
    ArrayAdapter arrayAdapter;
    private ItemArrayAdapter itemArrayAdapter;    //my adapter class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listNums=findViewById(R.id.listNums);
        /////////////////////////////////////////////////////// simple list
        /*
                                                                //android.R.layout.simple_list_item_1  layout show text in aline
                                                                // to make text and icon creat your own layout
        //arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,numbers);    //link adapter to array
        arrayAdapter=new ArrayAdapter(this,R.layout.icon_text_row,R.id.tRow,numbers);    //link adapter to array
        listNums.setAdapter(arrayAdapter);/// link  list toadaptert
        listNums.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listview, View row, int position, long id) {   ///  when click item
                Toast.makeText(MainActivity.this, (CharSequence) listview.getAdapter().getItem(position),Toast.LENGTH_SHORT).show();
            }
        });*/
        /////////////////////////
        items=new Vector<MyItem>();
        items.add(new MyItem("1","one",R.mipmap._1));
        items.add(new MyItem("2","two",R.mipmap._2));
        items.add(new MyItem("3","three",R.mipmap._3));
        items.add(new MyItem("4","four",R.mipmap._4));
        items.add(new MyItem("5","five",R.mipmap._5));
        items.add(new MyItem("6","one",R.mipmap._6));
        items.add(new MyItem("7","two",R.mipmap._7));
        items.add(new MyItem("8","three",R.mipmap._8));
        items.add(new MyItem("9","four",R.mipmap._9));
        items.add(new MyItem("In","linked in",R.mipmap.linkedin));
        itemArrayAdapter=new ItemArrayAdapter(this,R.layout.activity_main,R.id.tRowName, items);//connect adapter
        listNums.setAdapter(itemArrayAdapter);   //my adapter

        listNums.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainPage.this,  adapterView.getAdapter().getItem(i).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}