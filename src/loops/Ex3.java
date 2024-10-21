package loops;
//Here I was summing the strict divisors of a number which is also a way of finding prime numbers
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner reads= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=reads.nextInt();
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum+=i;}
		}
		System.out.println(sum);

	}

}
