package com.example.time_lines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UVicPrompt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uvic_prompt);

        Button btnSkipUVic = (Button) (findViewById(R.id.btnSkipUVic));
        btnSkipUVic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AmazonPrompt.class);
                startActivity(intent);
            }
        });

        Button btnUVicSignIn = (Button) (findViewById(R.id.btnUVicSignIn));
        btnUVicSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UVicSignIn.class);
                startActivity(intent);
            }
        });
    }
}
