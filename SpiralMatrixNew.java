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
public class SpiralMatrixNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, rowBegin = 0, colBegin = 0; 
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}}; 
        int rowEnd=matrix.length;
        int colEnd=matrix[0].length;
        while (rowBegin < rowEnd && colBegin < colEnd) { 
            // Print the first row from the remaining rows 
            for (i = colBegin; i < colEnd; ++i) { 
                System.out.print(matrix[rowBegin][i] + " "); 
            } 
            rowBegin++; 
  
            // Print the last column from the remaining columns 
            for (i = rowBegin; i < rowEnd; ++i) { 
                System.out.print(matrix[i][colEnd - 1] + " "); 
            } 
            colEnd--; 
  
            // Print the last row from the remaining rows */ 
            if (rowBegin < rowEnd) { 
                for (i = colEnd - 1; i >= colBegin; --i) { 
                    System.out.print(matrix[rowEnd - 1][i] + " "); 
                } 
                rowEnd--; 
            } 
  
            // Print the first column from the remaining columns */ 
            if (colBegin < colEnd) { 
                for (i = rowEnd - 1; i >= rowBegin; --i) { 
                    System.out.print(matrix[i][colBegin] + " "); 
                } 
                colBegin++; 
            } 
        } 
    }
    
}
