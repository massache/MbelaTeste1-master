package com.example.angelo.mbelateste1;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TermsActivity extends AppCompatActivity {

    TextView textView;
    Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        textView = findViewById(R.id.termsTitle);
        typeface = Typeface.createFromAsset(getAssets(),"fonts/Gotham Bold.otf");
        textView.setTypeface(typeface);
    }
}
