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
public class BuyAndSell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] prices = {7,1,5,3,6,4};
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        //Method 1
        int profit = 0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
               if(prices[i]<prices[j] && prices[j]-prices[i]>profit)
                   profit = prices[j]-prices[i];
            }
        }
        System.out.println(profit);
        //Method 2
        for(int i=0;i<prices.length;i++)
        {
           if(prices[i]<min)
               min = prices[i];
           else if(prices[i]-min>max)
               max = prices[i]-min;
               
        }
        System.out.println(max);
    }
    
}
