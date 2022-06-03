package com.example.contrle_continu2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity_ajouter extends AppCompatActivity {
    EditText nom_s,secteur,nb;
    Button btn_eng,btn_anuler;
    MyDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ajouter);
        nom_s=findViewById(R.id.txt_nom);
        secteur=findViewById(R.id.txt_secteur);
        nb=findViewById(R.id.txt_nbEmploye);


    }

    public void anuller(View view) {
        finish();
    }

    public void enregistre(View view) {

        Societe s = new Societe();

        s.setNom(nom_s.getText().toString());
        s.setSec_Activité(secteur.getText().toString());
        s.setNb_emp(Integer.valueOf(nb.getText().toString()));


        if(MyDatabase.insert_Societe(db.getWritableDatabase(),s)==-1)
            Toast.makeText(this, "Cannot add to database", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Added successfuly", Toast.LENGTH_SHORT).show();

    }
}