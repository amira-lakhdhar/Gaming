package com.example.localstorage.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.localstorage.entities.User;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface UserDAO {

    @Insert
    public void addUser (User u );
    @Query("Select * from User")
    public List<User> getAll();

}
