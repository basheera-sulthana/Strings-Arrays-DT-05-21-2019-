package project21st;

import java.util.Scanner;

public class String_Reverse1
{
	public static void main(String args[]) 
    { 
		 String str;
		 @SuppressWarnings("resource")
		  Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a string");
	         str=sc.nextLine();
	         System.out.println("The reverse string is ="+str);
	         int i=str.length();
	         
	         while(i>0)
	         {
	                  System.out.println(str.charAt(i-1));
	                  i--;
	         }
	        
		 
	   	     
    }
}
