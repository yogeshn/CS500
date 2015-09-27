/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yogesh
 */
public class Hw2p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int width = Integer.parseInt(args[0]); // accept width
        int height = Integer.parseInt(args[1]); // accept height

        for (int i = 0; i < height; i++) { 
            System.out.print("*");
            
            for (int j = 1; j < width; j++) {
                System.out.print("*");

            }
            System.out.println("\n"); // enter into new line after printing a row

        }
    }

}
