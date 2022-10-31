package com.if5a.utsdwi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private EditText etnamalengkap, etnomorpendaftaran;
    private Spinner spjalurpendaftaran;
    private Button btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("uts Dwi Apriyanti Sastika");

        btndaftar = findViewById(R.id.btn_daftar);
        etnamalengkap = findViewById((R.id.et_namalengkap));
        etnomorpendaftaran = findViewById(R.id.et_nomorpendaftaran);

    }
}