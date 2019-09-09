package com.example.miholamundop77a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter
        extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String[] _dataSet;
    Context _ctx;

    public MyAdapter(String[] dataSet){
        _dataSet =dataSet;
    }

    public MyAdapter(String[] dataSet, Context ctx){
        _dataSet =dataSet;
        _ctx=ctx;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v =
                LayoutInflater.from(parent.getContext()).inflate
                (R.layout.layout_item, parent,false);

        MyViewHolder h = new MyViewHolder(v);

        return h;
    }

    @Override
    public void onBindViewHolder
            (@NonNull MyViewHolder holder, int position) {

        holder.textView.setText(_dataSet[position]);

    }

    @Override
    public int getItemCount() {
        return _dataSet.length
                ;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView textView;
        public MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.txtItem);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                     Toast.makeText(view.getContext(),""+
                             ((TextView)view).getText(),
                             Toast.LENGTH_LONG).show();
                }
            });

        }
    }


}
