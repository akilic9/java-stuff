package cooo;

public class Cooo {

	public static void main(String[] args) {
		int [][]coords = {{5,1},{-1,3},{2,1},{-5,-2},{2,-2},{1,4},{0,2},{-1,5},{-6,-3},{3,-4}};
		int [] guess = {0,6};
		int [] closest;
		closest = finder(coords,guess);
		
		System.out.println("The closest point:{"+closest[0]+","+closest[1]+"}");
	}
	public static int [] finder(int coords[][], int guess[]){
		int [] closest = new int[2];
		double dist;
		double minDist = Math.sqrt((Math.pow((coords[0][0]-guess[0]),2))+(Math.pow((coords[0][1]-guess[1]),2)));
		for(int i=0;i<coords.length;i++) {
			dist=Math.sqrt((Math.pow((coords[i][0]-guess[0]),2))+(Math.pow((coords[i][1]-guess[1]),2)));;
			System.out.println(dist);
			if(dist<minDist) {
				minDist = dist;
				closest[0] = coords [i][0];
				closest[1] = coords [i][1];
				}
		}
		return closest;
	}
}
