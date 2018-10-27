package com.example.a00.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pantallanuevojugador extends AppCompatActivity {
    private Button guardar;
    private EditText nombres;
    private String nomb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallanuevojugador);
        guardar=findViewById(R.id.idguardarnick);
        nombres=findViewById(R.id.nombrejugador);


        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nomb=nombres.getText().toString();

                Intent i = new Intent();
                i.putExtra("nombre",nomb);

                setResult(RESULT_OK,i);
                finish();

            }
        });



    }
}
