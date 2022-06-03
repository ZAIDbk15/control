package com.example.contrle_continu2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabase extends SQLiteOpenHelper {

    public static String DB_NAME="DBProduit.db";
    public static String TABLE_NAME="Societe";
    public static String COL1="ID";
    public static String COL2="Raison_Sociale";
    public static String COL3="Secteur_activite";
    public static String COL4="nb_employe";



    public MyDatabase(@Nullable Context c) {
        super(c, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
