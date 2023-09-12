
package com.mycompany.dsa;

import java.util.*;
public class Countsetbits {
    
   public static int countbits(int n)
    {
        int ct=0;
        while(n>0)
        {
            n=n&(n-1);
            ct++;      
        }
        
        return ct;
    }
    
    
    
    public static void main(String args[])
    {
        int a,b;
        System.out.println("enter num");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=countbits(a);
        System.out.println(b);
        
    }
}
