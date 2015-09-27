/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yogesh
 */
public class Hw4p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "";

        for (int i = 0; i < args.length; i++) {
            str = str + (args[i] + " "); //put all arguments from command line in a single string

        }

        /* from string str split each word and insert it into a string array
         space is used as delimiter */
        String[] temp = str.split(" ");

        if (temp[0].equals("i") && temp[1].equals("am")) // check if first element is i and second is am  
        {
            for (int j = 2; j < temp.length; j++) {
                System.out.print(temp[j] + " "); // print remaining words from string array
            }
            System.out.print(temp[0] + " " + temp[1]); //print first two words
            System.out.println();
        } else if (temp[0].equals("this") && temp[1].equals("is")) // check if first element is "this" and second is "is"
        {
            for (int j = 2; j < temp.length; j++) {
                System.out.print(temp[j] + " "); // print remaining words from string array
            }
            System.out.print(temp[0] + " " + temp[1]); //print first two words
            System.out.println();
        } else {
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j] + " "); //print string as it is if condition fails
            }

        }
    }

}
