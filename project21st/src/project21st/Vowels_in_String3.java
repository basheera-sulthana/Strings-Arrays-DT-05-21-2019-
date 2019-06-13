package project21st;
import java.util.Scanner;

public class Vowels_in_String3 
{
	public static void main(String args[]) 
    { 
		  String s;
		  @SuppressWarnings("resource")
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter a string");
         s=sc.nextLine();
         System.out.println("Vowels are "+s);
         vowels(s);
      }
     static	void vowels(String s)
	{
		char ch;
		int i=0;
		for(int j=0;j<s.length();j++)
		{
		  ch=s.charAt(j);	
		  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		  {
	            i=1;
		    System.out.println(ch); 		 
		  }
		  
		}
		if(i==0)
		{
			System.out.println("There is no vowels in the given string");
		}
	}
}
