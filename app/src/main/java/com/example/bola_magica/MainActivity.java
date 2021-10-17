package com.example.bola_magica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


/*
* Asume el control, eres una mujer fuerte e independiente
* Vive cada día como si fuera el último, porque un día de estos lo será
* Una cosa es segura, estar sentado y sentirse miserable no hará las cosas más felices
* Es más fácil ser sabios con otros que con nosotros mismos
* Nunca darse por vencido y la buena suerte le seguirá a uno
* Toma consejo en el vino, pero decide después con agua
* Si eres bueno en algo jamás lo hagas gratis
* Nada tan peligroso como un buen consejo acompañado de un mal ejemplo
* Nunca se case, señor Gray. Es la única manera de mantener todas las ilusiones
* Aprende de los errores de tus padres, usa condón
* */

public class MainActivity extends AppCompatActivity {

    private String[] consejos = new String[10];
    ImageView img_magic_ball;
    TextView textV_consejo;
    final static int MAX = 9, MIN = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init_comonents();
        init_set_consejos();

        set_click_img_magic_ball();
    }

    private void set_click_img_magic_ball() {
        img_magic_ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_consejo = (int)Math.floor(Math.random()*(MAX-MIN+1)+MIN);
                String consejo = consejos[num_consejo];
                textV_consejo.setText(consejo);
            }
        });
    }

    private void init_comonents() {
        img_magic_ball = (ImageView) findViewById(R.id.img_magic_ball);
        textV_consejo = (TextView) findViewById(R.id.textV_consejo);
    }

    private void init_set_consejos() {
        consejos[0] = "Asume el control, eres una mujer fuerte e independiente";
        consejos[1] = "Vive cada día como si fuera el último, porque un día de estos lo será";
        consejos[2] = "Una cosa es segura, estar sentado y sentirse miserable no hará las cosas más felices";
        consejos[3] = "Es más fácil ser sabios con otros que con nosotros mismos";
        consejos[4] = "Nunca darse por vencido y la buena suerte le seguirá a uno";
        consejos[5] = "Toma consejo en el vino, pero decide después con agua";
        consejos[6] = "Si eres bueno en algo jamás lo hagas gratis";
        consejos[7] = "Nada tan peligroso como un buen consejo acompañado de un mal ejemplo";
        consejos[8] = "Nunca se case, señor Gray. Es la única manera de mantener todas las ilusiones";
        consejos[9] = "Aprende de los errores de tus padres, usa condón";
    }
}