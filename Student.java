package assignement1;

public class Student {
	
	int rollno, mark1, mark2, mark3;
	String name;

	public Student(){		
	}
	
	public Student(int rollno, String name, int mark1, int mark2, int mark3) {
		this.rollno = rollno;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	public void show(){	
		System.out.println("mark1: " + mark1);
		System.out.println("mark2: " + mark2);
		System.out.println("mark3: " + mark3);		
	}	
}
