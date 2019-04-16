package com.example.android_wiki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView comoFunciona;
    TextView cicloCardiaco;
    TextView variables;
    TextView exercicios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        comoFunciona = (TextView) findViewById(R.id.comoFunciona);
        cicloCardiaco = (TextView) findViewById(R.id.cicloCardiaco);
        variables = (TextView) findViewById(R.id.variables);
        exercicios = (TextView) findViewById(R.id.exercicios);

        comoFunciona.setVisibility(View.GONE);
        cicloCardiaco.setVisibility(View.GONE);
        variables.setVisibility(View.GONE);
        exercicios.setVisibility(View.GONE);
    }
    public void toggleComoFunciona(View view) {

        comoFunciona.setVisibility( comoFunciona.isShown()
                ? View.GONE
                : View.VISIBLE );
    }

    public void toggleCicloCardiaco(View view) {

        cicloCardiaco.setVisibility( cicloCardiaco.isShown()
                ? View.GONE
                : View.VISIBLE );
    }

    public void toggleVariables(View view) {

        variables.setVisibility( variables.isShown()
                ? View.GONE
                : View.VISIBLE);
    }

    public void toggleExercicios(View view) {

        exercicios.setVisibility( exercicios.isShown()
                ? View.GONE
                : View.VISIBLE);
    }
}
