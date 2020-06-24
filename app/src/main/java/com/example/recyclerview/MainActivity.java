package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        final List<RecyclerModel> recyclerModelList = new ArrayList<>();
        recyclerModelList.add(new RecyclerModel("Tanvir Anwar Rafi", "Software Engineer", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Rafi Haydar", "Graphics Designer", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Shangita Das", "Web Developer", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Jyoti Ray Sarkar", "Angular Expart", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Tanvir Anwar Rafi", "Software Engineer", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Rafi Haydar", "Graphics Designer", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Shangita Das", "Web Developer", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Jyoti Ray Sarkar", "Angular Expart", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Tanvir Anwar Rafi", "Software Engineer", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Rafi Haydar", "Graphics Designer", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Shangita Das", "Web Developer", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Jyoti Ray Sarkar", "Angular Expart", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Tanvir Anwar Rafi", "Software Engineer", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Rafi Haydar", "Graphics Designer", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Shangita Das", "Web Developer", R.drawable.user));
        recyclerModelList.add(new RecyclerModel("Jyoti Ray Sarkar", "Angular Expart", R.drawable.user));

        final RecyclerAdapter recyclerAdapter = new RecyclerAdapter(recyclerModelList, true);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerAdapter.notifyDataSetChanged();
    }
}
