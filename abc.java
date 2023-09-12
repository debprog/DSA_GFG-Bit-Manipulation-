package com.mycompany.dsa;
import java.util.*;

public class abc {
    
    public static void findmiss(int[] a,int b)
    {
        int s=0,high=0,t=0;
        for (int i=0;i<b;i++)
        {
            s=s^a[i];
        }
         for (int i=0;i<b;i++)
        {
            if(a[i]>high)
            {
                high=a[i];
            }
        }
         for (int i=1;i<=high;i++)
        {
            t=t^i;
        }
         
        
           System.out.println("Missing Element ="+ (t^s) );
        
                 

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
        findmiss(arr,n);
        
        
        
     
    
    }
    
    
    
}

