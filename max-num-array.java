package arrQ;

public class ARRQ {

	public static void main(String[] args) {
		int [][] Arr = new int [10][15];
		int res;
		for(int i=0; i<Arr.length; i++) {
			for(int j=0; j<Arr[i].length; j++) {
				Arr[i][j]= (int) (Math.random()*210);
				System.out.print(" "+Arr[i][j]);
			}
			System.out.println();
		}
		res = maxi(Arr);
		System.out.println("Max number is:"+res);
	}
	public static int maxi(int[][]aRR) {
		int max=0;
		for(int i=0; i<aRR.length; i++) {
			for(int j=0; j<aRR[i].length; j++) {
				if(aRR[i][j]>max) {
					max = aRR[i][j];
				}
			}
		}
		return max;
	}

}
