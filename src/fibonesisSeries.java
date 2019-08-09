import java.util.Scanner;

public class fibonesisSeries 
{
	int num;
	Scanner sc = new Scanner(System.in);
	static fibonesisSeries fs= new fibonesisSeries();

	// this method take the input from user
	public void input() {
		try {
			System.out.println("Enter how many element you want to print");
			num = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//This Method print the fhibonesis series
   public void printFibonesisSeries()
   {
	   int t1 = 0,t2=1;
	   int next;
	   for(int i=0;i<=num;i++)
	   {
		   System.out.print("\t"+t1);
		   next = t1 + t2;
	        t1 = t2;
	        t2 = next;
	   }
   }
   public static void main(String[] args) 
	{
		fs.input();
		fs.printFibonesisSeries();
	}

}
