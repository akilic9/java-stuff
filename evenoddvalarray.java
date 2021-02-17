package ayb1;
import java.util.Scanner;
//Find number of odd and even numbers in a array. Return even and odd count as an array. 
public class Ayb1 {

	public static void main(String[] args) {
		int n;
		int [] count = new int [2];
		Scanner inp = new Scanner(System.in);
		System.out.println("How many numbers will you enter?");
		n = inp.nextInt();
		int [] Arr = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0; i<Arr.length;i++) {
			Arr[i] = inp.nextInt();
		}
		count = finder(Arr);
		System.out.println("Even numbers in your set:"+count[0]+"\nOdd numbers in your set:"+count[1]);
	}
	public static int [] finder(int [] aRR) {
		int even=0,odd=0;
		int counted[] = new int [2];
		for(int i=0;i<aRR.length;i++) {
			if(aRR[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		counted[0]=even;
		counted[1]=odd;
		return counted;
	}
	

}
