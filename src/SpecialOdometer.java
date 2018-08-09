import java.util.*;

public class SpecialOdometer {
	int startValue;
	int endValue;
	
	public SpecialOdometer(int numberOfDigits) {
		this.startValue = Integer.parseInt("123456789".substring(0, numberOfDigits));
		this.endValue = endValue;
	}
	
	public int nextValue(int currentValue);
	public int nextNValue(int currentValue, int n);
	public int prevValue(int currentValue);
	public int prevNValue(int currentValue, int n);
	public int differenceBetweenTwo(int value1, int value2);
}
