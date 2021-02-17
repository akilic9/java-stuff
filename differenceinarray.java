//Difference between biggest and smallest number of the given array.
package diff;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Diff {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int size, diFF;
		String sz;
		sz = JOptionPane.showInputDialog("Enter the size of the array:");
		size = Integer.parseInt(sz);
		int Arr [] = new int [size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			Arr[i] = inp.nextInt();
		}
		diFF = met(Arr);
		System.out.println("The difference between biggest and smallest number is:"+diFF);
	}
	public static int met(int [] aRR) {
		int diff;
		int min = aRR[0];
		int max = aRR[0];
		for(int i=0; i<aRR.length; i++) {
			if(min>aRR[i]) {
				min=aRR[i];
			}
			if(max<aRR[i]) {
				max=aRR[i];
			}
		}
		diff = max - min;
		return diff;
	}

}
