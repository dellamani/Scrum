package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import java.util.ArrayList;

public class TodoFragment extends Fragment {
    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView lvItems;
    private Button btn;
    private EditText etNewItem;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view=inflater.inflate(R.layout.fragment_todo, container, false);
        btn=(Button) view.findViewById(R.id.btnAddItem);
        lvItems = (ListView) view.findViewById(R.id.lvItems);
        items = new ArrayList<String>();
        itemsAdapter = new ArrayAdapter<String>(view.getContext(),android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(itemsAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etNewItem = (EditText) view.findViewById(R.id.etNewItem);
                String itemText = etNewItem.getText().toString();
                itemsAdapter.add(itemText);
                etNewItem.setText("");
            }
        });
        return view;
    }

    }







