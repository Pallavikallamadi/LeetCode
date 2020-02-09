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
public class MoveZeroes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {1,0,14};
        int first = 0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]!=0)
           {
               int temp = nums[i];
               nums[i] = nums[first];
               nums[first] = temp;
               first++;
               //System.out.println(first);
           }
           
        }
        
        for(int i:nums)
        {
            System.out.print(i + "  ");
        }
        System.out.println("");
    }
    
    
}
