package br.edu.ifpb.gerenciadoreslayout;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.enviarbutton);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        EditText editText = findViewById(R.id.EditText);
        String nome = editText.getText().toString();
        Log.i("GerenciadoresLayout","Ola, " + nome);
        Context contexto = getApplicationContext();
        String texto = nome;
        int duracao = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(contexto, texto, duracao);
        toast.show();
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}
