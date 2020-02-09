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
public class HighFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<Integer,HashMap<Integer,Integer>> myMap = new HashMap<>();
        
        int[][] data = {{1,91},{2,93},{2,9},{1,60},{2,77}};
        for(int i=0;i<data.length;i++)
        {
               if(myMap.containsKey(data[i][0]))
               {
                  //int prevSum = myMap.get(data[i][0]);
                  int curSum = data[i][1];
                  //int avg = curSum+prevSum/2;
                  //myMap.remove(data[i][0]);
                  //myMap.put(data[i][0], curSum+prevSum);
               }
               //else
                  //myMap.put(data[i][0], data[i][1]); 
        }
        
        System.out.println(myMap);
        
    }
    
}
