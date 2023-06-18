package com.example.firstassignment1;

public class rectangle extends shape {

    private double lenght=0;
    private double width=0;

    private String details;

    public rectangle(double length, double width) {
        this.lenght = length;
        this.width = width;
    }

    public rectangle() {

    }

    @Override
    public double getarea() {
        double result = lenght * width;
        return result;
    }

    @Override
    public String getareadetails() {

        return "*) Area of a rectangle = \nlenght x weight.\n\n  = " + lenght + " x " + width + "\n\n  = " + (lenght * width) + "\n\n *) measured in units (m^2).";

    }

    @Override

    public double getperimeter() {
        double result = (2 * lenght) + (2 * width);
        return result;


    }

    @Override
    public String getperimeterdetails() {
        double result = (2 * lenght) + (2 * width);

        return "*) Perimeter of a rectangle = \n(2 x lenght) + (2 x weight).\n\n  = ( 2 x " + lenght + " ) + (2 x " + width + " ).\n\n  = " + result + "\n\n *) measured in units (2m).";

    }
}
