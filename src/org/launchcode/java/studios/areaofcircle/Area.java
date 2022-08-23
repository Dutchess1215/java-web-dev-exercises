package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;

import static java.lang.Double.*;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer loop = 0;
        String radiusSt;
        Double radius = 0.0;
        while(loop == 0 ) {
            System.out.println("If you enter a radius, I'll tell you an area of a circle: ");
            radiusSt = input.nextLine();
            if (radiusSt == ""){
                System.out.println("that is nothing");
            } else {
                radius = parseDouble(radiusSt);
//                System.out.println(".." + radius);
            }
            if (radius < 0){
                System.out.println("no negatives");
            }
//            if (radius.isNaN()){
//                System.out.println("that is not a number");
//            }
            if(radius>0){
                loop++;
            }

        }
        System.out.println(Circle.getArea(radius));
    }
}
