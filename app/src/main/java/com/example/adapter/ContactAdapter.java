package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bai2c2.R;
import com.example.model.Contact;

import java.util.ArrayList;

public class ContactAdapter extends BaseAdapter {
    Context context;
    ArrayList<Contact> contacts;
    LayoutInflater inflater;

    public ContactAdapter(Context context,ArrayList<Contact> contacts)
    {
        this.context = context;
        this.contacts = contacts;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null)
        {
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item,null);
            viewHolder.imgHinhDD = convertView.findViewById(R.id.imgHinhDD);
            viewHolder.txtTen = convertView.findViewById(R.id.txtTen);
            viewHolder.imgHinh = convertView.findViewById(R.id.imgHinh);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Contact contact = contacts.get(position);
        viewHolder.imgHinhDD.setImageResource(contact.getHinhdaidien());
        viewHolder.txtTen.setText(contact.getTen());
        viewHolder.imgHinh.setImageResource(contact.getHinh());
        return convertView;
    }
    private class ViewHolder
    {
        private ImageView imgHinhDD;
        private TextView txtTen;
        private ImageView imgHinh;
    }

}
