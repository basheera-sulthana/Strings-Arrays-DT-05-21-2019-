package project21st;
import java.util.Scanner;
public class Consonants 
{
	public static void main(String args[]) 
    { 
		  String s;
		  @SuppressWarnings("resource")
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter a string");
         s=sc.nextLine();
         conso(s);
    }
	static void conso(String s)
	{
		int count=0;
		char ch;
	
		for(int j=0;j<s.length();j++)
		{
		  ch=s.charAt(j);	
		   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		   {
			 
		        count++;
				System.out.println("Entered character "+ch+" is Consonant");
		        		   }  
		   

				else
				System.out.println("Not an alphabet");		
		  
	}
		System.out.println("Consonants count is "+count);
}
}