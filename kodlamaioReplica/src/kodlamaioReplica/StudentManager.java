package kodlamaioReplica;

public class StudentManager extends UserManager {

	public void getLevel(Student student) {
		System.out.println(student.getFirstName() +
				" İsimli Öğrencinin Başarı Seviyesi : " + student.getLevel());
	}
	
	public void getStudentNumber(Student student) {
		System.out.println(student.getFirstName() + " İsimli Öğrencinin Numarası : " + student.getStudentNumber());
	}

}
