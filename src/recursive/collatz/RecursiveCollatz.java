/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive.collatz;

/**
 *
 * @author Aleaya
 */
public class RecursiveCollatz {

    public static int coll(int n) {
        while (n>0)
        {
        if(n==1)
        {
            return n;
        }
        else if(n % 2 == 0) 
        {
           n = n/2;
           System.out.println(n);
        }
        else
        {
           n = (3*n)+1;
           System.out.println(n);
        }
      }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(coll(20));
    }
    
}
