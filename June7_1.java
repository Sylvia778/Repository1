package assignement1;

import java.util.stream.IntStream;

//1.    Write a code to add all the numbers in an array.
public class June7_1 {

	public static void main(String[] args) {
		int sum = 0;
		int[] a = {1,2,3,4,5};
		//int sum = IntStream.of(a).sum();
		for (int i = 0; i < a.length; i++){
			sum = sum + a[i]; 
		}
		System.out.println("The sum is " + sum);
	}

}
