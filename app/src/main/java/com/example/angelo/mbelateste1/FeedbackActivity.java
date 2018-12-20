package com.example.angelo.mbelateste1;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class FeedbackActivity extends AppCompatActivity {

    TextView texto;
    Typeface typeface;
    ImageButton enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        texto = (TextView)findViewById(R.id.feedbackMsg);
        enviar = findViewById(R.id.enviarOpiniao);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FeedbackActivity.this, CadastroActivity.class));
            }
        });

        //Fonte externa
        typeface = Typeface.createFromAsset(getAssets(), "fonts/Gotham Light.otf");
        texto.setTypeface(typeface);


    }
}
