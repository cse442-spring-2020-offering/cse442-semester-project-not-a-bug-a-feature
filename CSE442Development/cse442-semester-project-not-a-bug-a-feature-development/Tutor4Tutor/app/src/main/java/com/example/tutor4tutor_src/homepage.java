package com.example.tutor4tutor_src;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class homepage extends AppCompatActivity {



    EditText textView5, text;
    Button button;
    Button server_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, login.class);
                startActivity(intent);

            }
        });

        server_btn = (Button)findViewById(R.id.serverlogin_btn);

        server_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, wenxuan_login.class);
                startActivity(intent);

            }
        });


    }
}






