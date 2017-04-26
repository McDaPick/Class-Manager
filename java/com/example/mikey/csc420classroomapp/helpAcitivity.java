package com.example.mikey.csc420classroomapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class helpAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_acitivity);
        Button more = (Button) findViewById(R.id.button);
        final EditText message = (EditText) findViewById(R.id.editText2);
        more.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(helpAcitivity.this).create(); //Read Update
                //alertDialog.setTitle("hi");
                alertDialog.setMessage("Your message has been sent!");
                alertDialog.show();
                message.setText("");
            }

        });

    }

}
