package dataP1;
import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner (System.in);
		RandomizedQueue<String> q = new RandomizedQueue<String>();
		int size,k;
		String s;
		System.out.printf("Enter size:", args);
		size = inp.nextInt();
		for(int i=0;i<size;i++) {
			s = inp.next();
			q.add(s);
		}
		System.out.printf("Enter k:", args);
		k = inp.nextInt();
		for(int j=0;j<k;j++) {
			System.out.printf(" %s |", q.remove());
		}
	}

}
