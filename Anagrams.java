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
public class Anagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anag = new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
           List<String> myList = new ArrayList<>();
           if(!myList.contains(strs[i]))
                myList.add(strs[i]);
           for(int j=i;j<strs.length;j++)
           {
             
           }
           
        }
    }
    
}
