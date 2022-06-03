package com.example.contrle_continu2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_ajouter extends AppCompatActivity {
    EditText nom_s,secteur,nb;
    Button btn_eng,btn_anuler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ajouter);
    }

    public void anuller(View view) {
        finish();
    }
}