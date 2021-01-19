package com.example.mycontacts;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity

public class Numbers {


    @PrimaryKey
    public int contact_number;
    @ColumnInfo(name = "Contact_name")
    public String name;

    public Numbers(int contact_number, String name) {
        this.contact_number = contact_number;
        this.name = name;


    }


}
