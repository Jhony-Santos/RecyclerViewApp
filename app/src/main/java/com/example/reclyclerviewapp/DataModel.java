package com.example.reclyclerviewapp;
import java.util.ArrayList;


public class DataModel {
    private static DataModel instance;
    private DataModel(){
        productArray.add(new Product("mouse",100,true));
        productArray.add(new Product("monitor",200,true));
        productArray.add(new Product("teclado",250,true));
        productArray.add(new Product("CPU",4000, false));



    }
    public static DataModel getInstance(){
        return instance;
    }
    ArrayList<Product> productArray=new ArrayList<>();




}
