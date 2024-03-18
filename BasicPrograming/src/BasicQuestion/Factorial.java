package BasicQuestion;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int fac=fac(num);
		System.out.println("Factorial="+fac);
		sc.close();

	}
   public static int  fac(int a) {
	   int sum=1,i;
	   for(i=1;i<=a;i++) {
		   sum=sum*i;
	   }
	   return sum;
   }
}
