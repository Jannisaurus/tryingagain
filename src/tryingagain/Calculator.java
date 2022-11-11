package tryingagain;

public class Calculator {
	public static void main(String[] args) {
		String name = "Greg";
		String address = "Ole Römers väg 6";
		int age = 23;
		double length = 178.5;

		String string1 = name + address;
		String string2 = address + address;
		String string3 = name + age;
		String string4 = name + age + length;
		
		System.out.println(string4);
		
		int int1 = age + 20;
		int int2 = age + age;
		// int int3 = age + length;
		// int int4 = age + name + length;
		
		double double1 = age;
		double double2 = age + 20;
		double double3 = age + 20.5;
		double double4 = age + length;
		// double double5 = age + name + length;
		
		System.out.println(double4);
	}
}
