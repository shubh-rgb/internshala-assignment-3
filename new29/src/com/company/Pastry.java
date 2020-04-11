package com.company;

import java.util.List;

public class Pastry extends Cake {
    public static String pastryName;
    public static float pastryPrice;
    public static void display (List<String> list, List<Float> price) {
        for (int i=0;i<2;i++)
        System.out.println(list.get(i)+" : \u20B9"+price.get(i)+" per piece");
    }
}
