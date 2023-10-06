package com.pluralsight;

import java.util.*;


public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        double price = 0;

        System.out.println("  What size sandwich would you like?  ");
        System.out.println("  1: Regular: Base price $5.45");
        System.out.println("  2: Large: Base price $8.45");
        System.out.print(" Choose your size:");

        int sandwichsize = myScanner.nextInt();

        if (sandwichsize == 1){
            price = 5.45;
        }else if (sandwichsize == 2){
            price = 8.95;
        }



    }





}




