package com.example.windows10timt.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttona;
    CheckBox checkBoxa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttona=findViewById(R.id.button1);
        checkBoxa=findViewById(R.id.cbkBox);


        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBoxa.isChecked()) {
                    Toast.makeText(MainActivity.this,"Chao mung ban da dang nhap he thong, Thong tin cua ban da duoc luu",
                            Toast.LENGTH_SHORT).show();
                }else {

                    Toast.makeText(MainActivity.this,"Chao mung ban da dang nhap he thong, Thong tin cua ban khong duoc luu",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
