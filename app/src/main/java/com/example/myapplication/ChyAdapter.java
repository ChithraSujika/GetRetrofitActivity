package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChyAdapter extends RecyclerView.Adapter<ChyAdapter.ViewHolder> {
    List<ModelList> list;
    Context context;

    public ChyAdapter(List<ModelList> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ChyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ChyAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChyAdapter.ViewHolder holder, int position) {
        ModelList list1 = list.get(position);
        holder.txt1.setText(list1.getUserId());
        holder.txt2.setText(list1.getId());
        holder.txt3.setText(list1.getBody());
        holder.txt4.setText(list1.getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt1,txt2,txt3,txt4;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.textView);
            txt2=itemView.findViewById(R.id.textView2);
            txt3=itemView.findViewById(R.id.textView3);
            txt4=itemView.findViewById(R.id.textView4);

        }
    }
}
