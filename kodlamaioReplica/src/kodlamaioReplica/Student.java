package kodlamaioReplica;

public class Student extends User {
	private String studentNumber;
	private String level;

	public Student() {

	}

	public Student(int id, String firstName, String lastName, String password, String email, String studentNumber,
			String level) {

		super(id, firstName, lastName, password, email);
		this.studentNumber = studentNumber;
		this.level = level;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
}
