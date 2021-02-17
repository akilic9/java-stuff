package oop3a;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class LetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Character, Integer> myMap = new HashMap<>();
		
		createMap(myMap);
		displayMap(myMap);	
	}
	
	private static void createMap(Map<Character, Integer> map) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter strings:");
		String text = inp.nextLine();
		
		char[] tokens = text.toCharArray();
		
		for(char token : tokens) {
			char letter = Character.toLowerCase(token);
			
			if(map.containsKey(letter) && letter!=' ') {
				int count = map.get(letter);
				map.put(letter, count+1);
			}
			else if (letter != ' ') {
				map.put(letter, 1);
			}
		}
	}
	
	private static void displayMap(Map<Character, Integer> map) {
		Set<Character> keys = map.keySet();
		
		TreeSet<Character> sortedKeys = new TreeSet<>(keys);
		
		System.out.printf("%nMap contains:%nKey\t\tValue%n");
		for(char key: sortedKeys) {
			System.out.printf("%-10s%10s%n", key, map.get(key));
		}
		System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(),map.isEmpty());
	}

}
