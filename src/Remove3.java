// This program remove 3 from the given number and display it
import java.util.Scanner;
public class Remove3 
{
	int num;
	Scanner sc = new Scanner(System.in);
	static Remove3 r3= new Remove3();

	// this method take the input from user
	public void input() {
		try {
			System.out.println("Enter a number");
			num = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   //this method display the result
	public void display(int n) 
	{
		System.out.println(n);
	}
	//This method remove 3 from input number
	public int removeNumber()
	{
	   int temp;
	   int fact=1;
	   temp=num;
	   int res=0;
		while(temp>0)
		{
			temp=temp/10;
			fact=fact*10;
		}
		while(fact>1)
		{
			fact=fact/10;
			if((num/fact)==3)
			{
				num=num%fact;
			}
			else
			{
				res=res*10+(num/fact);
				num=num%fact;
			}
		}
		return res;
	}
	public static void main(String[] args) 
	{
		r3.input();
		int result=r3.removeNumber();
		r3.display(result);
	}

}
