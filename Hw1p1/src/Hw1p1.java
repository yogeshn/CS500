/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yogesh
 */
public class Hw1p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1 = Integer.parseInt(args[0]); // Accept Integer from commandline argument and stores it in varible number1
        int number2 = Integer.parseInt(args[1]); // Accept Integer from commandline argument and stores it in varible number2

        int product = number1*number2; // product of two numbers is stored in variable named product
        
        System.out.println("product is "+product); //prints product 
    }

}
