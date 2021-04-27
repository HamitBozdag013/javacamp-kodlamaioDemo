package kodlamaioDemo;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course (1, "Yazılımcı Geliştirme Kampı(C# + Angular)", "Engin Demiroğ", 100);
		
		Course course2 = new Course(2, "Yazılımcı Geliştirme Kampı(Java + React)", "Engin Demiroğ", 40);
		
		Course[] courses = {course1, course2};
		
		for(Course course : courses) {
			
			System.out.println("Course Id: " + course.id);
			System.out.println("Course Title: " + course.title);
			System.out.println("Instructur: " + course.instructor);
			System.out.println("Progress Status: " + course.progressStatus);
		}
		
		System.out.println();
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.joinCourse(course1);	
		courseManager.completeCourse(course1);
		courseManager.leaveCourse(course2);
		
		
		System.out.println();
		
		User user1 = new User(1, "HamitBozdag", "bozdag.013@gmail.com", "123hb");
		User user2 = new User(2, "MerveBozdag", "mervebozdag.013@gmail.com", "456mb");
		User user3 = new User(3, "ErvaBetulBozdag", "ervabetulbozdag.013@gmail.com" ,"789ebb");
		
		User[] users = {user1, user2, user3};
		
		for(User user : users) {
			System.out.println("User Id: " + user.id);
			System.out.println("Full Name: " + user.Full_Name);
			System.out.println("Password: " + user.password);
		}
		
		System.out.println();
		
		UserManager userManager = new UserManager();
		userManager.addUser(user1);
		userManager.addUser(user2);
		userManager.addUser(user3);
		userManager.editUser(user1);
		userManager.deleteUser(user2);
			

	}

}
