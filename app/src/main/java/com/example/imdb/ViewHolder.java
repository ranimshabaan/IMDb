package com.example.imdb;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/////this class to enhance memory management // create row only when have a data when scrolling
public class ViewHolder {
    View convertView;
    TextView txtName;
    TextView txtDesc;
    ImageView itemImg;
    public ViewHolder(View v)
    {
        convertView=v;
    }
    public TextView getTxtName()
    {
        if(txtName==null)
        {
            txtName=convertView.findViewById(R.id.tRowName);
        }
        return txtName;
    }
    public TextView getTxtDesc()
    {
        if(txtDesc==null)
        {
            txtDesc=convertView.findViewById(R.id.tRow2Desc);
        }
        return txtDesc;
    }
    public ImageView getItemImg()
    {
        if(itemImg==null)
        {
            itemImg=convertView.findViewById(R.id.imgRcomplex);
        }
        return itemImg;
    }
}
