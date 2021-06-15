
public class StringManipulatorTest {

	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("  yee " , " wha    ");
		Integer str2 = manipulator.getIndexOrNull(" samkim ", 'k');
		Integer str3 = manipulator.getIndexOrNull("samkim", "kim");
		String str4 = manipulator.concataSubstring("yayeet", 2, 4, "voila");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
