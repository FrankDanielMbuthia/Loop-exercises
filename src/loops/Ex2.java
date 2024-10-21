package loops;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner reads= new Scanner(System.in);
		int sum=0;
		//Here we use an infinite loop because we don't know how many times the user will enter a number
		while(true) {
			System.out.println("Enter a number");
			sum+=reads.nextInt();
			//The break statement is used to get out of the infinite loop when sum  exceeds 100
			if(sum>100)
				break;
		}
		System.out.println("Done: "+sum);
	}

}
