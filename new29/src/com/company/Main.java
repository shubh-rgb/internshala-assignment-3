package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //for cake name
        List<String> cakeName = new ArrayList<String>();
        Cake change = new Cake();
        cakeName.add("Chocolate Brownie");
        cakeName.add("Chocolate Maple");
        change.setCakeName(cakeName);

        //for cake price
        List<Float> cakePrice = new ArrayList<Float>();
        cakePrice.add(250.0F);
        cakePrice.add(300.0F);
        change.setCakePrice(cakePrice);

        //for pastry name
        List<String> pastryName = new ArrayList<String>();
        Pastry change2 = new Pastry();
        pastryName.add("Black Forest");
        pastryName.add("Choco Truffle");
        change2.setCakeName(pastryName);

        //for pastry price
        List<Float> pastryPrice = new ArrayList<Float>();
        pastryPrice.add(35F);
        pastryPrice.add(40F);
        change2.setCakePrice(pastryPrice);

        System.out.println("\n         Today's Special Menu");
        System.out.println("--------------------------------------");
        System.out.println("Special Cakes");
        System.out.println("--------------------------------------");

        for (int i=0;i<1;i++) {
            Cake.display(cakeName, cakePrice);
        }
        System.out.println("\nSpecial Pastry");
        System.out.println("--------------------------------------");

        for (int i=0;i<1;i++) {
            Pastry.display(pastryName, pastryPrice);
        }
    }
}