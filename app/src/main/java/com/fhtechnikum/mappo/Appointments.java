package com.fhtechnikum.mappo;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Appointments extends AppCompatActivity {
    public static final String INTENT_KEY = "appointments_key";
    private RecyclerView appointmentRecyclerView;
    private RecyclerView.Adapter appointmentRecyclerAdapter;
    private RecyclerView.LayoutManager appointmentRecyclerManager;
    ArrayList<AppointmentItem> appointmentItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointments);

        createAppointmentList();
        createRecyclerview();

    }

    public void createAppointmentList() {
        appointmentItems = new ArrayList<>();
        appointmentItems.add(new AppointmentItem(R.drawable.ic_android_black_24dp, getString(R.string.appointment_wildcard) , getString(R.string.appointment_wildcard)));

    }

    public void createRecyclerview() {
        appointmentRecyclerView = findViewById(R.id.appointment_recyclerview);
        //dashboardRecyclerView.setHasFixedSize(true); // when Recyclerview wont change in size, no matter how many items
        appointmentRecyclerManager = new LinearLayoutManager(this);
        appointmentRecyclerAdapter = new AppointmentAdapter(appointmentItems, Appointments.this);  //pass the context too for Intent
        appointmentRecyclerView.setLayoutManager(appointmentRecyclerManager);
        appointmentRecyclerView.setAdapter(appointmentRecyclerAdapter);
    }
}