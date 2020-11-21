package study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner mult = new Scanner(System.in );
        GalToLit set = new GalToLit();

        System.out.println ("Write gallons: " );
        set.gallons = mult.nextDouble();


        System.out.println (set.gallons + " * 3.7854 liters");

        System.out.println ("Result is : " + set.gallons * set.liters);

    }
}
