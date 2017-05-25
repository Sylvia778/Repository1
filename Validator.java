package assignement1;

public class Validator {

	public Student validate(Student stu){		
		if(stu.mark1 < 40){
			stu.mark1 = 40;
		}		
		if(stu.mark2 < 40){
			stu.mark2 = 40;
		}
		if(stu.mark3 < 40){
			stu.mark3 = 40;
		}
		return stu;	
	}	
}
