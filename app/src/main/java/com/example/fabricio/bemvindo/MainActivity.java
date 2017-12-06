package com.example.fabricio.bemvindo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  static final String TAG = "login";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edNome = (EditText) findViewById(R.id.edNome);
        final EditText edSenha = (EditText) findViewById(R.id.edSenha);
        Button btLogin = (Button) findViewById(R.id.btLogin);

        btLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                String login = edNome.getText().toString();
                String senha = edSenha.getText().toString();
                if("fabricio".equals(login) && "123".equals(senha)) {
                    //alert("Bem vindo, login realizado com sucesso!");
                    //Navega para a próxima tela
                    Intent intent = new Intent(getContext(), BemVindoActivity.class);
                    Bundle params = new Bundle();
                    params.putString("nome", "Fabrício Ribeiro");
                    intent.putExtras(params);
                    startActivity(intent);

                }else{
                    alert("Login e/ou senha incorretos.");
                }
            }
        });
    }

    private Context getContext(){
        return this;
    }

    private void alert(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
