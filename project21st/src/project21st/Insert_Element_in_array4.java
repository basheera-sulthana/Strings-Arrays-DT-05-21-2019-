package project21st;
import java.util.Scanner;
public class Insert_Element_in_array4 
{
	public static void main(String[] args) 
    {
        int len, pos,ele;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length");
        len = sc.nextInt();
        int arr[] = new int[len+1];
        System.out.println("Enter  all the elements:");
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position where you want to insert an element:");
        pos = sc.nextInt();
        System.out.print("Enter the element which you want to insert:");
        ele = sc.nextInt();
        for(int i = len-1; i >= (pos-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = ele;
        System.out.print("After inserting : ");
        for(int i = 0; i <=len; i++)
        {
            System.out.print(arr[i]+",");
        }
       
    }
}
