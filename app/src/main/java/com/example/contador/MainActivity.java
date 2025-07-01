package com.example.contador;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity { //siempre extiende esto porque une el xml con esta class

    private EditText editTextNumber;

    private EditText editTextValor;

    private Button btnIncrementar, btnDecrementar;

    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Obtengo lo que tengo
        setContentView(R.layout.activity_main);


        editTextValor = findViewById(R.id.editTextValor);
        editTextNumber = findViewById(R.id.editTextNumber);
        btnIncrementar = findViewById(R.id.btnIncrementar);
        btnDecrementar = findViewById(R.id.btnDecrementar);

        btnIncrementar.setOnClickListener(v -> {
            contador = contador + Integer.parseInt(editTextValor.getText().toString());
            editTextNumber.setText(String.valueOf(contador));
        });

        btnDecrementar.setOnClickListener(v -> {
            contador = contador - Integer.parseInt(editTextValor.getText().toString());
            editTextNumber.setText(String.valueOf(contador));
        });

//        EdgeToEdge.enable(this);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//
//        });
    }
}