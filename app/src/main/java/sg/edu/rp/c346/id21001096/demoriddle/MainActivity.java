package sg.edu.rp.c346.id21001096.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    TextView q1;
    Button btnReveal;
    TextView q2;
    Button btnReveal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2

        q1 = findViewById(R.id.q1);
        btnReveal = findViewById(R.id.btnReveal);
        q2 = findViewById(R.id.q2);
        btnReveal2 = findViewById(R.id.btnReveal2);


        //Event handling Step 3
        btnReveal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question" , "Q1");
                startActivity(intent);
            }
        });

        btnReveal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity2.class);
                intent.putExtra("Question2" , "Q2");
                startActivity(intent);
            }
        });

    }
}