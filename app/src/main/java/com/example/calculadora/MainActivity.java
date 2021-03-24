package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText cajanumeros,concatenar;
    TextView cajaresultado;
    Button btnborrar, btndividir, btnmultiplicar, btnpotencia, btnrestar, btnsumar, btnresultado, btnuno, btndos, btntres, btncuatro, btncinco, btnseis, btnsiete, btnocho, btnnueve, btncero, btnporcentaje, btnpunto;
    double numuno, numdos,resultado;
    String x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajanumeros=findViewById(R.id.caja);
        cajaresultado=findViewById(R.id.resultadocaja);
        btnborrar=findViewById(R.id.borrar);
        btndividir=findViewById(R.id.dividir);
        btnmultiplicar=findViewById(R.id.multiplicar);
        btnpotencia=findViewById(R.id.potencia);
        btnrestar=findViewById(R.id.restar);
        btnsumar=findViewById(R.id.sumar);
        btnresultado=findViewById(R.id.resultado);
        btnuno=findViewById(R.id.uno);
        btndos=findViewById(R.id.dos);
        btntres=findViewById(R.id.tres);
        btncuatro=findViewById(R.id.cuatro);
        btncinco=findViewById(R.id.cinco);
        btnseis=findViewById(R.id.seis);
        btnsiete=findViewById(R.id.siete);
        btnocho=findViewById(R.id.ocho);
        btnnueve=findViewById(R.id.nueve);
        btncero=findViewById(R.id.cero);
        btnporcentaje=findViewById(R.id.porcentaje);
        btnpunto=findViewById(R.id.punto);



        btncero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar=(EditText) findViewById(R.id.caja);
                cajanumeros.setText(concatenar.getText().toString()+"0");
            }
        });

        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar=(EditText) findViewById(R.id.caja);
                cajanumeros.setText(concatenar.getText().toString()+"1");
            }
        });


        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar=(EditText) findViewById(R.id.caja);
                cajanumeros.setText(concatenar.getText().toString()+"2");
            }
        });

        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar=(EditText) findViewById(R.id.caja);
                cajanumeros.setText(concatenar.getText().toString()+"3");
            }
        });

        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar=(EditText) findViewById(R.id.caja);
                cajanumeros.setText(concatenar.getText().toString()+"4");
            }
        });

        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar=(EditText) findViewById(R.id.caja);
                cajanumeros.setText(concatenar.getText().toString()+"5");
            }
        });

        btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar=(EditText) findViewById(R.id.caja);
                cajanumeros.setText(concatenar.getText().toString()+"6");
            }
        });

        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar=(EditText) findViewById(R.id.caja);
                cajanumeros.setText(concatenar.getText().toString()+"7");
            }
        });

        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar=(EditText) findViewById(R.id.caja);
                cajanumeros.setText(concatenar.getText().toString()+"8");
            }
        });

        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar=(EditText) findViewById(R.id.caja);
                cajanumeros.setText(concatenar.getText().toString()+"9");
            }
        });

        btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar=(EditText) findViewById(R.id.caja);
                cajanumeros.setText(concatenar.getText().toString()+".");
            }
        });

        btnborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numuno = 0;
                numdos = 0;
                cajanumeros.setText("");
            }
        });

        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x="+";
                concatenar= (EditText) findViewById(R.id.caja);
                numuno = Double.parseDouble(concatenar.getText().toString());
                concatenar.setText("");
            }

        });


        btnresultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                concatenar= (EditText) findViewById(R.id.caja);
                numdos=Double.parseDouble(cajanumeros.getText().toString());


                if (x.equals("+")){
                    cajanumeros.setText("");
                    resultado = numuno + numdos;


                }

                if (x.equals("-")){
                    cajanumeros.setText("");
                    resultado = numuno - numdos;
                }

                if (x.equals("*")){
                    cajanumeros.setText("");
                    resultado = numuno * numdos;
                }

                if(x.equals("/")){

                    cajanumeros .setText("");
                    if (numdos!=0){
                        resultado = numuno / numdos;
                    }
                    else
                    {
                        cajanumeros.setText("...");
                    }
                }

                concatenar.setText(String.valueOf(resultado));
            }
        });

        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = "-";
                concatenar = (EditText) findViewById(R.id.caja);
                numuno=Double.parseDouble(concatenar.getText().toString());
                cajanumeros.setText("");
            }
        });

        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x ="*";
                concatenar = (EditText) findViewById(R.id.caja);
                numuno =  Double.parseDouble(concatenar.getText().toString());
                cajanumeros.setText("");
            }
        });

        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = "/";
                concatenar = (EditText) findViewById(R.id.caja);
                numuno = Double.parseDouble(concatenar.getText().toString());
                cajanumeros.setText("");
            }
        });







    }





    




}