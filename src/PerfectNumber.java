//This class input a number and check that number is perfect or not
import java.util.Scanner;

public class PerfectNumber 
{
	int num;
    Scanner sc=new Scanner(System.in);
    static PerfectNumber pn=new PerfectNumber();
    //this method take the input from user
	public void input()
	{
		try {
			System.out.println("Enter a number");
			num=sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//this method print the result the number is perfect or not
	public void  display(boolean b)
	{
		System.out.println(b);
	}
	//This method check the perfect number 
	public void checkPerfectNumber()
	{
		int sum = 0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==num)
		{
		 pn.display(true);
		}
		else
		{
			pn.display(false);
		}
	}
	public static void main(String[] args) 
	{
		pn.input();
		pn.checkPerfectNumber();
	}
}
