package com.example.moncvapp;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjetBaseAdapter extends BaseAdapter {
    public ProjetBaseAdapter(ArrayList<Projet> projets, Context context) {
        this.projets = projets;
        this.context = context;
    }
    private ArrayList<Projet> projets;
    private Context context;

    @Override
    public int getCount() {
        return projets.size();
    }

    @Override
    public Object getItem(int position) {
        return projets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_projet, parent, false);
        }
        TextView textViewNomProjet = convertView.findViewById(R.id.textViewNomProjet);
        textViewNomProjet.setText(projets.get(position).getNomProjet());

        TextView textViewDescription = convertView.findViewById(R.id.textViewDescriptionProjet);
        textViewDescription.setText(projets.get(position).getDescriptionProjet());

        ImageButton imageButton= convertView.findViewById(R.id.imageButtonProjet);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(projets.get(position).getLien()));
                context.startActivity(intent);
            }
        });

        return convertView;
    }
}
