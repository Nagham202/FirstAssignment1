package com.example.firstassignment1;

public class rectangle {

    private double lenght;
    private double weight;

    private String details;

    public double areaRectangle(double lenght,double weight){
        double result=lenght*weight;
        return  result;


    }
    public String areadetails(double lenght, double weight){

        return "*) Area of a rectangle = lenght x weight.\n\n                   = "+lenght+" x "+weight+"\n\n                   = "+(lenght*weight)+"\n\n *) measured in units (m^2).";

    }
    public double circumferenceRectangle(double lenght,double weight){
        double result=(2*lenght)+(2*weight);
        return  result;


    }
    public String circumferencedetails(double lenght,double weight){
        double result=(2*lenght)+(2*weight);

        return "*) Circumference of a rectangle = (2 x lenght) + (2 x weight).\n\n                   = ( 2 x "+lenght+" ) + (2 x "+weight+" ).\n\n                   = "+result+"\n\n *) measured in units (2m).";

    }
}
