
package com.mycompany.dsa;
import java.math.*;
import java.util.*;

public class powerof2 {
    
    public static void main(String args[])
    {
        
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double a= (Math.log(num)/Math.log(2));
        double c;
        
        if(a- (int)(a)==0.0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
