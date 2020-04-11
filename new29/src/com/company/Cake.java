package com.company;

import java.util.List;

public class Cake {
    private static String cakeName;
    private static float cakePrice;

    List<String> list = null;
    List<Float>  price = null;

    public List<String> getCakeName() {     //getter for cakeName
        return list;
    }
    public void setCakeName(List<String> list) {     //Setter for cakeName
        this.list = list;
    }

    public List<Float> getCakePrice() {      //getter for cakePrice
        return price;
    }
    public void setCakePrice(List<Float> price) {      // setter for cakePrice
        this.price = price;
    }
    //define a display method

    public static void display(List<String> list,List<Float> price){
        for (int i=0;i<2;i++)
        System.out.println(list.get(i) +" : \u20B9"+price.get(i)+" per pound");

    }

}
