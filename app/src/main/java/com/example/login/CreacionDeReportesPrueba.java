package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class CreacionDeReportesPrueba extends AppCompatActivity {

    Spinner animal,raza,color;
    EditText txtNombre,txtTamaño,txtCalle,txtColonia,txtCodigoPostal,txtDescripcion;
    Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacion_de_reportes_prueba);

        txtNombre = (EditText) findViewById(R.id.txtNombree);
        txtTamaño = (EditText) findViewById(R.id.txtTamañe);
        txtCalle = (EditText) findViewById(R.id.txtCallee);
        txtColonia = (EditText) findViewById(R.id.txtColonie);
        txtCodigoPostal = (EditText) findViewById(R.id.txtCP);
        txtDescripcion = (EditText) findViewById(R.id.txtDescripcion);
        btnCrear = (Button) findViewById(R.id.savebtn);

        findViewById(R.id.atrase).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FeedScreenV3.class);
                startActivity(intent);
                finish();
            }
        });//Creamos objeto de la imagen del boton lateral junto con su evento onClick el cual nos servira para desplegar el menu

        animal = (Spinner)(findViewById(R.id.spAnimal));

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Animales, android.R.layout.simple_spinner_item);
        animal.setAdapter(adapter);

        raza = (Spinner) (findViewById(R.id.spRaza));
        ArrayAdapter<CharSequence> adapterR = ArrayAdapter.createFromResource(this,R.array.Raza, android.R.layout.simple_spinner_item);
        raza.setAdapter(adapterR);

        color = (Spinner) (findViewById(R.id.spColor));
        ArrayAdapter<CharSequence> adapterC = ArrayAdapter.createFromResource(this,R.array.Color, android.R.layout.simple_spinner_item);
        color.setAdapter(adapterC);
    }
}