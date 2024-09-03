package com.ltrsoft.andromotapp.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
/*
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;*/
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.Series;
import com.ltrsoft.andromotapp.R;

import org.checkerframework.checker.units.qual.K;

public class NPK_Water_Detail extends Fragment {
    private float Nvalue,Pvalue,Kvalue,Watervalue;

    public NPK_Water_Detail() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.npk_water_detail, container, false);

        // Find the GraphView by ID
        GraphView graph = view.findViewById(R.id.graph);

        Nvalue = 2f;
        Pvalue = 5f;
        Kvalue = 3f;
        Watervalue = 7f;
        // Create a BarGraphSeries for each type
        BarGraphSeries<DataPoint> seriesN = createSeries(new DataPoint(1, Nvalue), Color.BLUE);
        BarGraphSeries<DataPoint> seriesP = createSeries(new DataPoint(2, Pvalue), Color.GREEN);
        BarGraphSeries<DataPoint> seriesK = createSeries(new DataPoint(3, Kvalue), Color.RED);
        BarGraphSeries<DataPoint> seriesWater = createSeries(new DataPoint(4, Watervalue), Color.CYAN);

        // Add all series to the graph
        graph.addSeries(seriesN);
        graph.addSeries(seriesP);
        graph.addSeries(seriesK);
        graph.addSeries(seriesWater);

        // Set manual X bounds
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(5);

        // Set manual Y bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(0);
        graph.getViewport().setMaxY(10);


        return view;
    }

    // Method to create a series with a given color and DataPoint
    private BarGraphSeries<DataPoint> createSeries(DataPoint dataPoint, int color) {
        BarGraphSeries<DataPoint> series = new BarGraphSeries<>(new DataPoint[]{dataPoint});
        series.setColor(color);
        series.setSpacing(70); // Space between the bars
        series.setDrawValuesOnTop(true); // Draw values on top of bars
        series.setValuesOnTopColor(Color.WHITE); // Values color
        series.setDataWidth(20);



        return series;
    }


}