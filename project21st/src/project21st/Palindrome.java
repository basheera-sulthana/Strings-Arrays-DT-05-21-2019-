package project21st;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String args[]) 
    { 
		int n,rev=0,temp,a;
		@SuppressWarnings("resource")
 	    Scanner sc=new Scanner(System.in);
         System.out.println("Enter n value");
         n=sc.nextInt();
         temp=n;
         while(n!=0)
         {
        	 a=n%10;
        	 rev=(rev*10)+a;
        	 n=n/10;
         }
         if(temp==rev)
         {
         System.out.println("Palindrome");
         }
         else
         {
        	 System.out.println("Not a Palindrome");
         }
}
}