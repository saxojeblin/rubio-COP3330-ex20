/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        double tax, order, total;
        String state, county;

        System.out.print("What is the order amount? ");
        order = input.nextDouble();
        System.out.print("What state do you live in? ");
        state = input.next();

        if (state.equals("Wisconsin")) {

            System.out.print("What county do you live in? ");
            county = input.next();

            if(county.equals("Eau Claire")) {
                tax = 0.10 * order;
                total = order + tax;
            }
            else if (county.equals("Dunn"))  {
                tax = 0.09 * order;
                total = order + tax;
            }
            else {
                tax = 0.05 * order;
                total = order + tax;
            }
        }
        else if (state.equals("Illinois")) {
            tax = 0.08 * order;
            total = order + tax;
        }
        else {
            tax = 0;
            total = order;
        }

        System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", tax, total);

    }
}
