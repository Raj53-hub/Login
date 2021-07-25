package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void func1(View view) {
        EditText t1 = findViewById(R.id.edtFname);
        EditText t2 = findViewById(R.id.edtLname);
        EditText t3 = findViewById(R.id.edtEmail);
        EditText t4 = findViewById(R.id.edtPassword);

        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();
        String s3 = t3.getText().toString();
        String s4 = t4.getText().toString();

        if(!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty() && !s4.isEmpty()) {
            if (s3.equals("admin@gmail.com") && s4.equals("admin")) {
                Intent a1 = new Intent(this, DataStored.class);
                a1.putExtra("Fname", s1);
                a1.putExtra("Lname", s2);
                a1.putExtra("Email", s3);
                startActivity(a1);

            } else {
                Toast.makeText(this, "Wrong Credential", Toast.LENGTH_SHORT).show();
            }

        }
    }
}