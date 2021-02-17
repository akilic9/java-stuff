package oop3;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>();
		int total=0;
		double avg;
		for (int i=0; i<25; i++) {
			int aNum=(int)(Math.random()*101);
			total=total+aNum;
			list.add(aNum);
		}
		System.out.println("Before sorting:"+list);
		avg = total/25;
		Collections.sort(list);
		System.out.println("After sorting:"+list);
		System.out.println("Sum of elements:"+total+"\tAverage of elements:"+avg);
		

	}

}
