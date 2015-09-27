/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yogesh
 */
public class Hw4p4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int small = 0,sum=0;
        int[] no = new int[args.length]; //declare array 
        for (int i = 0; i < args.length; i++) {
            no[i] = Integer.parseInt(args[i]); // initialize array from commandline arguments
        }
        small = no[0]; // consider first number as smallest
        for (int j = 0; j < no.length; j++) {

            if (small > no[j]) //compare first number with all other number in array 
            {
                small = no[j]; // if we find smaller number than first number then replace it as small
            }
        }

        System.out.println("Minimum value is "+small);
        
        for (int j = 0; j < no.length; j++) {
            int sub=no[j]-small; //substract small number from all elements of array
            System.out.println(no[j]+"-"+small+"="+sub);
            sum=sum+no[j]-small;// find sum of all numbers after substracting minimum value
        }
        System.out.println("Average = "+sum/no.length); //print average
    }
}
