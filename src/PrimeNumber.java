//This class Check the number is Prime or not
import java.util.Scanner;
public class PrimeNumber
{
	int num;
    Scanner sc=new Scanner(System.in);
    static PrimeNumber pm=new PrimeNumber();
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
	//this method print the result the number is prime or not
	public void  display(boolean b)
	{
		System.out.println(b);
	}
	//this method check the number is prime or not
	public void checkPrimeNumber()
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count<=2)
		{
			pm.display(true);
		}
		else
		{
			pm.display(false);
		}
	}
	public static void main(String[] args) 
	{
		pm.input();
		pm.checkPrimeNumber();
	}

}
