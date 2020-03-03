package com.example.flooringapp;

import android.widget.TextView;

public class FloorTileCalculator {

    private Double Width = 0.0;
    private Double Length = 0.0;

    public FloorTileCalculator() {

    }

    public Double getWidth() {
        return Width;
    }

    public void setWidth(Double width) {
        Width = width;
    }

    public Double getLength() {
        return Length;
    }

    public void setLength(Double length) {
        Length = length;
    }

    public Double tileCalculate(String sentWidth, String sentLength) {

        return Length * Width;

    }


}
