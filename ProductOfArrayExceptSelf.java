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
public class ProductOfArrayExceptSelf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {1,2,3,4};
        int[] numsRes = new int[nums.length];
        /*for(int i=0;i<nums.length;i++)
        {
           int prod = 1;
           for(int j=0;j<nums.length;j++)
           {
              if(j!=i)
              {
                 prod *= nums[j];
              }
           }
           numsRes[i] = prod;
        }
        
        for(int k=0;k<numsRes.length;k++)
        {
            System.out.print(numsRes[k] + "  ");
        }*/
        
        int len = nums.length;
    }
    
}
