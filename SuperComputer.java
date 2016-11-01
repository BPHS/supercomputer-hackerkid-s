/**
* This is the start of a supercomputer
* 
* Author: Arsenal
* Date Halloween, 2016
* 
* 
*/

public class SuperComputer {
    
    public static void main(String [] args) {
        
        int x = 5;
        
        System.out.println("x == " + x );
        
        x++; // Adds 1 to x
        System.out.println("x == " + x);
        
        x--; // subtracts 1 from x
        System.out.println("x == " + x);
        
        x =+ 5; //Equilivant to x = x + 5
        System.out.println("x == " + x);
        
        // loop to count to 10 by 1's
        // Syntax: for (start;max/min;count_by) {
            //code repeat
        // }
        
        for (int i = 0; i <= 10000; i += 5) {
            System.out.println( i + " ");
        }
        
        System.out.println();
        
        // Count down from 100 to 0
        for (int i = 100; i >= 0; i -- ) {
            System.out.println(i + " ");
        }
        
    }
}