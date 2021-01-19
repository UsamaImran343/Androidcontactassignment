package com.example.mycontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
EditText edt_contactnumber,edt_email,edt_name;
Button btn_save;
String scontactnumber,semail,sname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        getSupportActionBar().setTitle("Add Info");

        edt_contactnumber = (EditText)findViewById(R.id.number);
        edt_email = (EditText)findViewById(R.id.email);
        edt_name = (EditText)findViewById(R.id.name);
        btn_save = (Button)findViewById(R.id.savebtn);


        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt_contactnumber.getText().toString().isEmpty()||
                edt_email.getText().toString().isEmpty()||
                        edt_name.getText().toString().isEmpty()){

                    Toast.makeText(getApplicationContext(),"Enter Detail",Toast.LENGTH_LONG).show();
                }
                else{
                    scontactnumber = edt_contactnumber.getText().toString().trim();
                    sname = edt_email.getText().toString().trim();
                    semail = edt_email.getText().toString().trim();

                    ContactsRepo contactsRepo = new ContactsRepo(getApplicationContext());
                    Numbers numbers = new Numbers(Integer.parseInt(scontactnumber),sname);
                    contactsRepo.add(numbers);
                }
            }
        });





    }
}
