package assignement1;
//3.    Write a code to print the elements of an array, which are greater than 10 and are divisible by 5.
public class June7_3 {
	
	public static void main(String[] args) {
		int[] a = {5,12,15,21};
		int b= getNumber(a);
		System.out.println(b);
	}
	
	public static int getNumber(int[] a) {
		int i = 0;
		    for (i = 0; i <= a.length; i++) {
		        if (a[i] > 10 && a[i]%5 == 0) {
		                return (a[i]);
		            }
		        }
		        return a[i];
		    }
}
