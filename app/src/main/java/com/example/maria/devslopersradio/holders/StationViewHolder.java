package com.example.maria.devslopersradio.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maria.devslopersradio.R;
import com.example.maria.devslopersradio.model.Station;

/**
 * Created by Maria on 22.7.2017 г..
 */

public class StationViewHolder extends RecyclerView.ViewHolder {

    private ImageView mainImage;
    private TextView titleTextView;

    public StationViewHolder(View itemView) {

        super(itemView);

        this.mainImage = (ImageView) itemView.findViewById(R.id.detail_main_image);
        this.titleTextView = (TextView) itemView.findViewById(R.id.detail_main_text);
    }

    public void updateUI(Station station) {
        String uri = station.getImgUri();
        int resource = mainImage.getResources().getIdentifier(uri, null, mainImage.getContext().getPackageName());
        mainImage.setImageResource(resource);

        titleTextView.setText(station.getStationTitle());


    }
}
