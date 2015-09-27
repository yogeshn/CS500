/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yogesh
 */
public class Hw4p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "";

       for (int i = 0; i < args.length; i++) {
            str = (args[i] + " "); // put all words from commandline argument to a string
            
        }
        System.out.println();
        for (int j = str.length(); j >= 0; j--) // iterate loop from last element of string
        {
            str = (args[j] + " ");
            System.out.print(str); //print elements strating from last

        }
    }

}
