package dataP2;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner (System.in);
		Deque d = new Deque ();
		int size;
		
		System.out.printf("Enter size:", args);
		size = inp.nextInt();
		
		System.out.println("Enter strings:");
		for (int i=1; i<=size;i++) {
			char f = inp.next().charAt(0);
			d.addFirst(f);
		}
		
		for (int i=0; i<(int) (size/2); i++) {
			System.out.printf("%b", d.reverse());
		}
	}
	
	

}
