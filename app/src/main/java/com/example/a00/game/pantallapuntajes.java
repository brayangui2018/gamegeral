package com.example.a00.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class pantallapuntajes extends AppCompatActivity implements Serializable {

    private ListView jugadores;
    private ListView puntajeFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallapuntajes);
        jugadores=findViewById(R.id.idlistapuntajes);
        puntajeFinal=findViewById(R.id.idpuntajelista);

        ArrayList<String> listanombres = (ArrayList<String>) getIntent().getStringArrayListExtra("nombresjugador");
        ArrayList<String> listapuntajes = (ArrayList<String>) getIntent().getStringArrayListExtra("puntajesjugador");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,listanombres);
        jugadores.setAdapter(adapter);

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,listapuntajes);
        puntajeFinal.setAdapter(adapter1);
}
}
