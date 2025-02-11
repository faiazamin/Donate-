package com.sbrotee63.donate;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;



public class CustomWindowAdapter implements GoogleMap.InfoWindowAdapter {

    //private final View mWindow;
    private Context mContext;

    public CustomWindowAdapter(Context context) {
        mContext = context;
        //mWindow = LayoutInflater.from(context).inflate(R.layout.custom_info_window, null);
    }

    private void rendowWindowText(Marker marker, View view){

        String title = marker.getTitle();
        TextView tvTitle = (TextView) view.findViewById(R.id.title);

        if(!title.equals("")){
            tvTitle.setText(title);
        }

        String snippet = marker.getSnippet();
        TextView tvSnippet = (TextView) view.findViewById(R.id.snippet);

        if(!snippet.equals("")){
            tvSnippet.setText(snippet);
        }
    }

    @Override
    public View getInfoWindow(Marker marker) {
        //rendowWindowText(marker, mWindow);
        //return mWindow;
        return null; // TODO : remove this line
    }

    @Override
    public View getInfoContents(Marker marker) {
        //rendowWindowText(marker, mWindow);
        //return mWindow;
        return null; // TODO : remove this line
    }
}