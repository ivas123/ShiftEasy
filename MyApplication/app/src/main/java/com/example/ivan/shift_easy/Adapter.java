package com.example.ivan.shift_easy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ivan.shift_easy.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by Ivan on 2015-06-27.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private LayoutInflater inflater;
    List<Information> data = Collections.emptyList();
    private Context context;
    public Adapter(Context context, List<Information> data){
        inflater=LayoutInflater.from(context);
        this.data=data;
    }
//    public void delete(int position)
//    {
//        data.remove(position);
//        notifyItemRemoved(position);
//    }
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int i) {
       View view = inflater.inflate(R.layout.custom_row, parent, false);
        Log.d("Adapter","onCreatorHolder called");
       MyViewHolder holder= new MyViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
        Information current = data.get(i);
        Log.d("Adapter", "onBindViewHolder called" + i);
        viewHolder.title.setText(current.title);
        viewHolder.icon.setImageResource(current.iconId);


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title;
        ImageView icon;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.listText);
            icon = (ImageView) itemView.findViewById(R.id.listIcon);
            icon.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
//            delete(getLayoutPosition());
        }
    }

}
