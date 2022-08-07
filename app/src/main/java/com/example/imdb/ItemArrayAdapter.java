package com.example.imdb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;
import java.util.Vector;

public class ItemArrayAdapter extends ArrayAdapter {
    private Vector<MyItem>myItems;
    private Context mycontext;
    public ItemArrayAdapter(Context context, int resource, int textViewResourceId, @NonNull List items) {
        super(context, resource, textViewResourceId, items);
     myItems= (Vector<MyItem>) items;
     mycontext=context;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup listView) {// creat the data structure make a list//nums of run it =num of rows //creat rows

        View row =convertView;
        ViewHolder viewHolder;
        if(row ==null)           ///to check if there is data or no to sve memory
        {
            // create row only when have a data when scrolling
            LayoutInflater inflater = (LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);/// convert xml to java obj "my row "
            row = inflater.inflate(R.layout.complex_row, listView, false);///convert layout to java obj
            viewHolder=new ViewHolder(row);
            row.setTag(viewHolder);
        }
        else
        {
            viewHolder= (ViewHolder) row.getTag();
        }
        viewHolder.getItemImg().setImageResource(myItems.get(position).getIcon());
        viewHolder.getTxtName().setText(myItems.get(position).getName());
        viewHolder.getTxtDesc().setText(myItems.get(position).getDesc());
/////set view

        return row;
    }
}
