package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private String number = "";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol = "";

    private TextView solucion;
    private Button bt0, bt2, bt1, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    private Button btsuma,btresta,btmultiplicacion,btdivision,btigual,btlimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //poner el icono en action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        solucion = findViewById(R.id.solucion);


        bt0 =findViewById(R.id.num_0);
        bt1 =findViewById(R.id.num_1);
        bt2 =findViewById(R.id.num_2);
        bt3 =findViewById(R.id.num_3);
        bt4 =findViewById(R.id.num_4);
        bt5 =findViewById(R.id.num_5);
        bt6 =findViewById(R.id.num_6);
        bt7 =findViewById(R.id.num_7);
        bt8 =findViewById(R.id.num_8);
        bt9 =findViewById(R.id.num_9);


        btsuma =findViewById(R.id.bt_sum);
        btresta =findViewById(R.id.bt_rest);
        btlimpiar =findViewById(R.id.bt_lim);
        btdivision =findViewById(R.id.bt_div);
        btmultiplicacion =findViewById(R.id.bt_mult);
        btigual =findViewById(R.id.bt_igual);

        //escuchar por boton

        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);


        btsuma.setOnClickListener(this);
        btresta.setOnClickListener(this);
        btlimpiar.setOnClickListener(this);
        btdivision.setOnClickListener(this);
        btmultiplicacion.setOnClickListener(this);
        btigual.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {


        switch(view.getId()){
            case R.id.num_0:
                number =number + "0";
                solucion.setText(number);
                break;
            case R.id.num_1:
                number =number + "1";
                solucion.setText(number);
                break;
            case R.id.num_2:
                number =number + "2";
                solucion.setText(number);
                break;
            case R.id.num_3:
                number =number + "3";
                solucion.setText(number);
                break;
            case R.id.num_4:
                number =number + "4";
                solucion.setText(number);
                break;
            case R.id.num_5:
                number =number + "5";
                solucion.setText(number);
                break;
            case R.id.num_6:
                number =number + "6";
                solucion.setText(number);
                break;
            case R.id.num_7:
                number =number + "7";
                solucion.setText(number);
                break;
            case R.id.num_8:
                number =number + "8";
                solucion.setText(number);
                break;
            case R.id.num_9:
                number =number + "9";
                solucion.setText(number);
                break;


            case R.id.bt_sum:
                symbol="+";
                num1 =Integer.parseInt(number);
                number="";
                break;

            case R.id.bt_rest:
                symbol="-";
                num1 =Integer.parseInt(number);
                number="";
                break;

            case R.id.bt_lim:
                symbol="";
                num1 =0;
                number="";
                num2=0;
                solucion.setText("");
                break;

            case R.id.bt_div:
                symbol="/";
                num1 =Integer.parseInt(number);
                number="";
                break;

            case R.id.bt_mult:
                symbol="*";
                num1 =Integer.parseInt(number);
                number="";
                break;

            case R.id.bt_igual:
                num2 =Integer.parseInt(number);
                switch (symbol){
                    case "+":
                        solucion.setText(num1 + " + " + num2+" = " + (num1+num2));
                        break;
                    case "-":
                        solucion.setText(num1 + " - " + num2 + " = " + (num1-num2));
                        break;
                    case "/":
                        solucion.setText(num1 + " / " + num2 + " = " + (num1/num2));
                        break;
                    case "*":
                        solucion.setText(num1 + " x " + num2 + " = " + (num1*num2));
                        break;

                }
                num1=0;
                num2=0;
                number="";

                break;


        }
    }

}
