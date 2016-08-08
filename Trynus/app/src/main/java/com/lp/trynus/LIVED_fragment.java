package com.lp.trynus;

/**
 * Created by root on 3/28/16.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.GridView;

/**
 * A placeholder fragment containing a simple view.
 */
public class LIVED_fragment extends Fragment {

    private GridView grid;

    public LIVED_fragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lived_fragment, container, false);

        grid = (GridView) rootView.findViewById(R.id.gridview);
        grid.setAdapter(new GridAdapter(getActivity()));
        return rootView;
    }
    
}