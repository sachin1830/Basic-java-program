import java.util.Scanner;

public class ReversANumber 
{
	int num;
	Scanner sc = new Scanner(System.in);
	static ReversANumber ran= new ReversANumber();

	// this method take the input from user
	public void input() {
		try {
			System.out.println("Enter a number");
			num = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//this method print the revers number
	public void display(int n) {
		System.out.println("The reversenumber is "+n);
	}
	//This method reverse a number
	public void reverseNumber()
	{
		int n=num;
		int revnum=0,reminder;
		while(n!=0)
		{
			reminder=n%10;
			revnum =revnum*10+reminder;
			n=n/10;
		}
		ran.display(revnum);
	}
	public static void main(String[] args) 
	{
		ran.input();
		ran.reverseNumber();
	}

}
