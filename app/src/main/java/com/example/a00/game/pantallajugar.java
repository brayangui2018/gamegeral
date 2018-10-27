package com.example.a00.game;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class pantallajugar extends AppCompatActivity {
    private TextView nombrenick;
    private TextView ganar, puntuacion,perder,empatar;
    private Button piedra,papel,tijera,fin,opc;
    private String puntos;
    private ArrayList<String> nombreseleccionado=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallajugar);
        nombrenick=findViewById(R.id.txtnombrejugador);
        puntuacion=findViewById(R.id.idpuntos);
        ganar=findViewById(R.id.idganados);
        perder=findViewById(R.id.idperdidos);
        empatar=findViewById(R.id.idempatados);
        fin=findViewById(R.id.idfinalizar);
        piedra=findViewById(R.id.btnpiedra);
        papel=findViewById(R.id.btnpapel);
        tijera=findViewById(R.id.btntijera);
        opc=findViewById(R.id.idopcionpc);

        Intent intent= getIntent();
        Bundle extras=intent.getExtras();

        if(extras!=null){
            String datonombre=extras.getString("nombre");
            nombrenick.setText(datonombre);
        }

        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                puntos=puntuacion.getText().toString();

                Intent i = new Intent();
                i.putExtra("puntaje",puntos);

                setResult(RESULT_OK,i);
                finish();

            }
        });


    }


    public void eventopiedra(View v){
       int numero = (int) (Math.random() * 3) + 1;
       String cadena = String.valueOf(numero);
       opc.setText(cadena);
        if (numero==1){
            Toast.makeText(this,"empate",Toast.LENGTH_SHORT).show();
            String empateactual=empatar.getText().toString();
            int cantidadactual= Integer.parseInt(empateactual);
            int totalempate=cantidadactual+1;
            String cadenatotal = String.valueOf(totalempate);
            empatar.setText(cadenatotal);

        }else if(numero==2){
            //ganados,perdidos,empatados
            Toast.makeText(this,"perdiste",Toast.LENGTH_SHORT).show();
            String perdidaactual=perder.getText().toString();
            int cantidadactual= Integer.parseInt(perdidaactual);
            int totalperdida=cantidadactual+1;
            String cadenatotal = String.valueOf(totalperdida);
            perder.setText(cadenatotal);

            //puntaje
            String puntajeactual=puntuacion.getText().toString();
            int puntaje=Integer.parseInt(puntajeactual);
            int totalpuntaje=puntaje-3;
            String cadenapuntos=String.valueOf(totalpuntaje);
            puntuacion.setText(cadenapuntos);



        }else if(numero==3){

            //ganados,perdidos,empatados
            Toast.makeText(this,"Ganaste",Toast.LENGTH_SHORT).show();
            String ganadasactual=ganar.getText().toString();
            int cantidadactual= Integer.parseInt(ganadasactual);
            int totalganadas=cantidadactual+1;
            String cadenatotal = String.valueOf(totalganadas);
            ganar.setText(cadenatotal);

            //puntaje
            String puntajeactual=puntuacion.getText().toString();
            int puntaje=Integer.parseInt(puntajeactual);
            int totalpuntaje=puntaje+6;
            String cadenapuntos=String.valueOf(totalpuntaje);
            puntuacion.setText(cadenapuntos);

        }

    }



    public void eventopapel(View v){
        int numero = (int) (Math.random() * 3) + 1;
        String cadena = String.valueOf(numero);
        opc.setText(cadena);
        if (numero==2){
            Toast.makeText(this,"empate",Toast.LENGTH_SHORT).show();
            String empateactual=empatar.getText().toString();
            int cantidadactual= Integer.parseInt(empateactual);
            int totalempate=cantidadactual+1;
            String cadenatotal = String.valueOf(totalempate);
            empatar.setText(cadenatotal);

        }else if(numero==3){
            //ganados,perdidos,empatados
            Toast.makeText(this,"perdiste",Toast.LENGTH_SHORT).show();
            String perdidaactual=perder.getText().toString();
            int cantidadactual= Integer.parseInt(perdidaactual);
            int totalperdida=cantidadactual+1;
            String cadenatotal = String.valueOf(totalperdida);
            perder.setText(cadenatotal);

            //puntaje
            String puntajeactual=puntuacion.getText().toString();
            int puntaje=Integer.parseInt(puntajeactual);
            int totalpuntaje=puntaje-3;
            String cadenapuntos=String.valueOf(totalpuntaje);
            puntuacion.setText(cadenapuntos);



        }else if(numero==1){

            //ganados,perdidos,empatados
            Toast.makeText(this,"Ganaste",Toast.LENGTH_SHORT).show();
            String ganadasactual=ganar.getText().toString();
            int cantidadactual= Integer.parseInt(ganadasactual);
            int totalganadas=cantidadactual+1;
            String cadenatotal = String.valueOf(totalganadas);
            ganar.setText(cadenatotal);

            //puntaje
            String puntajeactual=puntuacion.getText().toString();
            int puntaje=Integer.parseInt(puntajeactual);
            int totalpuntaje=puntaje+6;
            String cadenapuntos=String.valueOf(totalpuntaje);
            puntuacion.setText(cadenapuntos);

        }

    }

    public void eventotijera(View v){
        int numero = (int) (Math.random() * 3) + 1;
        String cadena = String.valueOf(numero);
        opc.setText(cadena);
        if (numero==3){
            Toast.makeText(this,"empate",Toast.LENGTH_SHORT).show();
            String empateactual=empatar.getText().toString();
            int cantidadactual= Integer.parseInt(empateactual);
            int totalempate=cantidadactual+1;
            String cadenatotal = String.valueOf(totalempate);
            empatar.setText(cadenatotal);

        }else if(numero==1){
            //ganados,perdidos,empatados
            Toast.makeText(this,"perdiste",Toast.LENGTH_SHORT).show();
            String perdidaactual=perder.getText().toString();
            int cantidadactual= Integer.parseInt(perdidaactual);
            int totalperdida=cantidadactual+1;
            String cadenatotal = String.valueOf(totalperdida);
            perder.setText(cadenatotal);

            //puntaje
            String puntajeactual=puntuacion.getText().toString();
            int puntaje=Integer.parseInt(puntajeactual);
            int totalpuntaje=puntaje-3;
            String cadenapuntos=String.valueOf(totalpuntaje);
            puntuacion.setText(cadenapuntos);



        }else if(numero==2){

            //ganados,perdidos,empatados
            Toast.makeText(this,"Ganaste",Toast.LENGTH_SHORT).show();
            String ganadasactual=ganar.getText().toString();
            int cantidadactual= Integer.parseInt(ganadasactual);
            int totalganadas=cantidadactual+1;
            String cadenatotal = String.valueOf(totalganadas);
            ganar.setText(cadenatotal);

            //puntaje
            String puntajeactual=puntuacion.getText().toString();
            int puntaje=Integer.parseInt(puntajeactual);
            int totalpuntaje=puntaje+6;
            String cadenapuntos=String.valueOf(totalpuntaje);
            puntuacion.setText(cadenapuntos);

        }

    }




}
