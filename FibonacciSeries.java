/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GS;

/**
 *
 * @author 16153
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 9; 
        for(int i=0;i<n;i++)
        {
        System.out.println(fib(i)); 
        }
    }
    
}
