package com.example.fabricio.bemvindo;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class BemVindoActivity extends AppCompatActivity {

    private  static final String TAG = "login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);
        Log.i(TAG, "Teste5");
        //Recebe o nome enviado por parâmetro
        Bundle args = getIntent().getExtras();
        Log.i(TAG, "Teste6");
        String nome = args.getString("nome");
        Log.i(TAG, "Teste7");
        //Vamos atualizar o texto do TextView com uma mensagem de bem-vindo
        TextView text = (TextView) findViewById(R.id.text);
        Log.i(TAG, "Teste8");
        text.setText(nome + ", seja bem-vindo!");
        Log.i(TAG, "Teste9");

        //Adiciona o botão "up navigation"
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Log.i(TAG, "Teste10");
        int id = item.getItemId();
        if(id == android.R.id.home){
            //O método finish vai encerrar essa activiry
            finish();
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}
