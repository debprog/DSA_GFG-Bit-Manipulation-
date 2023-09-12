
package com.mycompany.dsa;
import java.util.*;

public class oddlyoccur {
    
    public static void findodd(int[] a,int b)
    {
        int s=0;
        for (int i=0;i<b;i++)
        {
            s=s^a[i];
        }
        
        
        if(s==0)
        {
            System.out.println("No odd occurence");
        }
        else
        {
            System.out.println("odd occuring No="+s);
        }
    }
    
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int  n=sc.nextInt();
        
        int arr[]=new int[n];
        
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter array elements");
            arr[i]=sc.nextInt();
        }
        findodd(arr,n);
        
        
        
     
    
    }
    
    
    
}
