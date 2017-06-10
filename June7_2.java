package assignement1;

//2.    Create an array of string and print the element with the highest length of the string.
public class June7_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"one", "two", "three", "four"};
		String b= getLongestString(a);
		System.out.println(b);
	}
	
	public static String getLongestString(String[] a) {
		int i = 0;
		    for (i = 0; i <= a.length; i++) {
		        if (a[i].length() > a[i + 1].length()) {
		                return (a[i]);
		            }
		        }
		        return a[i];
		    }
}