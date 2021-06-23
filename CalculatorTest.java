
public class CalculatorTest {
	public static void  main(String[] args) {
		Calculator c = new Calculator();
		c.setNum1(10);
		c.setNum2(20);
		c.setOperator('+');
		c.performOperation();
		c.getResults();
	}
}
