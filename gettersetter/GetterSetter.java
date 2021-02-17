package gettersetter;

public class GetterSetter {

	public static void main(String[] args) {
		Stock stock1 = new Stock ("ORCL","Oracle Corporation",34.5);
		stock1.setCurP(34);
		
		System.out.println("The price percentage change is:"+stock1.getChPer());

	}

}
