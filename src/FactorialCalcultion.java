import java.util.Scanner;
public class FactorialCalcultion 
{
		int num;
	    Scanner sc=new Scanner(System.in);
	    static FactorialCalcultion fc=new FactorialCalcultion();
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
		//this method print the factorial of a number
		public void  display(int n)
		{
			System.out.println("Factorial of the number is "+n);
		}
		//This method calculate the factorial of a number
		public void calculateFactorial()
		{
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			fc.display(fact);
		}
	public static void main(String[] args) 
	{
		fc.input();
		fc.calculateFactorial();
	}
}
