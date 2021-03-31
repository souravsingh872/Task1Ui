package com.example.task1ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ForthAdapter extends RecyclerView.Adapter<ForthAdapter.ForthClass> {
    Context context;
    int [] imagesn;
    String[] textforth;

    public ForthAdapter(Context context, int[] imagesn, String[] textforth) {
        this.context = context;
        this.imagesn = imagesn;
        this.textforth = textforth;
    }

    @NonNull
    @Override
    public ForthClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.forthrecyclerdesign,parent,false );
        return new ForthClass ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ForthClass holder, int position) {
        holder.forthimage.setImageResource ( imagesn[position] );
       holder.forthtext.setText ( textforth[position] );
    }

    @Override
    public int getItemCount() {
        return imagesn.length;
    }

    public class ForthClass extends RecyclerView.ViewHolder {
        ImageView forthimage;
        TextView forthtext;
        public ForthClass(@NonNull View itemView) {
            super ( itemView );
            forthimage=itemView.findViewById ( R.id.forthimage );
            forthtext=itemView.findViewById ( R.id.forthtext );
        }
    }
}
