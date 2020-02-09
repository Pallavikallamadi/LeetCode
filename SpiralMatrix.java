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
public class SpiralMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix = {{1, 2 },{3, 4}};
        List<Integer> outPut = new ArrayList<>();
        
        //if(matrix.length == 0)
            //return outPut;
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        
        int colBegin = 0;
        int colEnd = matrix[0].length-1;
        
        while(rowBegin<=rowEnd && colBegin<=colEnd)
        {
            for(int i=colBegin;i<=colEnd;i++)
            {
                outPut.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            
            for(int i=rowBegin;i<=rowEnd;i++)
            {
                outPut.add(matrix[i][colEnd]);
            }
            colEnd--;
            
            for(int i=colEnd-1;i>=colBegin;i--)
            {
                outPut.add(matrix[rowEnd-1][i]);
            }
            rowEnd--;
            
            for(int i=rowEnd-1;i>=rowBegin;i--)
            {
                outPut.add(matrix[i][colBegin]);
            }
            colBegin++;
                        
        }
        System.out.println(outPut);
        //return outPut;
    }
    
    
}
