public class TestingToString{
	public static void main(String[] args){
		// System.out.println("toString() program tester");
		Student me = new Student(1201, "Sneha Deb", 2003);
		System.out.println(me);
	}
}


class Student{
	private int id;
	private String name;
	private int yearAdmitted;

	public Student(){
	}

	public Student(int id, String name, int yearAdmitted){
		this.id = id;
		this.name = name;
		this.yearAdmitted = yearAdmitted;
	}

	public String getName(){
		return name;
	}

	@Override
	public String toString(){
		return "%d %-8s %d".formatted(id, name, yearAdmitted);
	}
}


// Output
// Run #1: 1001 Himangshu De 2003
// Run #2: 1201 Sneha Deb 2003


