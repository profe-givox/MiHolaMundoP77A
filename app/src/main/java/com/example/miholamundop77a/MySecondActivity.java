package com.example.miholamundop77a;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MySecondActivity extends AppCompatActivity {
    EditText txtTo, txtAsu, txtMsj;
    Button btn ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_second);

        Intent i = getIntent();



        i.getStringExtra("tel");

        txtTo = findViewById(R.id.txtPara);
        txtAsu = findViewById(R.id.txtAsunto);
        txtMsj=findViewById(R.id.txtMensaje);

        txtTo.setText(i.getStringExtra("tel"));
        txtAsu.setText(i.getStringExtra("asunto"));
        txtMsj.setText(i.getStringExtra("mensaje"));

    }
}
