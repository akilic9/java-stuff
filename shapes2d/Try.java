package proj1;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quad quad = new Quad(1,1,7,3,6,10,2,7);
		Trap trap = new Trap(0,4,10,4,5,7,3,7);
		Parallel para = new Parallel(5,7,11,7,12,0,6,0);
		Rect rect = new Rect(17,14,12,14,12,7,17,7);
		Sq sq = new Sq(8,11,8,6,3,6,3,11);
		System.out.printf("%s %s %s %s %s", quad, trap, para, rect, sq);

	}

}
