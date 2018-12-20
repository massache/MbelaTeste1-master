package com.example.angelo.mbelateste1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class Autenticacao extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_autenticacao);

        getSupportFragmentManager().
                beginTransaction().
                add(R.id.contentor, new motoristaFragment()).
                commit();
    }



}





