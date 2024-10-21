/*In this exercise, the user is supposed to enter numbers, if a -ve number is entered it should stop executing. It should then tell me the 
max and min of the numbers entered without including the -ve*/
package loops;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner reads=new Scanner(System.in);

		
		System.out.print("Enter a number: ");
		int i=reads.nextInt();
		int max=i;				//This is to assign max and min the valure of i. Such that now a number can only get higher or lower than the first number
		int min=i;
		while(true) {
			System.out.print("Enter a number: ");
			i=reads.nextInt();
			
			if(i<0)
				break; //Because this break is first to be executed, when a -ve number is entered it won't be stored in the min. It'll just break out of entire loop
			
			if(i>max)
				max=i;
			
			if(i<min)
				min=i;
			
		}
		System.out.println("max= "+max+" min= "+min);
	}

}
