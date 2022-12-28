package com.jeilpharm.scheduler010101.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jeilpharm.scheduler010101.R;
import com.jeilpharm.scheduler010101.item.List_item;

import java.util.ArrayList;

public class List_adapter extends RecyclerView.Adapter<List_adapter.VH> {

    Context context;
    ArrayList<List_item> list_items;

    public List_adapter(Context context, ArrayList<List_item> list_items) {
        this.context = context;
        this.list_items = list_items;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
        return new VH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        List_item item= list_items.get(position);
        holder.tvListsigun.setText(item.tvItemSigun);
        holder.tvListhopital.setText(item.tvItemHospital);

    }

    @Override
    public int getItemCount() {
        return list_items.size();
    }

    class VH extends RecyclerView.ViewHolder{

        TextView tvListhopital;
        TextView tvListsigun;

        public VH(@NonNull View itemView) {
            super(itemView);

            tvListhopital=itemView.findViewById(R.id.tv_item_list_hospital);
            tvListsigun=itemView.findViewById(R.id.tv_item_list_sigun);

        }
    }
}
