package com.example.finalmovil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        String usuario = getIntent().getStringExtra("usuario");


        TextView nombreAlumno = findViewById(R.id.nombre_alumno);
        nombreAlumno.setText(usuario);


        TextView informacion = findViewById(R.id.informacion);
        informacion.setText("Información");

        TextView experiencia = findViewById(R.id.experiencia);
        experiencia.setText("Experiencia");


        ImageView iconoInstagram = findViewById(R.id.icono_instagram);
        ImageView iconoGithub = findViewById(R.id.icono_github);
        ImageView iconoLinkedin = findViewById(R.id.icono_linkedin);

        iconoInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { abrirEnlace("https://www.instagram.com/chinogaleanoo/"); } });

        iconoGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { abrirEnlace("https://github.com/joaquingaleano"); } });

        iconoLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { abrirEnlace("https://www.linkedin.com/in/luciano-joaquin-galeano-3b3199236/"); } });
        }
        private void abrirEnlace(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}

