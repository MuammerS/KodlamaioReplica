package kodlamaioReplica;

public class StudentManager extends UserManager {

	public void getLevel(Student student) {
		System.out.println(student.getFirstName() +
				" �simli ��rencinin Ba�ar� Seviyesi : " + student.getLevel());
	}
	
	public void getStudentNumber(Student student) {
		System.out.println(student.getFirstName() + " �simli ��rencinin Numaras� : " + student.getStudentNumber());
	}

}
