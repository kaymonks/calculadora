package com.example.kaymo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etValor1;
    private EditText etValor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View view){

        etValor1 = (EditText)findViewById(R.id.etValor1);
        etValor2 = (EditText)findViewById(R.id.etValor2);

        double valor1 = Double.parseDouble(etValor1.getText().toString());
        double valor2 = Double.parseDouble(etValor2.getText().toString());


//        if (etValor1.equals("")){
//            Toast toast2 = Toast.makeText(this, "v1 vazio ", Toast.LENGTH_LONG);
//            toast2.show();
//            return;
//        }

        double resultado = valor1 + valor2;

        Toast toast = Toast.makeText(this, "A soma é: " + resultado, Toast.LENGTH_LONG);
        toast.show();

    }

    public void subtrair(View view) {
        etValor1 = (EditText)findViewById(R.id.etValor1);
        etValor2 = (EditText)findViewById(R.id.etValor2);

        double valor1 = Double.parseDouble(etValor1.getText().toString());
        double valor2 = Double.parseDouble(etValor2.getText().toString());

        double resultado = valor1 - valor2;

        Toast toast = Toast.makeText(this, "A subtração é: " + resultado, Toast.LENGTH_LONG);
        toast.show();
    }


    public void dividir(View view) {
        etValor1 = (EditText)findViewById(R.id.etValor1);
        etValor2 = (EditText)findViewById(R.id.etValor2);

        double valor1 = Double.parseDouble(etValor1.getText().toString());
        double valor2 = Double.parseDouble(etValor2.getText().toString());

        if(valor2 == 0) {
            Toast toast = Toast.makeText(this, "Impossível dividir por zero", Toast.LENGTH_LONG);
            toast.show();
            return;
        }

        double resultado = valor1 / valor2;

        Toast toast = Toast.makeText(this, "A divisão é: " + resultado, Toast.LENGTH_LONG);
        toast.show();
    }


    public void multiplicar(View view) {
        etValor1 = (EditText)findViewById(R.id.etValor1);
        etValor2 = (EditText)findViewById(R.id.etValor2);

        double valor1 = Double.parseDouble(etValor1.getText().toString());
        double valor2 = Double.parseDouble(etValor2.getText().toString());

        double resultado = valor1 * valor2;

        Toast toast = Toast.makeText(this, "A multiplicação é: " + resultado, Toast.LENGTH_LONG);
        toast.show();
    }
}


