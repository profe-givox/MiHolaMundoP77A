package com.example.miholamundop77a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView milbl;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
            }
        });

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
