package kodlamaioReplica;

public class Instructor extends User {

	private String speciality;

	public Instructor() {

	}

	public Instructor(int id, String firstName, String lastName, String password, String email,String speciality) {

		super(id, firstName, lastName, password, email);
		this.speciality = speciality;

	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
