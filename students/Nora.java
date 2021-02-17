package nora;
import java.util.Scanner;

public class Nora {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		String naMe, surName;
		Student[] B = new Student [10];
		for(int i=0;i<B.length;i++) {
			System.out.println("Enter name:");
			naMe = inp.nextLine();
			System.out.println("Enter surname:");
			surName = inp.nextLine();
			B[i] = new Student(naMe,surName);
		}
	}

}
