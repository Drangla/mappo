package com.fhtechnikum.mappo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONArray;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView dashboardRecyclerView;
    private RecyclerView.Adapter dashboardRecyclerAdapter;
    private RecyclerView.LayoutManager dashboardLayoutManager;
    ArrayList<CardViewItem> cardViewList;

    private Button buttonRemove;
    private Button buttonInsert;
    private EditText edRemove;
    private EditText edInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createCardViewList();
        createRecyclerview();

        buttonInsert = findViewById(R.id.button_insert);
        buttonRemove = findViewById(R.id.button_remove);
        edInsert = findViewById(R.id.edittext_insert);
        edRemove = findViewById(R.id.edittext_remove);

        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int insertPosition = Integer.parseInt(edInsert.getText().toString());
                insertDashboardItem(insertPosition);
                dashboardRecyclerAdapter.notifyItemInserted(insertPosition);
            }
        });

        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int removePosition = Integer.parseInt(edRemove.getText().toString());
                removeDashboardItem(removePosition);
                dashboardRecyclerAdapter.notifyItemRemoved(removePosition);
            }
        });
    }

    public void insertDashboardItem(int position) {
        //GET Aufruf für neue Daten
        cardViewList.add(position, new CardViewItem(R.drawable.ic_android_black_24dp, "added1", "added2"));

    }

    public void removeDashboardItem(int position) {
        cardViewList.remove(position);
    }

    public void createCardViewList() {
        cardViewList = new ArrayList<>();
        //Text durch String Ressourcen oder Variablen ersetzen!!
        cardViewList.add(new CardViewItem(R.drawable.ic_android_black_24dp, "Text1", "Text2"));
        cardViewList.add(new CardViewItem(R.drawable.ic_android_black_24dp,"Text2","Text3" ));
        cardViewList.add(new CardViewItem(R.drawable.ic_android_black_24dp,"Text4","Text5" ));
    }

    public void createRecyclerview() {
        dashboardRecyclerView = findViewById(R.id.dashboard);
        //dashboardRecyclerView.setHasFixedSize(true); // when Recyclerview wont change in size, no matter how many items
        dashboardLayoutManager = new LinearLayoutManager(this);
        dashboardRecyclerAdapter = new DashboardAdapter(cardViewList, MainActivity.this);  //pass the context too for Intent
        dashboardRecyclerView.setLayoutManager(dashboardLayoutManager);
        dashboardRecyclerView.setAdapter(dashboardRecyclerAdapter);
    }
}
