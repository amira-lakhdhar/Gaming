package com.example.localstorage.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.localstorage.DAO.UserDAO;
import com.example.localstorage.entities.User;

@Database(entities ={User.class} ,version =1 ,exportSchema = false)
public abstract class Appdatabase extends RoomDatabase {

    private static Appdatabase instance ;
    // a tt les DAO's
    public abstract UserDAO userDAO();

    public static Appdatabase getInstance(Context context){
        if (instance==null){
            instance = Room.databaseBuilder(context.getApplicationContext(), Appdatabase.class, "Test5SAE8")
                    .allowMainThreadQueries()
                    .build();

        }

        return instance;
    }
}
