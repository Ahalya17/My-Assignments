package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 1;
		
		System.out.println("Printing first 10 numbers of the fibonacci series");
		
		for (int i = 2, range = 10, sum = 0; i <= range; i++) {
			
			sum = n1+n2;
			
			System.out.println(sum);
			
			n1=n2;
			
			n2=sum;

	}

}
}
