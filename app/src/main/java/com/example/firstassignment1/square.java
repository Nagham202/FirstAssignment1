package com.example.firstassignment1;

public class square  extends shape{
    private double lenght=0;
    private String details;

    public square(double lenght) {
        this.lenght = lenght;
    }
    public square() {
    }
    @Override
    public double getarea(){
        double result=lenght*lenght;
        return  result;


    }
    @Override

    public String getareadetails(){

        return "*) Area of a square = \nlenght x lenght.\n\n  = "+lenght+" x "+lenght+"\n\n  = "+(lenght*lenght)+"\n\n *) measured in units (m^2).";

    }
    @Override

    public double getperimeter(){
        double result=4*lenght;
        return  result;


    }
    @Override

    public String getperimeterdetails(){

        return "*) Perimeter of a square = \n4 x lenght.\n\n  = 4 x "+lenght+"\n\n  = "+(4*lenght)+"\n\n *) measured in units (m).";

    }

}
