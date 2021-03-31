package com.example.task1ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ThirdAdapter extends RecyclerView.Adapter<ThirdAdapter.ThirdClass> {
    Context context;
    String[] ages;

    public ThirdAdapter(Context context, String[] ages) {
        this.context = context;
        this.ages = ages;
    }

    @NonNull
    @Override
    public ThirdClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.thirdrecyclerdesign,parent,false );
        return new ThirdClass ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ThirdClass holder, int position) {
    holder.thirdtext.setText ( ages[position] );
        if(position==0){
            holder.relativethird.setBackgroundResource ( R.drawable.firstdesign2);

        }
    }

    @Override
    public int getItemCount() {
        return ages.length;
    }

    public class ThirdClass extends RecyclerView.ViewHolder {
        TextView thirdtext;
        RelativeLayout relativethird;
        public ThirdClass(@NonNull View itemView) {
            super ( itemView );
            thirdtext=itemView.findViewById ( R.id.textRec3 );
            relativethird=itemView.findViewById ( R.id.relative3rd );
        }
    }
}
