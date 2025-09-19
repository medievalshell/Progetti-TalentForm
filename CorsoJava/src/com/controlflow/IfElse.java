package com.controlflow;

import java.time.LocalDate;

public class IfElse {


    public static void main(String[] args) {

        int a = 50;
        int b = 30;
        int c = 10;
        int s = 20;
        boolean m = a < b ? true : false;

        if (a < b && c == s) {

            System.out.println("OK");
            String nome = LocalDate.now().toString();

        } else if (a > b || s < c) {

            System.out.println("Failed");

        } else if (c > s) {

            System.out.println("OK");
        } else if (s > a) {

            System.out.println("OK");
        }
        
        
        
          if (a>b&&c<s) {
        	  
        	    System.out.println(true);
        	  
          } else {
        	  
        	  
        	    System.out.println(false);
        	  
          }
          
          
          int x = 35;
          int v = 22;
          int y = 10;
          int f = 15;
          
          
          
          if (x<v||y>f) {
        	  
        	  System.out.println("OK");
        	  
        	  
          } else {
        	  
        	  System.out.println("ERRATO");
        	  
        	  
        	   
        	  
          }
          
          
          
          
          
          
          
        
        

    }


}

