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
public class PascalsTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numRows = 5;
        List<List<Integer>> myList = new ArrayList<List<Integer>>();
        
        List<Integer> innerList = new ArrayList<Integer>();
        innerList.add(1);
        myList.add(innerList);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> newInner = new ArrayList<Integer>();
            newInner.add(1);
            List<Integer> prev = myList.get(i-1);
            for(int j=1;j<i;j++)
            {
              newInner.add(prev.get(j)+prev.get(j-1));
            }
            
            newInner.add(1); 
            myList.add(newInner);
           
        }
        
        System.out.println(myList);
    }
    
}
