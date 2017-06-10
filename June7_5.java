package assignement1;
//5.    Write a code to multiply 2 matrices.
import java.util.Arrays;

class June7_5
{
   public static void main(String args[])
   {
			 int a[][] = {{1,2},{3,4}};
			 int b[][] = {{5,6},{7,8}};
			 int c[][] = new int[2][2];
			 
			for (int i = 0; i < 2; i++){
				for(int j = 0; j< 2; j++){
					c[i][j] = a[i][j] * b[i][j];
					//System.out.print(c[i][j] + " ");
				}
				//System.out.println();
			}
			System.out.println("Array a: " + Arrays.deepToString(a));
			System.out.println("Array b: " + Arrays.deepToString(b));
			System.out.println("Array a*b : " + Arrays.deepToString(c));
   }
}