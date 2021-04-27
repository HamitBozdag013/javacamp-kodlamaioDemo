package kodlamaioDemo;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.Full_Name + " isimli kullan�c� eklendi.");
	}
	
	public void editUser(User user) {
		System.out.println(user.Full_Name + " isimli kullan�c�n�n bilgileri d�zenlendi.");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.Full_Name + " isimli kullan�c� silindi.");
	}

}
