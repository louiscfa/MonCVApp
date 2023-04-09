package com.example.moncvapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CompetencesActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competences);

        ArrayList<Langage> langages = new ArrayList<Langage>();
        langages.add(new Langage("Java", 3));
        langages.add(new Langage("PHP", 4));
        langages.add(new Langage("Javascript", 4));
        ListView listViewLangages = findViewById(R.id.listViewTitleLangage);
        LangageBaseAdapter adapter = new LangageBaseAdapter(langages, this);
        listViewLangages.setAdapter(adapter);

        ArrayList<Projet> projets = new ArrayList<Projet>();
        projets.add(new Projet("DBZ", "Jeu de combat", "http://www.github.com"));
        projets.add(new Projet("Tetris", "Gameboy color", "http://www.github.com"));
        ListView listviewProjets =findViewById(R.id.listViewProjet);
        ProjetBaseAdapter projetAdapter = new ProjetBaseAdapter(projets, this);
        listviewProjets.setAdapter(projetAdapter);

        Button button1 = findViewById(R.id.back_button);
        button1.setOnClickListener(this);
    }

    public void onClick(View v) {
        startActivity(new Intent(CompetencesActivity.this, MainActivity.class));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}