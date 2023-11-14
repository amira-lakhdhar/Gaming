package com.example.localstorage.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public  int id ;
    @ColumnInfo
    public  String login ;
    @ColumnInfo
    public String pwd;

    public User() {
    }


}
