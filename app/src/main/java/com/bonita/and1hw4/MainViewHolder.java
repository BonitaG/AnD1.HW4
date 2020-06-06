package com.bonita.and1hw4;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.Objects;

public class MainViewHolder extends Recyclerview.ViewHolder {
    TextView textView;


    public MainViewHolder(@NonNull View itemView) {

            textView = itemView.findViewById(R.id.text_view);
        }


    }

