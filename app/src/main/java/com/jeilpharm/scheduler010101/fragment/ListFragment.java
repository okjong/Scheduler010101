package com.jeilpharm.scheduler010101.fragment;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.jeilpharm.scheduler010101.R;
import com.jeilpharm.scheduler010101.adapter.List_adapter;
import com.jeilpharm.scheduler010101.item.List_item;
import com.jeilpharm.scheduler010101.sqlite.DBhelper;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<List_item> list_items= new ArrayList<>();
    List_adapter list_adapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_list,container,false);

        recyclerView=view.findViewById(R.id.recycler_view_list);
        list_adapter= new List_adapter(getActivity(),list_items);
        recyclerView.setAdapter(list_adapter);

        return view;
    }
}
