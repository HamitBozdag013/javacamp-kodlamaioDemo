package kodlamaioDemo;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println(course.title + " kursu eklendi.");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.title + " kursu silindi.");
	}
	
	public void updateCourse(Course course) {
		System.out.println(course.title + " kursu güncellendi.");
	}
	
	public void joinCourse(Course course) {
		System.out.println(course.title + " kursuna kabul edildiniz.");
	}
	
	public void leaveCourse(Course course) {
		System.out.println(course.title + " kursundan ayrıldınız.");
	}
	
	public void completeCourse(Course course) {
		if(course.progressStatus==100) {
			System.out.println(course.title + " kursunu tamamladınız.");
		} 
		
		else { System.out.println(course.title + " progress status: " + course.progressStatus); }
	}

}
