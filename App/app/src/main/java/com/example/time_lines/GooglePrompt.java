package com.example.time_lines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GooglePrompt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_prompt);

        Button btnSkipGoogle = (Button) (findViewById(R.id.btnSkipGoogle));
        btnSkipGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UVicPrompt.class);
                startActivity(intent);
            }
        });

        Button btnGoogleSignIn = (Button) (findViewById(R.id.btnGoogleSignIn));
        btnGoogleSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GoogleSignIn.class);
                startActivity(intent);
            }
        });
    }

}
