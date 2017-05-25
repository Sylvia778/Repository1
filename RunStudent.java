package assignement1;

public class RunStudent {

	public static void main(String[] args) {	
		//Student stu = new Student(1,"Mark", 30,60,20);
		Student stu = new Student();
		stu.mark1 = 30;
		stu.mark2 = 70;
		stu.mark3 = 20;
		Validator val = new Validator();
		stu.show();
		System.out.println("-----------------");
		val.validate(stu);
		stu.show();	
	}

}
