/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yogesh
 */
public class Hw3p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int maxN=Integer.parseInt(args[0]); //input from command line
        int sum=0; //initializing sum to 0
        int formula;
        System.out.print("n \t");
        System.out.print("Adding \t\t");
        System.out.print("Formula \n");
        System.out.println("---\t------\t\t-------");
        
        for(int i=1;i<=maxN;i++) 
        {
            sum=sum+i; //finding sum by adding numbers
            formula=i*(i+1)/2; // implementing formula+
            System.out.println(i+"\t"+sum+"\t\t"+formula);
        }
    }
    
}
