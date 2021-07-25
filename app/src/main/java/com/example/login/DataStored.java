package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataStored extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_stored);

        String s1 = getIntent().getStringExtra("Fname");
        String s2 = getIntent().getStringExtra("Lname");
        String s3 = getIntent().getStringExtra("Email");

        TextView t1 = (TextView)findViewById(R.id.txtFname);
        TextView t2 = (TextView)findViewById(R.id.txtLname);
        TextView t3 = (TextView)findViewById(R.id.txtUsername);

        t1.setText(s1);
        t2.setText(s2);
        t3.setText(s3);
    }
}