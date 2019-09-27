package com.example.recyclerviewactivity1;

import android.os.Bundle;

import com.example.recyclerviewactivity1.Model.Mahasiswa;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;

public class RecylcerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecViewAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recylcer);
        addData();
        recyclerView = findViewById(R.id.rvMahasiswa);
        mahasiswaAdapter = new RecViewAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(RecylcerActivity.this) ;
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }




            private void addData() {
                ArrayList<Object> mahasiswaArrayList = new ArrayList<>();
                mahasiswaArrayList.add(new Mahasiswa("Scorpio Milo",
                        "1414370309", "123456789"));
                mahasiswaArrayList.add(new Mahasiswa("Sagitarius Aiolos",
                        "1214234560", "987654321"));
                mahasiswaArrayList.add(new Mahasiswa("Libra Dohko",
                        "1214230345", "987648765"));
                mahasiswaArrayList.add(new Mahasiswa("Aries Mu", "1214378098",
                        "098758124"));
                mahasiswaArrayList.add(new Mahasiswa("Gemini Saga",
                        "1414370309", "123456789"));
                mahasiswaArrayList.add(new Mahasiswa("Aquarius Camus",
                        "1214234560", "987654321"));
                mahasiswaArrayList.add(new Mahasiswa("Cancer Deathmask",
                        "1214230345", "987648765"));
                mahasiswaArrayList.add(new Mahasiswa("Leo Aiolia",
                        "1214378098", "098758124"));
                mahasiswaArrayList.add(new Mahasiswa("Virgo Shaka",
                        "1414370309", "123456789"));
                mahasiswaArrayList.add(new Mahasiswa("Taurus Aldebaran",
                        "1214234560", "987654321"));
                mahasiswaArrayList.add(new Mahasiswa("Pisces Aphrodite",
                        "1214230345", "987648765"));
                mahasiswaArrayList.add(new Mahasiswa("Capricorn Shura",
                        "1214378098", "098758124"));





}
        }


