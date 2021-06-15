import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJava {
	
	public static Object[] printSum(int[] arr) {
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(arr[i] > 10) {
				newArrayList.add(arr[i]);
			}
		}
		System.out.println(sum);
		return newArrayList.toArray();
}
	public static Object[] shuffleName(String[] arr) {
		ArrayList<String> newArrayList2 = new ArrayList<String>();
		List<String> nameList = new ArrayList<String>();
		for(int i = 0; i < arr.length; i++) {
			nameList.add(arr[i]);
		}
		Collections.shuffle(nameList);
		for(int i = 0; i < nameList.size(); i++) {
			if(nameList.get(i).length() < 5){
				newArrayList2.add(nameList.get(i));
			}
		}
		return newArrayList2.toArray();
	}
	
	public static void shuffleAlphabets() {
		ArrayList<Character> alphabets = new ArrayList<Character>();
		for(char i = 'a'; i < 'z'; i++) {
			alphabets.add(i);
		}
		Collections.shuffle(alphabets);
		System.out.println(alphabets);
		System.out.println(alphabets.get(alphabets.size()-1));
		System.out.println(alphabets.get(0));
		
		if(alphabets.get(0) == 'a' || alphabets.get(0) == 'e' || alphabets.get(0) == 'i' || alphabets.get(0) == 'o' || alphabets.get(0) == 'u') {
			System.out.println("It's a vowel!");
		}
	}
	
	public static int[] randomNumber() {
		int[] randomNumbers = new int[10];
		Random r = new Random();
		for(int i = 0; i<randomNumbers.length; i++) {
			randomNumbers[i] = r.nextInt(45) + 55;
		}
		return randomNumbers;
	}
	
	public static Object[] sortNumber() {
		int[] randomNumbers = randomNumber();
		List<Integer> sortedNumbers = new ArrayList<Integer>();
		for(int i = 0; i < randomNumbers.length; i++) {
			sortedNumbers.add(randomNumbers[i]);
		}
		
		Collections.sort(sortedNumbers);
		System.out.println(sortedNumbers);
		
		int max = sortedNumbers.get(0);
		for(int i = 1; i < sortedNumbers.size(); i++) {
			if(sortedNumbers.get(i) > max) {
				max = sortedNumbers.get(i);
			}
		}
		System.out.println("Max" + max);
		int min = sortedNumbers.get(0);
		for(int i = 1; i < sortedNumbers.size(); i++) {
			if(sortedNumbers.get(i) < min) {
				min = sortedNumbers.get(i);
			}
		}
		System.out.println("Min" + min);
		return sortedNumbers.toArray();
	}
	
	public static String randomString() {
		ArrayList<Character> alphabets = new ArrayList<Character>();
		ArrayList<Character> randomCharacter = new ArrayList<Character>();
		
		for (char i = 'a'; i <= 'z'; i++) {
			alphabets.add(i);
		}
		Collections.shuffle(alphabets);
		for (int i = 0; i < 5 ; i++) {
			randomCharacter.add(alphabets.get(i));
		}
		
		StringBuilder randomStr = new StringBuilder();
		for(char i = 0; i < randomCharacter.size(); i++) {
			randomStr.append(randomCharacter.get(i));
		}
		return randomStr.toString();
	}
	
	public static String[] randomStrings2() {
		String[] random = new String[10];
		for(int i = 0; i < 10; i++) {
			random[i] = randomString();
		}
		return random;
	}
		
	public static void main(String[] args) {
		int[] arr = {3,5,1,2,7,9,8,13,25,32};
		
		Object[] retVal = printSum(arr);
		System.out.println(Arrays.toString(retVal));
		
		String[] arr2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		
		shuffleAlphabets();
		System.out.println(randomString());
	
	}
}

