package com.example.maria.devslopersradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.maria.devslopersradio.R;
import com.example.maria.devslopersradio.activities.MainActivity;
import com.example.maria.devslopersradio.holders.StationViewHolder;
import com.example.maria.devslopersradio.model.Station;

import java.util.ArrayList;

/**
 * Created by Maria on 22.7.2017 г..
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //parent is recyclerView

        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);

        return new StationViewHolder(stationCard);
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, final int position) {
        //actually pass data to adapter
        final Station station = stations.get(position);
        holder.updateUI(station);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //load the details screen
                MainActivity.getMainActivity().loadDetailScreen(station);

            }
        });


    }

    @Override
    public int getItemCount() {

        return stations.size();
    }
}
