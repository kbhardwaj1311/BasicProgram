package BasicQuestion;

import java.util.Scanner;

public class Pattren4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num,i,j;
		num=sc.nextInt();
		for( i=0;i<=num;i++) {
			for( j=0;j<i;j++) {
				System.out.print("*");
			}
			for( j=i+1;j<num;j++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
