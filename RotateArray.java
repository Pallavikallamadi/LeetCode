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
public class RotateArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        
        //Method 1
        /*
        for(int i=0;i<k;i++)
        {
            int temp = nums[0];
            nums[0] = nums[nums.length-1];
            for(int j=1;j<nums.length;j++)
            {
                int anoTemp = nums[j];
                nums[j] = temp;
                temp = anoTemp;
                
            }
        }
        */
        
        for(int i=0;i<nums.length;i++)
        {
           int position = i+k;
           if(position>=nums.length)
           {
              position = i-k-1;
           }
           
           int temp = nums[position];
           nums[position] = nums[i];
           nums[i] = temp;
        }
        
        
        
        for(int h:nums)
        {
            System.out.print(h+"  ");
        }
    }
    
}
