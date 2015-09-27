/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yogesh
 */
public class Hw2p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int start =Integer.parseInt(args[0]); //accept start year
        int end= Integer.parseInt(args[1]); // accept end year
        
        System.out.println("Leap Years in ["+start+","+end+"]:");
        
        for(int i=start; i<=end;i++)
        {
            if(i%400==0) // check if its a leap century
            {
                System.out.println(i);
            }
            if(i%4==0&&i%100!=0) //check if its a leap year
            {
                System.out.println(i);
            }
        }
    }
    
}
