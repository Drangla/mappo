package com.fhtechnikum.mappo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView dashboardRecyclerView;
    private RecyclerView.Adapter dashboardRecyclerAdapter;
    private RecyclerView.LayoutManager dashboardLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CardViewItem> cardViewList = new ArrayList<>();
        //Text durch String Ressourcen oder Variablen ersetzen!!
        cardViewList.add(new CardViewItem(R.drawable.ic_android_black_24dp, "Text1", "Text2"));
        cardViewList.add(new CardViewItem(R.drawable.ic_android_black_24dp,"Text2","Text3" ));
        cardViewList.add(new CardViewItem(R.drawable.ic_android_black_24dp,"Text4","Text5" ));
        cardViewList.add(new CardViewItem(R.drawable.ic_android_black_24dp,"Text6","Text7" ));
        cardViewList.add(new CardViewItem(R.drawable.ic_android_black_24dp,"Text8","Text9" ));


        dashboardRecyclerView = findViewById(R.id.dashboard);
        //dashboardRecyclerView.setHasFixedSize(true); // when Recyclerview wont change in size, no matter how many items
        dashboardLayoutManager = new LinearLayoutManager(this);
        dashboardRecyclerAdapter = new DashboardAdapter(cardViewList);

        dashboardRecyclerView.setLayoutManager(dashboardLayoutManager);
        dashboardRecyclerView.setAdapter(dashboardRecyclerAdapter);
    }
}