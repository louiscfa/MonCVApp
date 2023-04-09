package com.example.moncvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Experience> experiences = new ArrayList<Experience>();
        experiences.add(new Experience("Septembre 2022", "Aujourd'hui",
                "ADP GSI", "Développeur SIRH"));
        experiences.add(new Experience("Septembre 2018", "Septembre 2020",
                "Influence", "Ambassadeur & Manager Oculus France"));
        experiences.add(new Experience("Septembre 2017", "Juillet 2018",
                "Unesco",
                "Comptable & Clerf au sein de la fédération de l'Inde"));

        ListView listViewExperiences = findViewById(R.id.listViewExperiences);
        ExperienceBaseAdapter adapter = new ExperienceBaseAdapter(experiences, this);
                listViewExperiences.setAdapter(adapter);

        ArrayList<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("2023", "Concepteur Développeur " +
                "d'Applications", "Paris"));
        formations.add(new Formation("2022", "Titre professionnel" +
                "Développeur Web et Web Mobile", "Chennevières-sur-Marne"));
        formations.add(new Formation("2017", "Diplome de comptabilité et gestion"
                , "Paris"));
        formations.add(new Formation("2014", "BTS MUC"
                , "Villemomble"));

        ListView listViewFormations = findViewById(R.id.listViewFormation);
        FormationBaseAdapter formationAdapter = new FormationBaseAdapter(formations, this);
            listViewFormations.setAdapter(formationAdapter);

            ArrayList<Langage> langages = new ArrayList<Langage>();
            langages.add(new Langage("Java", 3));

            Button button = findViewById(R.id.buttonSkills);
            button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, CompetencesActivity.class));
    }
}