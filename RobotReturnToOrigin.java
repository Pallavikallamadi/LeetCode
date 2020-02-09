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
public class RobotReturnToOrigin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "URDL";
        int x=0,y=0;
        
        for(char c:s.toCharArray())
        {
          if(c=='U')
              y--;
          else if(c == 'D')
              y++;
          else if(c == 'R')
              x++;
          else if(c == 'L')
              x--;
        }
        if(x==0 && y==0)
            System.out.println("True");
        else
            System.out.println("False");
    }
    
}
