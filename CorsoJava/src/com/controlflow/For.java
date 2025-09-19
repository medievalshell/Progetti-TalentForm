package com.controlflow;

public class For {
	
	 public static void main(String[] args) {


	        for (int i = 0; i < 20; i=i+2) {

	            if (i == 6) {

	                continue;

	            }

	            System.out.println(i);

	        }
	        
	        
	        
	        
	        for (int index = 1; index<20; index =index+3) {
	        	
	        	
	            System.out.println(index);
	        	
	        	
	        	
	        }
	        
	        
        
	        
	        for (int code = 100; code>20; code =code-10) {
	        	
	        	   if (code == 60) {

		                continue;

		            }
	        	
	        	
	            System.out.println(code);
	        	
	        	
	        	
	        }
	        
	        
	    }

}
