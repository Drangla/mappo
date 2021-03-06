package com.fhtechnikum.mappo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.CardViewHolder> {
    private ArrayList<CardViewItem> cardViewItems;
    Context context;

    //Constructor outer class
    public DashboardAdapter(ArrayList<CardViewItem> cardViewItems, Context mainActivityContext) {
        this.cardViewItems = cardViewItems;
        this.context = mainActivityContext;
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {
        public ImageView dashboardImageView;
        public TextView dashboardTextViewTitle;
        public TextView dashboardTextView1;
        public View view;

        //Constructor Innerclass
        public CardViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            view = itemView; // Warum hier extra?
            dashboardImageView = itemView.findViewById(R.id.cardview_image);
            dashboardTextViewTitle = itemView.findViewById(R.id.cardview_title);
            dashboardTextView1 = itemView.findViewById(R.id.cardview_text1);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(context, Appointments.class);
                    i.putExtra(Appointments.INTENT_KEY, "TEST");
                    context.startActivity(i);
                }
            });

        }
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item, parent, false);
        CardViewHolder cvh = new CardViewHolder(v, this.context);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        CardViewItem currentItem = cardViewItems.get(position);
        holder.dashboardImageView.setImageResource(currentItem.getImageResource());
        holder.dashboardTextViewTitle.setText(currentItem.getCardTextTitle());
        holder.dashboardTextView1.setText(currentItem.getCardText1());
    }

    @Override
    public int getItemCount() {
        return cardViewItems.size();
    }
}
