package com.example.firstassignment1;

public class square {
    private double lenght;
    private String details;

    public double areaSquare(double lenght){
        double result=lenght*lenght;
        return  result;


    }
    public String areadetails(double lenght){

        return "*) Area of a square = lenght x lenght.\n\n                   = "+lenght+" x "+lenght+"\n\n                   = "+(lenght*lenght)+"\n\n *) measured in units (m^2).";

    }
    public double circumferenceSquare(double lenght){
        double result=4*lenght;
        return  result;


    }
    public String circumferencedetails(double lenght){

        return "*) Circumference of a square = 4 x lenght.\n\n                   = 4 x "+lenght+"\n\n                   = "+(4*lenght)+"\n\n *) measured in units (m).";

    }

}
