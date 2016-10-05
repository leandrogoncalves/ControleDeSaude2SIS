package br.com.fiap.controlerdesaude2sis;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Context context = this;
    TextView cadastrarTextView;
    Button entrarButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadastrarTextView = (TextView) findViewById(R.id.cadastrarTextView);
        cadastrarTextView.setOnClickListener(cadastrarListener);

    }
    //Cria o método do ouvite para o evento click
    View.OnClickListener cadastrarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Intent é usado para chamar qualquer coisa no Android
            //Chama a activity Cadastro
            Intent intent = new Intent(context, CadastroActivity.class);
            //Abre a activity
            startActivity(intent);
        }
    };
}
