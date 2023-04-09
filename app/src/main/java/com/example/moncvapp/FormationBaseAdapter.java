package com.example.moncvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FormationBaseAdapter extends BaseAdapter {
    private ArrayList<Formation> formations;
    private Context context;

    public FormationBaseAdapter(ArrayList<Formation> formations, Context context) {
        this.formations = formations;
        this.context = context;
    }

    @Override
    public int getCount() {
        return formations.size();
    }

    @Override
    public Object getItem(int position) {
        return formations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // permet de dire via le contexte que je vais prendre le contexe, prends ce layout là et
        // mets le en vue de cet item
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_formation, parent, false);
        }
        TextView textViewObtention = convertView.findViewById(R.id.textViewObtention);
        textViewObtention.setText(formations.get(position).getDateObtention());
        TextView textViewDiplome = convertView.findViewById(R.id.textViewDiplome);
        textViewDiplome.setText(formations.get(position).getNomDiplome());
        TextView textViewLieu = convertView.findViewById(R.id.textViewLieu);
        textViewLieu.setText(formations.get(position).getLieu());

        return convertView;
    }
}
