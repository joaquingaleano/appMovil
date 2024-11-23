package com.example.finalmovil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private static final String USUARIO_VALIDO = "usuario";
    private static final String CONTRASENA_VALIDA = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText campoUsuario = findViewById(R.id.usuario);
        EditText campoContrasena = findViewById(R.id.contrasena);


        Button botonIngresar = findViewById(R.id.boton_ingresar);
        botonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = campoUsuario.getText().toString();
                String contrasena = campoContrasena.getText().toString();


                if (usuario.isEmpty() || contrasena.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                } else if (usuario.equals(USUARIO_VALIDO) && contrasena.equals(CONTRASENA_VALIDA)) {

                    Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("usuario", "Luciano Joaquin Galeano");
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
