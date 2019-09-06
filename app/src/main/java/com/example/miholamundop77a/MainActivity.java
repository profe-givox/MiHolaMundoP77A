package com.example.miholamundop77a;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import javax.microedition.khronos.egl.EGLDisplay;

public class MainActivity extends AppCompatActivity {
    TextView milbl;
    Button btn;
    Spinner spnE;
    String[] edos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnE = findViewById(R.id.spnEdos);

        edos = getResources().getStringArray(
                R.array.estados);

        ArrayAdapter<String> adp =
                new ArrayAdapter<String>
                        (this,
                                R.layout.layout_item,
                                R.id.txtItem,
                                edos
                                );

        spnE.setAdapter(adp);

        spnE.setOnItemSelectedListener(new
                                               AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this,
                        ((TextView)view.findViewById(R.id.txtItem)).getText() ,
                        Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Log.i("BOTACORA", "Pasando por el onCREATE");

        milbl = findViewById(R.id.lbl);

        milbl.setText(R.string.app_name);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Prsionando!",
                        Toast.LENGTH_LONG).show();

                Intent i = new
                        Intent(MainActivity.this,
                        MySecondActivity.class);


                i.putExtra("tel", "4451234567");
                i.putExtra("asunto", "Mensaje Urgente");
                i.putExtra("mensaje", "Reportate de inmediato");

                //startActivity(i);
                startActivityForResult(i, 1000);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if( requestCode == 1000){
            if (resultCode==RESULT_OK){
                Toast.makeText(this,
                        "SE ENVIO DEL MENSAJE correctsmente" +
                                data.getStringExtra("saludo")
                    ,
                        Toast.LENGTH_LONG).show();

                milbl.setText(data.getStringExtra("saludo"));
            }else {
                Toast.makeText(this,
                        "SE CANCEL EL ENVIO DEL MENSAJE",
                        Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("BOTACORA", "Pasando por el onSTART");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("BOTACORA", "Pasando por el onPAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("BOTACORA", "Pasando por el onSTOP");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("BOTACORA", "Pasando por el onrESTAR");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("BOTACORA", "Pasando por el onrESUME");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("BOTACORA", "Pasando por el ondestroty");
    }
}
