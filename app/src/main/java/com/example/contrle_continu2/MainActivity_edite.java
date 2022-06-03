package com.example.contrle_continu2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_edite extends AppCompatActivity {
    EditText nom_s,secteur,nb;
    Button btn_eng,btn_anuler;
    MyDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_edite);
        nom_s=findViewById(R.id.txt_nom);
        secteur=findViewById(R.id.txt_secteur);
        nb=findViewById(R.id.txt_nbEmploye);
        btn_eng=findViewById(R.id.btn_mod);
        btn_anuler=findViewById(R.id.btn_supp);
    }

    public void modifier(View view) {


    }

    public void sup(View view) {
    }
}