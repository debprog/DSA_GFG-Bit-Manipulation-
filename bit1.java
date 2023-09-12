
package com.mycompany.dsa;
import java.io.*;
import java.util.*;


public class bit1 {
    
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter number");
        int number=scn.nextInt();
         System.out.println("enter k");
        int k=scn.nextInt();
        
        int y=1,a,s,c;
        a=y<<(k-1);
        s=a&number;
        c=s>>(k-1);
      /*  System.out.println(a);
        System.out.println(s);
        System.out.println(c);*/
        
        if(c==0)
        {
            System.out.println("NO");

        }
        
        else
        {
            System.out.println("YES");
        }
    }
}
