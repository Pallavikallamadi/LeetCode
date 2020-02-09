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
public class PowerOfThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 81;
        while(num%3==0)
        {
           num=num/3;
        }
        
        if(num == 1)
            System.out.println("True");
        else
            System.out.println("False");
        
        //Method 2
        String base = Integer.toString(num,3);
        
        boolean res = base.matches("^10*$");
        
        System.out.println(res);
    }
    
}
