package com.example.firstassignment1;

public class circle extends shape{
    private double radius=0;

    public circle() {

    }

    public circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getarea(){
        double result=(Math.PI)*(Math.pow(radius,2));
        return  result;


    }

    @Override
    public double getperimeter(){
        double result=2*(Math.PI)*radius;
        return  result;


    }

    @Override
    public String getareadetails() {
        return "*) Area of a circle = \nPI x radius x radius.\n\n  = PI x "+radius+" x "+radius+"\n\n  = "+((Math.PI)*(Math.pow(radius,2)))+"\n\n *) measured in units (m^2).";
    }


    @Override
    public String getperimeterdetails(){

        return "*) Perimeter of a circle = \n2 x PI x radius.\n\n  = 2 x PI x "+radius+"\n\n  = "+(2*(Math.PI)*radius)+"\n\n *) measured in units (m).";

    }

}
