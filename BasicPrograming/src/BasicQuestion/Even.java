package BasicQuestion;
import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("this is a Even number");
		}else {
			System.out.println("this is a Odd number");
		}
		sc.close();
	}

}
