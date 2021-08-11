package com.example.stuent_details_recycler_2;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements clickListener {
    private ArrayList<Model> dataList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        buildData();
        setAdapter();
    }

    private void setAdapter() {
        Adapter adapter = new Adapter(dataList, this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void buildData() {

        for (int i = 1; i <= 100; i++) {
            Model nrupul = new Model("Nrupul", "R" + i, "Banglore", "11/01/1999");
            dataList.add(nrupul);
        }
    }

    @Override
    public void onItemClick(Model model,int position) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Details : ")
                .setMessage("Name: "+model.getName()+"\n"+"ID: "+model.getId()+"\n"+"DOB: "+model.getDob()+"\n"+"Address: "+model.getAddress())
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).show();
    }
}