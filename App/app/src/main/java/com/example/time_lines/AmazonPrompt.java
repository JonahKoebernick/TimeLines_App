package com.example.time_lines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AmazonPrompt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon_prompt);

        Button btnSkipAmazon = (Button) (findViewById(R.id.btnSkipAmazon));
        btnSkipAmazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This button will send the user to the welcome screen.
            }
        });

        Button btnAmazonSignIn = (Button) (findViewById(R.id.btnAmazonSignIn));
        btnAmazonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AmazonSignIn.class);
                startActivity(intent);
            }
        });
    }
}
