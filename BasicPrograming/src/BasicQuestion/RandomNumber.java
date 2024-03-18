package BasicQuestion;
import java.util.Scanner;
public class RandomNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many random number you need Enter here ");
		int num=sc.nextInt();
         for(int i=0;i<num;i++) {
        	int ram= (int)(Math.random()*101);
            System.out.print(ram+" ");
        	
         }
         sc.close();
	}

}
