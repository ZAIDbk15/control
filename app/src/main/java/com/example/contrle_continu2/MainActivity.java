package com.example.contrle_continu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ajouters(View view) {

        Intent i=new Intent(MainActivity.this,MainActivity_ajouter.class);;
        startActivity(i);
    }

    public void editer(View view) {
        Intent i=new Intent(MainActivity.this,MainActivity_edite.class);;
        startActivity(i);
    }

    public void lister(View view) {
        Intent i=new Intent(MainActivity.this,MainActivity_lister.class);;
        startActivity(i);
    }
}