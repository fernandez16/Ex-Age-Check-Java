package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter your name:");
        String name = sc.nextLine();

        System.out.println( "Enter your age:");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println( name + " can drink");
        }
        if (age < 18) {
            System.out.println(  name +  " cannot drink");
        }

    }
}
