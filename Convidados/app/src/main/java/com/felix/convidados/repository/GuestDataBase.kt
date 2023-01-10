package com.felix.convidados.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {


    companion object {
        private const val NAME: String = "guestdb"
        private const val VERSION: Int = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Criacao do banco
        db.execSQL(
            "CREATE TABLE GUEST(" +
                    "id integer PRIMARY KEY AUTOINCREMENT, " +
                    "name text, " +
                    "presence integer);"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    }
}