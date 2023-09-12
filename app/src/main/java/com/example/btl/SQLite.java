package com.example.btl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLite extends SQLiteOpenHelper {
    public SQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //truy van kh tra ket qua
    public void QueryData(String query){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(query);
    }

    //truy van co ket qua tra ve
    public Cursor GetData(String query){
        SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(query,null);
    }

    // tao bang Tinh
    public void createTinh(SQLiteDatabase db){
        //khoi tao cac bang
        db.execSQL("CREATE TABLE IF NOT EXISTS Tinh (\n" +
                "\tId INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "\tTenTinh NVARCHAR(50) NOT NULL\n" +
                ")");

        // tao index duy nhat
        db.execSQL("CREATE UNIQUE INDEX index_TenTinh ON Tinh(TenTinh)");
    }

    public void createDiaDiem (SQLiteDatabase db){
        db.execSQL("CREATE TABLE DiaDiem(\n" +
                "\tId INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT ,\n" +
                "\ttenDiaDiem NVARCHAR(50),\n" +
                "\tthongTin TEXT,\n" +
                "\ttenTinh NVARCHAR(50), \n" +
                "\tsoNguoiDen INTEGER,\n" +
                "\tdiaChi NVARCHAR(500),\n" +
                "\trate FLOAT,\n" +
                "\thinhAnh BLOG,  \n"+
                "\tFOREIGN KEY (tenTinh) REFERENCES Tinh(TenTinh)\n" +
                ")\n");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        createTinh(sqLiteDatabase);
        createDiaDiem(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
