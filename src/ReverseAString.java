import java.util.Scanner;

public class ReverseAString 
{
	static Scanner sc=new Scanner(System.in);
	String srt;
	String reverse="";
	public void input()
	{
		System.out.println("Enter a String");
		srt=sc.nextLine();
	}
	public void display()
	{
	  System.out.println("The reverse String is : " + reverse);	
	}
	public void reverseString()
	{
		for(int i=srt.length()-1;i>=0;i--)
		{
			reverse=reverse+srt.charAt(i);
		}
	}
	public static void main(String[] args) 
	{
		ReverseAString ras=new ReverseAString();
		ras.input();
		ras.reverseString();
		ras.display();

	}
}
