package com.example.kloten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    private Button Calculator;
    private Button MathSolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Calculator = (Button) findViewById(R.id.Calculator);
        Calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        MathSolver = (Button) findViewById(R.id.MathSolver);
        MathSolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMathSolver();
            }
        });
    }

    public void openMainActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void openMathSolver() {

       Intent intent = new Intent(this, MathSolver.class);
       startActivity(intent);

    }
}
