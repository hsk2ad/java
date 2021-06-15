
public class StringManipulator {
	public String trimAndConcat(String string1, String string2) {
		string1 = string1.trim();
		string2 = string2.trim();
		String fullstring = string1 + string2;
		return fullstring;
	}
	public Integer getIndexOrNull(String string1, char char1) {
		int a = string1.indexOf(char1);
		return a;
	}
	
	public Integer getIndexOrNull(String string1, String string2) {
		int a = string1.indexOf(string2);
		return a;
	}
	
	public String concataSubstring(String string1, int int1, int int2, String string2) {
		String finalstring = string1.substring(int1, int2);
		String finalstring2 = finalstring + string2;
		return finalstring2;
	}
	
}
