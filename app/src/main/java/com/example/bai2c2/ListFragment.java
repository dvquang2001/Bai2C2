package com.example.bai2c2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.adapter.ContactAdapter;
import com.example.model.Contact;

import java.util.ArrayList;


public class ListFragment extends Fragment {
    private ArrayList<Contact> contacts;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listfragment,null);
        ListView lvContacts = view.findViewById(R.id.lvContacts);
        contacts = new ArrayList<>();
       String []dsTen = getResources().getStringArray(R.array.arrContacts);
        for(int i=0;i<dsTen.length;i++)
        {
            contacts.add(new Contact(R.drawable.avatar,dsTen[i],R.drawable.th));
        }
        ContactAdapter adapter = new ContactAdapter(getActivity(),contacts);
        lvContacts.setAdapter(adapter);
        return view;
    }
    

}
