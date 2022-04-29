/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaapp;

/**
 *
 * @author eduar
 */
import java.util.Scanner;

public class JavaApp {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       int user_age;
       int year;
       String address = "";
       String name = "";
       
       System.out.println ("Enter your age: ");
       user_age = scanner.nextInt();
       System.out.println("Enter your year currently living in: ");
       year = scanner.nextInt();
       System.out.println ("Enter your address");
       address = scanner.next();
       System.out.println("Enter your name: ");
       name = scanner.next();
       
       for (int i=0; i<=year; i++) {
        System.out.println("You are in the year: " + i);
        for (int j=0; j<=user_age; j++)
            System.out.println(j);
         System.out.println(user_age);
        
        
              /*
        Still not finished yet but going on
        */
       }
        
       
           
               
        
     
        
      
        }
    }
    
}

