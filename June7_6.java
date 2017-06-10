package assignement1;

import java.util.Arrays;

//6.    Create a 3D array and print the values using enhanced for loop
public class June7_6 {

	public static void main(String[] args) {
	        String[][][] array3d = new String[2][2][2];

	         for(String[][] array2d : array3d){
	             for(String[] array : array2d){
	                 Arrays.fill(array, "a");
	             }
	         }
	         System.out.println(Arrays.deepToString(array3d));
	    }
}
