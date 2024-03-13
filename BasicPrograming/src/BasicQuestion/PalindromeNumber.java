package BasicQuestion;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp ,rem ,res=0;
		temp=num;
		while(temp>0) {
			rem=temp%10;
			res=(res*10)+rem;
			temp=temp/10;
		}
		 if(num==res)    
			  System.out.println("palindrome number ");    
		 else    
			System.out.println("not palindrome");    
	
	}

}
