package assignement1;

public class BiggestNumber {

	public static void main(String[] args) {
		int a = 0;
		int b = 3;
		int c = 2;
		int temp;
		
		if(a > b && a > c){
			temp = a;
		}else if(b > a && b > c){
			temp = b;
		}else{
			temp = c;
		}
		System.out.println("The biggest number is " + temp);
	}

}
