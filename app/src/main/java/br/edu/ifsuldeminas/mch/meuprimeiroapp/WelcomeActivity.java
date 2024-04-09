package br.edu.ifsuldeminas.mch.meuprimeiroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Registrar o layout
        setContentView(R.layout.activity_welcome);

        Intent intentDaChamada = getIntent();
        String userName = intentDaChamada.getStringExtra("user_name");

        View layout = findViewById(R.id.activity_welcome_id);

        Snackbar snackbar = Snackbar.make(layout, "Bem vindo" + userName, Snackbar.LENGTH_LONG);

        snackbar.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
