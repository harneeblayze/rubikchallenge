package com.example.android.rubikcube;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HARNY on 2/25/2018.
 */

public class DataAdapter extends ArrayAdapter<DataSource> {

    public DataAdapter(Activity context, ArrayList<DataSource> sources){

        super(context,0,sources);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.eachitem, parent, false);
        }
        DataSource currentData = getItem(position);

        TextView textView = listItemView.findViewById(R.id.dimens);
        textView.setText(currentData.getN());

        return listItemView;

    }




    }
