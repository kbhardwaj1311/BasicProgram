package BasicQuestion;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		String s=""+num;
		int l=s.length();
		int sum=0,temp=num;
		while(temp>0) {
			sum=sum+cube(temp%10,l);
			temp=temp/10;
		}
		
		System.out.println(sum);
		if(sum==num) {
			System.out.println("this is a Armstrong number");
		}else {
			System.out.println("this is  not a Armstrong number");
		}
		
		

	}
  public static int cube(int a,int pow) {
	  int res=1;
	  for(int i=0;i<pow;i++) {
		  res=res*a;
	  }
	  return res;
	  
  }
}
