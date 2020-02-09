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
public class GameOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
         int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
      
        for(int i=0;i<board.length;i++)
        {
            
            for(int j=0;j<board[i].length;j++)
            {
                int elem = 0;
                int  neighbours = 0;
                if(board[i][j] == 2)
                   elem = 0;
                else if(board[i][j] == -1)
                    elem = 1;
                else
                    elem = board[i][j];
                
                
                if(!(i-1<0 || j-1<0)) 
                {
                    if(board[i-1][j-1] > 1)
                        neighbours += 0;
                    else if(board[i-1][j-1] < 0)
                        neighbours += 1;
                    else
                        neighbours += board[i-1][j-1];
                }
                
                if(!(i-1<0))
                {
                    if(board[i-1][j] > 1)
                        neighbours += 0;
                        
                    else if(board[i-1][j] < 0)
                        neighbours += 1;
                       
                    else
                        neighbours += board[i-1][j];
                }
             
                if(!(i-1<0 || j+1>board[i].length-1))
                 {
                    if(board[i-1][j+1] == 2)
                        neighbours += 0;
                    else if(board[i-1][j+1] == -1)
                        neighbours += 1;
                    else
                        neighbours += board[i-1][j+1];
                }
                 
                if(!(j+1>board[i].length-1))
                {
                    if(board[i][j+1] == 2)
                        neighbours += 0;
                    else if(board[i][j+1] == -1)
                        neighbours += 1;
                    else
                        neighbours += board[i][j+1];
                }
                 
                if(!(i+1>board.length-1 || j+1>board[i].length-1))
                {
                    if(board[i+1][j+1] == 2)
                        neighbours += 0;
                    else if(board[i+1][j+1] == -1)
                        neighbours += 1;
                    else
                        neighbours += board[i+1][j+1];
                }
                 
                if(!(i+1>board.length-1))
                {
                    if(board[i+1][j] == 2)
                        neighbours += 0;
                    else if(board[i+1][j] == -1)
                        neighbours += 1;
                    else
                        neighbours += board[i+1][j];
                }
                 
                if(!(i+1>board.length-1 || j-1<0))
                {
                    if(board[i+1][j-1] == 2)
                        neighbours += 0;
                    else if(board[i+1][j-1] == -1)
                        neighbours += 1;
                    else
                        neighbours += board[i+1][j-1];
                }
               
                if(!(j-1<0))
                {
                    if(board[i][j-1] == 2)
                        neighbours += 0;
                    else if(board[i][j-1] == -1)
                        neighbours += 1;
                    else
                        neighbours += board[i][j-1];
                }
             
                if((elem == 1 ) && (neighbours<2 || neighbours>3))
                    board[i][j] = -1;
                
                if((elem == 0 && neighbours==3))
                    board[i][j] = 2;  
            }
        }
        
        for(int i=0;i<board.length;i++)
        {
           for(int j=0;j<board[i].length;j++)
           {
               System.out.print(board[i][j] + "  ");
           }
            System.out.println("");
        }
                
         
 
    }
}
