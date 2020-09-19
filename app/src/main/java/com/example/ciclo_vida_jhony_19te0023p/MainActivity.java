package com.example.ciclo_vida_jhony_19te0023p;

        import androidx.appcompat.app.AppCompatActivity;

        import android.widget.TextView;
        import android.widget.Toast;
        import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private TextView texto2;
    private TextView texto3;
    private Toast mensaje;

    //Fase de Inicio

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        mensaje=Toast.makeText(this,"Iniciando Apliacion",Toast.LENGTH_LONG);
        mensaje.show();
        super.onStart();

    }
    @Override
    protected  void onPause(){
        mensaje=Toast.makeText(this,"La app esta en Pausa",Toast.LENGTH_LONG);
        mensaje.show();
        super.onPause();

    }

    @Override
    protected  void onResume(){
        mensaje=Toast.makeText(this,"Ciclo Resumen",Toast.LENGTH_LONG);
        mensaje.show();
        super.onResume();

    }

    @Override
    protected  void onStop(){
        mensaje=Toast.makeText(this,"Deteniendo Aplicacion",Toast.LENGTH_LONG);
        mensaje.show();
        super.onStop();

    }

    @Override
    protected  void onDestroy(){
        mensaje=Toast.makeText(this,"Destruyendo Aplicacion",Toast.LENGTH_LONG);
        mensaje.show();
        super.onDestroy();

    }



}


