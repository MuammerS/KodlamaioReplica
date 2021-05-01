package kodlamaioReplica;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Muammer");
		student.setLastName("Sönmez");
		student.setEmail("muammer@mail.com");
		student.setPassword("123456");
		student.setStudentNumber("416");
		student.setLevel("#Basic#");
		
		Instructor instructor = new Instructor
				(2 , "Engin" , "Demiroğ" ,"45689" ,"enging@mail.com" , "$UZMAN$"  );
		
		UserManager userManager = new UserManager();
		userManager.getAll(instructor);
		userManager.getAll(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.update(student);
		studentManager.delete(student);
		studentManager.getLevel(student);
		studentManager.getStudentNumber(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);
		instructorManager.getSpeciality(instructor);
		
		
		
		
		
		
		
		

	}

}
