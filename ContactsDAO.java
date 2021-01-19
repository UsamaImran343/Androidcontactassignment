package com.example.mycontacts;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface ContactsDAO {

    @Insert
    Long add(Numbers numbers);

    @Update
    void update(Numbers numbers);

    @Delete
    void delete(Numbers numbers);



}
