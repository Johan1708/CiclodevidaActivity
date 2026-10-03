package com.example.ciclodevidaactivity;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrarMensaje("onCreate(): Activity creada");
    }

    @Override
    protected void onStart() {
        super.onStart();

        mostrarMensaje("onStart(): Activity visible");
    }


    @Override
    protected void onResume() {
        super.onResume();

        mostrarMensaje("onResume(): Activity en primer plano");
    }

    @Override
    protected void onPause() {
        super.onPause();

        mostrarMensaje("onPause(): Activity parcialmente oculta");
    }

    @Override
    protected void onStop() {
        super.onStop();

        mostrarMensaje("onStop(): Activity detenido");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        mostrarMensaje("onRestart(): Activity reiniciandose");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mostrarMensaje("onDestroy(): Activity destruida");
    }

    private void mostrarMensaje(String mensaje) {
        Toast.makeText(
                getApplicationContext(),
                mensaje,
                Toast.LENGTH_LONG
        ).show();
    }
}
