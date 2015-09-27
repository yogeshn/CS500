/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yogesh
 */
public class Hw1p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1 = Integer.parseInt(args[0]); //first number from commandline argument
        int number2 = Integer.parseInt(args[1]); //second number from commandline argument
        
         System.out.println("First commandline argument is "+number1);
         System.out.println("Second commandline argument is "+number2);
         
         if(number1 % number2 ==0) 
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
    
}
