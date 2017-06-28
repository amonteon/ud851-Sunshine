package com.example.android.sunshine.utilities;

/**
 * Created by alejandramonteon on 6/28/17.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.compat.R.*;

import com.example.android.sunshine.R;

import java.util.List;


public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{
    private String [] mWeatherData;

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater linear = LayoutInflater.from(context);

       View viewList = linear.inflate(R.layout.forecast_list_item, parent, false);
        ForecastAdapterViewHolder hold = new ForecastAdapterViewHolder(viewList);
        return hold;
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position, List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
         public final TextView mWeatherTextView;
         public ForecastAdapterViewHolder(TextView viewParam){
             super(viewParam);
            mWeatherTextView = (TextView) viewParam.findViewById(R.id.recyclerview_forecast);
         }

    }
}
