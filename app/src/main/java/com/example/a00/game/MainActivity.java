package com.example.a00.game;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button inombre,iniciar,puntaje;
    private static final int ID=1;
    private static final int ID2=2;

    private String nick,pjugador;


    private ArrayList<String> selnom=new ArrayList<String>();
    private ArrayList<String> ganadorpuntaje=new ArrayList<String>();
    private ArrayList<String> jugadorpuntos=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inombre=findViewById(R.id.nuevo);
        iniciar=findViewById(R.id.partida);
        puntaje=findViewById(R.id.puntajes);

        inombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),pantallanuevojugador.class);
                startActivityForResult(i,ID);
            }
});

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),pantallajugar.class);
                i.putExtra("nombre",nick);
                startActivityForResult(i,ID2);
            }
        });

    }

    public void puntajes(View v){

        Intent i=new Intent(this,pantallapuntajes.class);
        i.putStringArrayListExtra("nombresjugador",selnom);
        i.putStringArrayListExtra("puntajesjugador",jugadorpuntos);
        startActivity(i);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode==RESULT_OK && requestCode==ID){
            nick = data.getStringExtra("nombre");

            selnom.add(nick);

            Toast.makeText(this, "nombre jugador : " + nick, Toast.LENGTH_LONG).show();

        }

        if(resultCode==RESULT_OK && requestCode==ID2){
            pjugador = data.getStringExtra("puntaje");

           /* int size=puntajes.size();
            for(int x=0;x<puntajes.size();x++) {
                String numeros=(puntajes.get(x));
                int numerosmayores= Integer.parseInt(numeros);

            }*/


            jugadorpuntos.add(pjugador);

            Toast.makeText(this, "puntaje de "+nick+" es : "+pjugador, Toast.LENGTH_LONG).show();

        }

    }

}
