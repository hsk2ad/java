import java.util.ArrayList;

public class Basics {
	public void prints() {
		for(int i = 1; i < 256; i++) {
			System.out.println(i);
		}
	}
	
	public void printsodd() {
		for(int i = 1; i < 256; i = i+2) {
			System.out.println(i);
		}
	}
	
	public void printsum() {
		int sum = 0;
		for(int i = 0; i< 256; i++) {
			sum += i;
			System.out.println("New number: " + i + "Sum: " + sum);
		}
	}
	
	public void iterateArray() {
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		for(int i = 0; i < myArray.size(); i++) {
			int number = myArray.get(i);
			System.out.println(number);
		}
	}
	
	public int max() {
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		int max = myArray.get(0);
		for(int i = 1; i < myArray.size(); i++) {
			if(max < myArray.get(i)) {
				max = myArray.get(i);
			}
		}
		return max;
	}
	
	public int average() {
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		int average = 0;
		int total = 0;
		for(int i = 0; i < myArray.size(); i++) {
			average += myArray.get(i);
		}
		total = average / myArray.size();
		return total;
	}
	
	public ArrayList<Integer> printsoddArray() {
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		for(int i = 1; i < 256; i = i+2) {
			myArray.add(i);
		}
		return myArray;	
	}
	
	public int greaterThanY(int[] myArray, int y) {
		int counter = 0;
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] > y) {
				counter++;
			}
		}
		return counter;
	}
	
	public ArrayList<Integer> squareValues(){
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		ArrayList<Integer> myArray2 = new ArrayList<Integer>();
		for(int i = 0; i < myArray.size(); i++) {
			int newArray = myArray.get(i) * myArray.get(i);
			myArray2.add(newArray);
		}
		return myArray2;
	}
	
	public ArrayList<Integer> eliNegative(){
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		ArrayList<Integer> myArray2 = new ArrayList<Integer>();
		for(int i = 0; i < myArray.size(); i++) {
			if(myArray.get(i) < 0) {
				myArray2.add(0);
			}
			else {
				myArray2.add(i);
			}
		}
		return myArray2;
	}
	
	public ArrayList<Integer> maxminavg(){
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		ArrayList<Integer> myArray2 = new ArrayList<Integer>();
		int max = myArray.get(0);
		for(int i = 1; i < myArray.size(); i++) {
			if(max < myArray.get(i)) {
				max = myArray.get(i);
			}
		}
		
		int average = 0;
		int total = 0;
		for(int i = 0; i < myArray.size(); i++) {
			average += myArray.get(i);
		}
		total = average / myArray.size();
		
		int min = myArray.get(0);
		for(int i = 1; i < myArray.size(); i++) {
			if(myArray.get(i) < min) {
				min = myArray.get(i);
			}
		}
		
		myArray2.add(max);
		myArray2.add(min);
		myArray2.add(average);

		return myArray2;
		
	}
	
	public static void shift(int[] arr){
		for(int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = 0;
	}
	
}
