package kodlamaioDemo;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.Full_Name + " isimli kullanýcý eklendi.");
	}
	
	public void editUser(User user) {
		System.out.println(user.Full_Name + " isimli kullanýcýnýn bilgileri düzenlendi.");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.Full_Name + " isimli kullanýcý silindi.");
	}

}
