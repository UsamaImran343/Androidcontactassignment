package com.example.mycontacts;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Numbers.class}, version = 1,exportSchema = false)


public abstract class ContactsDB extends RoomDatabase {

    public  abstract  ContactsDAO contactsDAO();












}
