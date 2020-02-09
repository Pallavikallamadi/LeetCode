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
public class MinimumSizeSubArraySum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 7;
        int[] arr = {2,3,1,2,4,3};
        int subArrayLength = Integer.MAX_VALUE;
        int checkSum = 0,left = 0;
        for(int i=0;i<arr.length;i++)
        {
           checkSum+=arr[i];
           
           while(checkSum>=sum)
           {
              subArrayLength = Math.min(subArrayLength,i+1-left);
              checkSum-=arr[left];
              left++;
           }
           
        }
        
        System.out.println(subArrayLength!=Integer.MAX_VALUE?subArrayLength:0);
    }
    
}
