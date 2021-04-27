package kodlamaioDemo;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println(course.title + " kursu eklendi.");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.title + " kursu silindi.");
	}
	
	public void updateCourse(Course course) {
		System.out.println(course.title + " kursu g�ncellendi.");
	}
	
	public void joinCourse(Course course) {
		System.out.println(course.title + " kursuna kabul edildiniz.");
	}
	
	public void leaveCourse(Course course) {
		System.out.println(course.title + " kursundan ayr�ld�n�z.");
	}
	
	public void completeCourse(Course course) {
		if(course.progressStatus==100) {
			System.out.println(course.title + " kursunu tamamlad�n�z.");
		} 
		
		else { System.out.println(course.title + " progress status: " + course.progressStatus); }
	}

}
