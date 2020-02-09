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
import java.util.Map;
import java.util.HashMap;
public class TwoSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = {2,7,11,15};
        int target = 9;
        //Method 1
        for(int i=0;i<nums.length;i++)
        {
           int diff = target-nums[i];
           for(int j=i+1;j<nums.length;j++)
           {
              if(nums[j] == diff)
                   System.out.println(i+"--"+j);
           }
        }
        
        //Method 2
        Map<Integer,Integer> myData = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
          int rem = target - nums[i];
          if(myData.containsKey(rem) && myData.get(rem)!=i)
          {
              System.out.println(i+"-"+myData.get(rem));
          }
          myData.put(nums[i],i);
        }
        
        
    }
    
}
