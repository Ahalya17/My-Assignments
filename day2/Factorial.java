package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		
		int num = 4,fact = 1;
		for (int i = num; i > 0; i--)
			fact = fact * i;
		System.out.println("Factorial of "+num+" is: "+fact);

	}

}
