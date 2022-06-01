package com.example.componentesbsicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkbranco;
    private CheckBox checkverde;
    private CheckBox checkamarelo;
    private CheckBox checkroxo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.PersonName);
        campoEmail = findViewById(R.id.Email);
        textoResultado = findViewById(R.id.texto);

        //CheckBox
        checkamarelo = findViewById(R.id.amarelo);
        checkbranco = findViewById(R.id.branco);
        checkroxo = findViewById(R.id.roxo);
        checkverde = findViewById(R.id.verde);

    }

    public void checkBox(){
        String texto = " ";
        if(checkverde.isChecked()){
            texto = "verde selecionado ";        }

        if (checkbranco.isChecked()) {
                texto = texto + "branco selecionado ";
            }
        if (checkroxo.isChecked()) {
            texto = texto + "roxo selecionado ";
        }
        if (checkamarelo.isChecked()) {
            texto = texto +  "amarelo selecionado ";
        }

        textoResultado.setText(texto);





    }

    public void Enviar(View view){

        checkBox();

        //EditText resultado = findViewById(R.id.PersonName);
        //TextView textoInferior = findViewById(R.id.texto);
        //EditText resultado2 = findViewById(R.id.Email);


        //String nome = resultado.getText().toString();
        //String nome2 = resultado2.getText().toString();
        //textoInferior.setText(nome + " " + nome2);
    }

    public void Limpar(View view){

        campoNome.setText(" ");
        campoEmail.setText(" ");
        textoResultado.setText(" ");

    }

}