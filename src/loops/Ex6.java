/*Here I wrote a program which displays the sum of digits of an integer read from the user. E.g: If user enters
1128, program should display 1+1+2+8=12*/
package loops;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner reads=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter a number: ");
		int i=reads.nextInt();
		while(true) {
			sum+=(i%10);
			i=i/10;			//There are many ways of doing this part, but only when i=0 should you break
			if(i==0)
				break;
		}
		System.out.println(sum);

	}

}
