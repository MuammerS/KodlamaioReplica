package kodlamaioReplica;

public class UserManager {

	public void getAll(User user) {
		System.out.println("Sistemden Getirildi : " + user.getFirstName());
	}

	public void add(User user) {
		System.out.println("Sisteme Eklendi : " + user.getFirstName());
	}

	public void delete(User user) {
		System.out.println("Sistemden Silindi : " + user.getFirstName());
	}

	public void update(User user) {
		System.out.println("Kiþi Güncellendi : " + user.getFirstName());
	}
}
