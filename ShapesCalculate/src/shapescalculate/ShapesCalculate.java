/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapescalculate;
import java.util.Scanner;
public class ShapesCalculate {

    private static final Scanner scanner = new Scanner(System.in);
    public static double calculaterectperi(double length, double width){
        return 2*(length + width);
    }
    public static double calculaterectarea(double length, double width){
        return length*width;
    }
    public static double calculatecirclecircum(double radius){
        return 2*Math.PI*radius;
    }
    public static double calculatecirclearea(double radius){
        return Math.PI*Math.pow(radius, 2);
    }
    public static double calculatesqperi(int side){
        return 4*side;
    }
    public static double calculatesqarea(int side){
        return Math.pow(side, 2);
    }
    public static void main(String[] args) {
        System.out.print("Give the length and breadth of rectangle: ");
        double lengthrect = scanner.nextDouble();
        double widthrect = scanner.nextDouble();
        double rectperimeter = calculaterectperi(lengthrect, widthrect);
        System.out.println("Perimeter of rectangle: " + rectperimeter);
        double rectarea = calculaterectarea(lengthrect, widthrect);
        System.out.println("Area of rectangle: " + rectarea);
        System.out.print("Give radius of circle: ");
        double radiuscircle = scanner.nextDouble();
        double circlecircum = calculatecirclecircum(radiuscircle);
        System.out.println("Circumference of circle: " + circlecircum);
        double circlearea = calculatecirclearea(radiuscircle);
        System.out.println("Area of circle: " + circlearea);
        System.out.println("Give side of square: ");
        int sidesquare = scanner.nextInt();
        double squareperimeter = calculatesqperi(sidesquare);
        System.out.println("Perimeter of square: " + squareperimeter);
        double squarearea = calculatesqarea(sidesquare);
        System.out.println("Area of square: " + squarearea);
    }
    
}
