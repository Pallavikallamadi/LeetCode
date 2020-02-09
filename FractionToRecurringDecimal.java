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
import java.util.*;
public class FractionToRecurringDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerator = 10;
        int denominator = 30;
        if (numerator == 0) {
                System.out.println(0);
             }
    StringBuilder fraction = new StringBuilder();
    // If either one is negative (not both)
    if (numerator < 0 ^ denominator < 0) {
        fraction.append("-");
    }
    // Convert to Long or else abs(-2147483648) overflows
    long dividend = Math.abs(numerator);
    long divisor = Math.abs(denominator);
    fraction.append(String.valueOf(dividend / divisor));
    
    
        System.out.println(fraction.toString());
   /* long remainder = dividend % divisor;
    if (remainder == 0) {
        System.out.println(fraction.toString());
    }
    fraction.append(".");
    Map<Long, Integer> map = new HashMap<>();
    while (remainder != 0) {
        if (map.containsKey(remainder)) {
            fraction.insert(map.get(remainder), "(");
            fraction.append(")");
            break;
        }
        map.put(remainder, fraction.length());
        remainder *= 10;
        fraction.append(String.valueOf(remainder / divisor));
        remainder %= divisor;
    }
        System.out.println(fraction.toString());*/
    }
           
    
}
