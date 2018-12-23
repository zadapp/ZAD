package com.example.dell.zad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        ImageButton ivCustomer = findViewById(R.id.iv_customer);
        ImageButton ivEmployee =findViewById(R.id.iv_employee);

        ivCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Select.this,Login.class);
                startActivity(intent);

            }
        });
        ivEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Select.this,Login.class);
                startActivity(intent);
            }
        });

    }
}
