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

import com.example.android.sunshine.R;

import java.util.List;


public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{

    private String[] mWeatherData;


    public ForecastAdapter( ){
    }

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater linear = LayoutInflater.from(context);
        View view = linear.inflate(R.layout.forecast_list_item, parent, false);
        ForecastAdapterViewHolder holder = new ForecastAdapterViewHolder((TextView) view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        String weather = mWeatherData[position];
        holder.mWeatherTextView.setText(weather);
     //   holder.bind(position);
    }

    @Override
    public int getItemCount() {
        if (null == mWeatherData) return 0;
        return mWeatherData.length;
    }

    public void setWeatherData(String [] weatherData){
        this.mWeatherData = weatherData;
        notifyDataSetChanged();

    }



    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{

        public final TextView mWeatherTextView;

          ForecastAdapterViewHolder(View viewParam){
             super(viewParam);
            mWeatherTextView = (TextView) viewParam.findViewById(R.id.tv_weather_data);
         }
//
//         public void bind(int position) {
//            //ForecastAdapter forecast = mWeatherData.get(position);
//        }

        
    }
}
