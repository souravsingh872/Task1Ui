package com.example.task1ui;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SecondAdapter  extends RecyclerView.Adapter<SecondAdapter.SecondClass> {
    Context context;
    int [] roboImages;

    public SecondAdapter(Context context, int[] roboImages) {
        this.context = context;
        this.roboImages = roboImages;
    }

    @NonNull
    @Override
    public SecondClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.secondrecyclerdesign,parent,false );
        return new SecondClass ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull SecondClass holder, int position) {
         holder.secimage.setImageResource ( roboImages[position] );
    }

    @Override
    public int getItemCount() {
        return roboImages.length;
    }

    public class SecondClass extends RecyclerView.ViewHolder {
        TextView seclinertext;
        ImageView secimage;
        public SecondClass(@NonNull View itemView) {
            super ( itemView );
            seclinertext=itemView.findViewById ( R.id.seclinertext );
            secimage=itemView.findViewById ( R.id.roboimage );
        }
    }
}
