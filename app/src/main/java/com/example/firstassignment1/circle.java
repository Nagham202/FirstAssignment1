package com.example.firstassignment1;

public class circle {
    private double radius;

    public circle() {

    }

    public double areaCircle(double radius){
        double result=(Math.PI)*(Math.pow(radius,2));
        return  result;


    }
    public String areadetails(double radius){

        return "*) Area of a circle = PI x radius x radius.\n\n                   = PI x "+radius+" x "+radius+"\n\n                   = "+((Math.PI)*(Math.pow(radius,2)))+"\n\n *) measured in units (m^2).";

    }
    public double circumferenceCircle(double radius){
        double result=2*(Math.PI)*radius;
        return  result;


    }
    public String circumferencedetails(double radius){

        return "*) Circumference of a circle = 2 x PI x radius.\n\n                   = 2 x PI x "+radius+"\n\n                   = "+(2*(Math.PI)*radius)+"\n\n *) measured in units (m).";

    }
}
