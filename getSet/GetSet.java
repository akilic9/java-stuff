package getSet;
import java.util.Scanner;
public class GetSet {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String symbol,name;
		double yesterday,today;
		System.out.println("Enter symbol, name, yerterday's price and today's price respectively:");
		symbol = inp.nextLine();
		name = inp.nextLine();
		yesterday = inp.nextInt();
		today = inp.nextInt();
		Stok ex1 = new Stok (symbol,name,yesterday,today);
		System.out.println("Change rate:"+ex1.getPer());

	}

}
