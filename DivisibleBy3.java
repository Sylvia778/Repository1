package assignement1;

public class DivisibleBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 23;
		
		if (a>10 && a< 100){
			if (a%3 == 0){
	    		System.out.println(a + " is divisible by 3.");
	    	}else{
	    		System.out.println(a + " is not divisible by 3.");
	    	}
		}else{
			System.out.println(a + " is out of scope.");
		}
		
	}

}
