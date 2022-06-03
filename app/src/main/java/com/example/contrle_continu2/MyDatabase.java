package com.example.contrle_continu2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyDatabase extends SQLiteOpenHelper {

    public static String DB_NAME="DBSociete.db";
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
        String sql = "create table " + TABLE_NAME + "("+COL1+" integer primary key autoincrement,"+COL2+" TEXT,"+COL3+" TEXT,"+COL4+" integer)";
        sqLiteDatabase.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql= "DROP TABLE " + TABLE_NAME;
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }

    public static long insert_Societe(SQLiteDatabase sqLiteDatabase, Societe s){
        ContentValues c = new ContentValues();
        c.put(COL1,s.getId());
        c.put(COL2,s.getNom());

        c.put(COL3,s.getSec_Activité());
        c.put(COL4,s.getNb_emp());

        return sqLiteDatabase.insert(TABLE_NAME,null,c);
    }

    public static long update_Societe(SQLiteDatabase sqLiteDatabase, Societe s){
        ContentValues c = new ContentValues();
        c.put(COL1,s.getId());
        c.put(COL2,s.getNom());
        c.put(COL3,s.getNom());
        c.put(COL4,s.getSec_Activité());
        return sqLiteDatabase.update(TABLE_NAME,c,"id="+s.getId(),null);
    }

    public static long delete_Societe(SQLiteDatabase sqLiteDatabase, int id){
        return sqLiteDatabase.delete(TABLE_NAME,"id="+id,null);
    }
    public static ArrayList<Societe> getAllSociete(SQLiteDatabase sqLiteDatabase){
        ArrayList<Societe> soc = new ArrayList<>();

        Cursor c = sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_NAME,null);

        while(c.moveToNext()){
            Societe p = new Societe();
            p.setId(c.getInt(0));
            p.setNom(c.getString(1));
            p.setSec_Activité(c.getString(2));
            p.setNb_emp(c.getInt(3));
            soc.add(p);
        }

        return soc;
    }
}
