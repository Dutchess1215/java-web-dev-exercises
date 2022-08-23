package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;

import static java.lang.Double.*;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer loop = 0;
        Double radius = 0.0;

        while(loop == 0 ) {
            System.out.println("If you enter a radius, I'll tell you an area of a circle: ");

            try{
                radius = input.nextDouble();
                if (radius < 0){
                    System.err.println("no negatives");
                } else if(radius>0){
                    loop++;
                }

            } catch (Exception error) {
            System.err.println("that's not a number");
            loop++;
            }




        }
        System.out.println(Circle.getArea(radius));
    }
}
