package com.example.dell.zad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //create referance for widgit
        EditText userEmail =findViewById(R.id.et_email);
        EditText password = findViewById(R.id.et_password);
        Button bLogin = findViewById(R.id.btn_login);
        Button bSignUp = findViewById(R.id.btn_signUp);

        //this listener to add code whin the user click into the button
//        bLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // we are saying to the button transfare from this activity to home activity
//                Intent intent=new Intent(Login.this,Home.class);
//                startActivity(intent); // this code to start doing the transfaring from this activity to other one
//            }
//        });
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Home.class);
                startActivity(intent);
            }
        });
        bSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Registration.class);
                startActivity(intent);

            }
        });

    }
}
