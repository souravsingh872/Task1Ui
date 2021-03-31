package com.example.task1ui;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FirstAdapter  extends RecyclerView.Adapter<FirstAdapter.FirstClass> {
    Context context;
    String[] courses;

    public FirstAdapter(Context context, String[] courses) {
        this.context = context;
        this.courses = courses;
    }

    @NonNull
    @Override
    public FirstClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.firstrecycler,parent,false );
        return new FirstClass ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull FirstClass holder, int position) {
  holder.firsttext.setText ( courses[position] );
  if(position==0){
      holder.relativefirst.setBackgroundResource ( R.drawable.firstdesign2);

  }
    }

    @Override
    public int getItemCount() {
        return courses.length;
    }

    public class FirstClass extends RecyclerView.ViewHolder {
        TextView firsttext;
        RelativeLayout relativefirst;
        public FirstClass(@NonNull View itemView) {
            super ( itemView );
            firsttext=itemView.findViewById ( R.id.textRec );
            relativefirst=itemView.findViewById ( R.id.relativefirst );
        }
    }
}
