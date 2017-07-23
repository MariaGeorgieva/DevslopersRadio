package com.example.maria.devslopersradio.fragments;


import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.maria.devslopersradio.R;
import com.example.maria.devslopersradio.adapters.DetailsAdapter;
import com.example.maria.devslopersradio.services.DataService;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsFragment extends Fragment {
    private static final String ARG_DETAIL_PLAYLIST_TYPE = "station_detail_type";

    public static final int DETAIL_PLAYLIST_POP_MUSIC = 0;
    public static final int DETAIL_PLAYLIST_LOVE_MUSIC = 1;
    public static final int DETAIL_PLAYLIST_DISCO_MUSIC = 2;

    private int playListType;


    public DetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param playListType The type of play List
     * @return A new instance of fragment DetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailsFragment newInstance(int playListType) {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_DETAIL_PLAYLIST_TYPE, playListType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            playListType = getArguments().getInt(ARG_DETAIL_PLAYLIST_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_details, container, false);
        // Inflate the layout for this fragment

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recycler_detail);
        //to be more faster we use:
        recyclerView.setHasFixedSize(true);

        DetailsAdapter adapter;
        if (playListType == DETAIL_PLAYLIST_POP_MUSIC) {
            adapter = new DetailsAdapter(DataService.getInstance().getPopMusicPlaylist());
        } else if (playListType == DETAIL_PLAYLIST_LOVE_MUSIC) {
            adapter = new DetailsAdapter(DataService.getInstance().getLoveMusicPlaylist());
        } else {
            adapter = new DetailsAdapter(DataService.getInstance().getPartyStations());
        }

        recyclerView.addItemDecoration(new HorizontalSpaceItemDecorator(30));
        recyclerView.setAdapter(adapter);

        //to set it horizontal
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        return v;
    }
}


