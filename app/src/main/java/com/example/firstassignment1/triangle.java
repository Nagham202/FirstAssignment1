package com.example.firstassignment1;

public class triangle {

    private double lenght;
    private double height;
    private double weight;

    private String details;

    public double areaTriangle(double lenght,double height){
        double result=0.5*lenght*height;
        return  result;


    }
    public String areadetails(double lenght,double height){

        return "*) Area of a triangle = 0.5 x lenght x height.\n\n                   = 0.5 x "+lenght+" x "+height+"\n\n                   = "+(0.5*lenght*height)+"\n\n *) measured in units (m^2).";

    }
    public double circumferenceTriangle(double lenght,double weight,double height){
        double result=lenght+weight+height;
        return  result;


    }
    public String circumferencedetails(double lenght,double weight,double height){
        double result=lenght+weight+height;

        return "*) Circumference of a triangle = lenght + weight + height.\n\n                   = "+lenght+" + "+weight+" + "+height+" .\n\n                   = "+result+"\n\n *) measured in units (3m).";

    }
}
