
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yogesh
 */
public class Hw3p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int trails = Integer.parseInt(args[0]);
        int choicechange = 0, choicenotchange = 0;

        for (int i = 0; i < trails; i++) {
            int[] doors = new int[3]; //declaring 3 doors

            //adding prize to a random door by assining it to 1 
            int prizedoor = (int) Math.floor(Math.random() * 3);
            doors[prizedoor] = 1;

           
            //selecting a random door 
            int pickdoor = (int) Math.floor(Math.random() * 3);
           
            int show;
            do {
                double showdoor = Math.floor(Math.random() * 3);
                show = (int) showdoor; //show door randomly 
            } while (doors[show] == 1 || show == pickdoor); //repeat it untill prize door is open

            choicenotchange = choicenotchange + doors[pickdoor];// increment by 1 if won without changing choice
            
        }
        choicechange = trails - choicenotchange; // subtract number of wins occured without changing choice to total trails 
        double winpercent = choicenotchange * 100 / trails; //calculate win percent 

        System.out.println("Times they should have stayed with first choice: " + choicenotchange);
        System.out.println("Times they should have changed their pick: " + choicechange);
        System.out.println(winpercent + "% of the time they would have been better of changing their pick");

    }

}
