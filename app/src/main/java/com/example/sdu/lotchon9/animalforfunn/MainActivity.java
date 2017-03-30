package com.example.sdu.lotchon9.animalforfunn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Explicit ประการตัวแปร
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.btnStart);
        final EditText editText = (EditText) findViewById(R.id.txtName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.length() == 0) { // ถ้า edit ว่าง คือ ไม่ใส่ชื่อ
                    Toast.makeText(getApplicationContext(), "Please Enter your name!!", Toast.LENGTH_LONG).show();

                } else {
                    nameString = editText.getText().toString().trim();
                    Toast.makeText(getApplicationContext(), "Hi!!  " + nameString, Toast.LENGTH_LONG).show();
                    //Toast.makeText(getApplicationContext(), "LET'S GO IT DOWN !!", Toast.LENGTH_LONG).show();

                    Intent startIntent = new Intent(MainActivity.this, Gamee.class);
                    startActivity(startIntent);
                }
            }
        });
    }
}
