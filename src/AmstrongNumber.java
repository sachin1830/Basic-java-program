import java.util.Scanner;

public class AmstrongNumber {

	int num;
	Scanner sc = new Scanner(System.in);
	static AmstrongNumber an= new AmstrongNumber();

	// this method take the input from user
	public void input() {
		try {
			System.out.println("Enter a number");
			num = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//this method display a number is amstrong or not
	public void display(boolean b) {
		System.out.println(b);
	}
	//This method check a number is amstrong number or not
	public void checkAmstrong()
	{
		int n=num;
		int reminder=0;
		int result=0, cubs;
		while(n!=0)
		{
			reminder=n%10;
			cubs=reminder*reminder*reminder;
			result=result+cubs;
			n=n/10;
		}
		if(result==num)
		{
			an.display(true);
		}
		else
		{
			an.display(false);
		}
	}
	public static void main(String[] args)
	{
		an.input();
		an.checkAmstrong();
	}

}
