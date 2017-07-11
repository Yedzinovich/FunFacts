package com.example.inna.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Inna on 7/10/2017.
 */

public class ColorWheel {

    private String [] mColors ={"#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7" };

    public int getColor(){

        String color;
        //Randomly select a fact
        Random random=new Random();
        int ran=random.nextInt(mColors.length);
        color= mColors[ran];
        int colorInt= Color.parseColor(color);

        return colorInt;
    }
}
