/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yogesh
 */
public class Hw5p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int mines = Integer.parseInt(args[2]);
        String str = "|\t";
        int no = 1;
        System.out.println("---------");
        int[][] arr = new int[height][width];

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {
                // System.out.print("*");
                double no1 = Math.random() * 4;

                if (no1 > 3 && count < 4) {
                    arr[i][j] = 5;
                    System.out.print(arr[i][j]);
                    if (j >= 0 && j+1  < width && i>=0 && i+1<height) {
  //  no=no+1;          
                        arr[i+1][j]=no;
                        arr[i][j + 1] = no;
                    }
                  //  System.out.println();
                    count++;
                } else if (j >= 0 && j+1 < width) {

                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }

    }

}
