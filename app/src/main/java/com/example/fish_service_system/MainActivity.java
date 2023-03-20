package com.example.fish_service_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signup = (TextView)findViewById(R.id.createaccount);
        TextView Username = (TextView) findViewById(R.id.username);
        TextView Password = (TextView) findViewById(R.id.password);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new  Intent(getBaseContext(), signup.class);
                startActivity(intent);
            }
        });

        MaterialButton loginbutn = (MaterialButton) findViewById(R.id.login);

        //admin and admin
        loginbutn.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             if (Username.getText().toString().equals("admin") && Password.getText().toString().equals("Deepan")){
                                                 Intent intent = new Intent(MainActivity.this,Home_page.class);
                                                 startActivity(intent);
                                             }
                                             else {
                                                 Toast.makeText(MainActivity.this, "Login Failed...", Toast.LENGTH_SHORT).show();
                                             }
                                         }
                                     }
        );
    }
}