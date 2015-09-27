
import static java.lang.Math.pow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yogesh
 */
public class Hw2p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int b= Integer.parseInt(args[0]); // accept integer from commandline 
        int n= Integer.parseInt(args[1]); // accept integer from commandline 
        
        System.out.println("exponent\t"+b+"^exponent\n");
        for(int i=0;i<=n;i++)
        {
            int temp;
            temp =(int) pow(b,i); // calculate b^n and convert it to integer
            System.out.println(i+"\t\t"+temp);
        }
    }
    
}
