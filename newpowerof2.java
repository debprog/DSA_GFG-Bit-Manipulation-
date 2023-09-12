
package com.mycompany.dsa;

import java.util.*;
public class newpowerof2 {
    
     public static void powerof2(int n)
     {
         if(n==0)
         {
               System.out.println("not a power of 2");
         }
         
         else 
         {
             int a=n&(n-1);
             if(a==0)
             {
                 System.out.println("Its a power of 2");
             } 
             else 
             {                
                 System.out.println("not a power of 2");
             }
         }
     }
    
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        powerof2(num);
        
    }
    
}
