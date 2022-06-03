package com.example.contrle_continu2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity_edite extends AppCompatActivity {
    EditText nom_s,secteur,nb;
    Button btn_eng,btn_anuler;
    MyDatabase db;
    Spinner sp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_edite);
        nom_s=findViewById(R.id.txt_nom);
        secteur=findViewById(R.id.txt_secteur);
        nb=findViewById(R.id.txt_nbEmploye);
        btn_eng=findViewById(R.id.btn_mod);
        btn_anuler=findViewById(R.id.btn_supp);
        sp1=findViewById(R.id.sp1);
        db=new MyDatabase(this);

       ArrayList<Societe> ss=MyDatabase.getAllSociete(db.getReadableDatabase());
        ArrayList<String> lst=new ArrayList<>();
        for (Societe s:ss){
            lst.add(String.valueOf(s.getId()));
        }
     ArrayAdapter<String> ad=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,lst);
        sp1.setAdapter(ad);
        return sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Societe s = ss.get(i);
                nom_s.setText(s.getNom());
                secteur.setText(s.getSec_Activité());
                nb.setText(s.getNb_emp());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        };
    }

    public void modifier(View view) {


    }

    public void sup(View view) {
    }
}