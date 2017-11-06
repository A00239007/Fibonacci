import java.util.Scanner;

public class FibonacciGenerator {

	public static void main(String[] args) throws Exception {
		FibonacciGenerator g = new FibonacciGenerator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value that is greater than 0");
		int number = sc.nextInt();
		g.validateN(number);
		System.out.println(g.calculateNthValue(number));
	}

	public boolean validateN(int n) throws Exception {
		boolean check = false;
		if (n > 0) {
			check = true;
		} else {
			check = false;
			throw new Exception("The value was less that 0");
		}
		return check;
	}

	public int calculateNthValue(int n) {
		if(n==1 || n==2)
		{
			return 1;
		}
		else
		{
			int number1 = 1;
			int number2 = 1;
			int fibonacci = 1;
			for(int i=2; i<n;i++)
			{
				fibonacci = number1+number2;
				number1 = number2;
				number2 = fibonacci;
			}
			return fibonacci;
		}
	}
}
