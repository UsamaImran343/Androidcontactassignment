package com.example.mycontacts;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import androidx.room.Room;

public class ContactsRepo {

    private String databasename = "contactsdb";
    private ContactsDB contactsDB;
    Context context;

    public ContactsRepo(Context context){
        this.context = context;
        contactsDB = Room.databaseBuilder(context,ContactsDB.class,databasename).build();

        Toast.makeText(context, "Database is Created Sucessfully.. ",Toast.LENGTH_LONG).show();
    }

    public  void add(final Numbers numbers)
    {

        new AsyncTask<Void,Void,Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                contactsDB.contactsDAO().add(numbers);
                return null;

        }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
            }
        }.execute();

    }




}
