package com.foysaldev.androidspinnerpart2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int [] upazila;
    private String [] mymensinghdistrict;
    private String [] population;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context, int[] upazila, String[] mymensinghdistrict, String[] population) {
        this.context = context;
        this.upazila = upazila;
        this.mymensinghdistrict = mymensinghdistrict;
        this.population = population;
    }

    @Override
    public int getCount() {
        return mymensinghdistrict.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.sample_layout,null,false);
        }

        ImageView imageView = view.findViewById(R.id.ImageViewId);
        imageView.setImageResource(upazila[i]);

        TextView upazila = view.findViewById(R.id.TextViewUpazila);
        upazila.setText(mymensinghdistrict[i]);

        TextView population1 = view.findViewById(R.id.TextViewPopulation);
        population1.setText(population[i]);

        return view;
    }
}
