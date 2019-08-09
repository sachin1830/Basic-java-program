import java.util.Scanner;

public class PalindromNumber {
	int num;
	Scanner sc = new Scanner(System.in);
	static PalindromNumber pn = new PalindromNumber();

	// this method take the input from user
	public void input() {
		try {
			System.out.println("Enter a number");
			num = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//this method print the result the number is palindrom number or not
	public void display(boolean b) {
		System.out.println(b);
	}
	//This Method check the number is palindrom or not
	public void checkPalindrom()
	{
		int n=num;
		int revnum=0,reminder;
		while(n!=0)
		{
			reminder=n%10;
			revnum =revnum*10+reminder;
			n=n/10;
		}
		if(revnum==num)
		{
			pn.display(true);
		}
		else
		{
			pn.display(false);
		}
		
	}
	public static void main(String[] args) {
		pn.input();
		pn.checkPalindrom();

	}
}
