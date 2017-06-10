package assignement1;

import java.util.Arrays;

//7.    Create an array of 5 students (rollno, name).  print all the students using enhanced for loop.
public class June7_7 {

	public static void main(String[] args) {
		//String[][] students = new String[5][2];
		String students[][] = {{"1","Alice"},{"2","Betty"},{"3","Carrie"}};		
		
		for (String[] b : students) {
			for (String a : b){
				System.out.print(a + " ");
			}
			System.out.println();
		}

        //System.out.println(Arrays.deepToString(students));
	}
}
