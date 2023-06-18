package com.example.firstassignment1;

public class triangle extends shape {

    private double lenght=0;
    private double height=0;
    private double Width=0;

    private String details;

    public triangle(double lenght, double height, double Width) {
        this.lenght = lenght;
        this.height = height;
        this.Width = Width;
    }
    public triangle(double lenght, double height) {
        this.lenght = lenght;
        this.height = height;
    }
    public triangle() {
        this.lenght = lenght;
        this.height = height;
        this.Width = Width;
    }
    @Override
    public double getarea(){
        double result=0.5*lenght*height;
        return  result;


    }
    @Override
    public String getareadetails(){

        return "*) Area of a triangle = \n0.5 x lenght x height.\n\n  = 0.5 x "+lenght+" x "+height+"\n\n  = "+(0.5*lenght*height)+"\n\n *) measured in units (m^2).";

    }
    @Override

    public double getperimeter(){
        double result=lenght+Width+height;
        return  result;


    }
    @Override
    public String getperimeterdetails(){
        double result=lenght+Width+height;

        return "*) Perimeter of a triangle = \nlenght + weight + height.\n\n  = "+lenght+" + "+Width+" + "+height+" .\n\n  = "+result+"\n\n *) measured in units (3m).";

    }
}
