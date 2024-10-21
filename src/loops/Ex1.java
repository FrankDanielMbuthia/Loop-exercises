package loops;

public class Ex1 {

	public static void main(String[] args) {
		for(int i=0; i<=100; i+=2) {
			System.out.print(i+", ");
		}
		System.out.println();
		int i=100;
		while(i>=1) {
			System.out.print(i+", ");
			i-=2;
		}
		
	}

}
