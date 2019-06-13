package project21st;
import java.util.Scanner;
public class Array_Reverse5 
{
	public static void main(String[] args) 
    {
		int n,i,j=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		n=sc.nextInt();
		int array[]=new int[n];
		int rev[]=new int[n];
		System.out.println("Enter array elements");
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Reverse array is");
		for(i=n;i>0;i--,j++)
		{
			rev[j]=array[i-1];
			System.out.print("\n"+rev[j]);
		}
		
    }
}
