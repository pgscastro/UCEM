package com.example.ucem.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ucem.R;

public class MenuPrincipal extends AppCompatActivity {
    private Button buttonCapitulos;
    private Button buttonExercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        buttonCapitulos = findViewById(R.id.buttonCapitulos);
        buttonExercicios = findViewById(R.id.buttonExercicios);

        buttonCapitulos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MenuCapitulos.class);
                startActivity(intent);


            }
        });

    }
}


