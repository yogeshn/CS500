/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yrn101
 */
public class Hw4p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int end_no=16; // initialize last number as 16
        int multiple=0;
       for(int i=1;;i++) //iterate loop without checking condition
       {
   
            multiple=end_no*i; // find multiples of 16 and store it in a variable
            
            int no=1;
            while(no<end_no) //iterate from 1 to 16
            {
                if(multiple%no==0) // check if multiple of 16 is divisible number starting with 1
                {
                    no++; //increment it by 1 upto 16
                }
                else
                {
                  
                break; // if it is not divisible then come out of the loop
                }
                
            }
            
            if(no==end_no) //check if we have reached the last number 
                {
                    System.out.println(multiple +" "); // print the smallest number that can be divided by 1 to 16 without a remainder
                    break; //exit loop
                } 
        }
 
    }
} 

    

