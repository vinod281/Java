
package com.mycompany.shape_obj;

public class Shape_Obj 
{

    public static void main(String[] args) 
    {
        Circle c1=new Circle(7.00f);
        System.out.println("Circle Area : "+c1.calculateArea());
        System.out.println("Circle perimeter : "+c1.calculatePerimeter());
        
        Rectangle r1=new Rectangle(10.00f,7.00f);
        System.out.println("Rectangle Area : "+r1.calculateArea());
        System.out.println("Rectangle Perimeter : "+r1.calculatePerimeter());
        
        Triangle t1=new Triangle(5.00f,3.00f,2.00f,4.00f);
        System.out.println("Triangle Area : "+t1.calculateArea());
        System.out.println("Triangle Perimeter : "+t1.calculatePerimeter());
        
    }
}
