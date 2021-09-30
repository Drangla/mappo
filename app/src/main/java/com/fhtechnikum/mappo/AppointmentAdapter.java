package com.fhtechnikum.mappo;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AppointmentAdapter extends RecyclerView.Adapter<AppointmentAdapter.ViewHolder> {
    private ArrayList<AppointmentItem> items;
    Context context;

    public AppointmentAdapter(ArrayList<AppointmentItem> items, Context context) {
        this.items = items;
        this.context = context;

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public ImageView appointmentImageView;
        public TextView appointmentTitle;
        public TextView appointmentText1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            appointmentImageView = itemView.findViewById(R.id.appointment_image);
            appointmentTitle = itemView.findViewById(R.id.appointment_text1);
            appointmentText1 = itemView.findViewById(R.id.appointment_text2);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.appointmentview_item, parent, false);
        return new ViewHolder(view); //Context -> Dashboardadapter
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AppointmentItem currentItem = items.get(position);
        holder.appointmentImageView.setImageResource(currentItem.getImgCategory());
        holder.appointmentTitle.setText(currentItem.getAppointment_title());
        holder.appointmentText1.setText(currentItem.getAppointment_text());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
