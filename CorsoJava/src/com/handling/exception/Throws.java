package com.handling.exception;

public class Throws {
	
	  public boolean compareDayMonth(int january, int may) throws Exception {
	        if (january == may || may == january) {
	            return true;
	        } else {

	            throw new Exception("values not equals");
	        }

	    }

	    public static void main(String[] args) {
	          Throws less = new Throws();
	        try {
	            less.compareDayMonth(23, 15);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

}
