package com.example.diahl.recyclerviews;

import android.app.ActionBar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView Title;
    TextView Des;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.imageView = itemView.findViewById(R.id.ImageView);
        this.Title = itemView.findViewById(R.id.title);
        this.Des = itemView.findViewById(R.id.description);
    }
}
