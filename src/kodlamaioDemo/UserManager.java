package kodlamaioDemo;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.Full_Name + " isimli kullanıcı eklendi.");
	}
	
	public void editUser(User user) {
		System.out.println(user.Full_Name + " isimli kullanıcının bilgileri düzenlendi.");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.Full_Name + " isimli kullanıcı silindi.");
	}

}
