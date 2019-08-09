
import java.util.Scanner;
public class StrongNumber {

	int num;
	Scanner sc = new Scanner(System.in);
	static StrongNumber sn= new StrongNumber();

	// this method take the input from user
	public void input() {
		try {
			System.out.println("Enter a number");
			num = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   //this method display a number is Strong number or not
	public void display(boolean b) 
	{
		System.out.println(b);
	}
	//This method check a number is Strong number or not
	public void checkStrongNumber()
	{
		int n=num;
		int reminder;
		int fact=1;
		int result=0;
		while(n!=0)
		{
			reminder=n%10;
			for(int i=1;i<=reminder;i++)
			{
				fact=fact*i;
			}
			
			result=result+fact;
			n=n/10;
			fact=1;
		}
		//System.out.println(result);
		if(result==num)
		{
			sn.display(true);
		}
		else
		{
			sn.display(false);
		}
	}
	public static void main(String[] args) 
	{
		sn.input();
		sn.checkStrongNumber();
	}

}
