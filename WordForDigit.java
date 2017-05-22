package assignement1;
public class WordForDigit {

	public static void main(String[] args) {

			int i = 2;
			String str = "null";

		    if(i>0 && i <=10){

		    switch(i){
		    case 1:
		        str= "One";break;
		    case 2:
		        str= "two";break;
		    case 3:
		        str= "three";break;
		    case 4:
		        str= "four";break;
		    case 5:
		        str= "five";break;
		    case 6:
		        str= "six";break;
		    case 7:
		        str= "seven";break;
		    case 8:
		        str= "eight";break;
		    case 9:
		        str= "nine";break;
		    case 10:
		        str= "Ten";break;
		    };
		    System.out.println(str);
		    }else{
		    	System.out.println(i + " is out of scope.");
		    }
		}
	}
