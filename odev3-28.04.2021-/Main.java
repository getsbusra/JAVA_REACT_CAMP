package odev3;

public class Main {

    public static void main(String[] args) {

        Instructor instructor = new Instructor();
        instructor.setUserID(1);
        instructor.setUserName("Engin Demirog");
        instructor.setUserPassword("12345");
        instructor.setMyCourses("Java/React Kursu");
        instructor.setMyStudents("Busra");
        
        
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setUserID(1);
        student1.setUserName("Ali");
        student1.setUserPassword("12345");
        student1.setMyCourses("Java/React Kursu");


        student2.setUserID(2);
        student2.setUserName("Busra");
        student2.setUserPassword("12345");
        student2.setMyCourses("C#/Angular Kursu");
        
        User user = new User();
        UserManager userManager = new UserManager();
        userManager.editProfile(student1);
        StudentManager studentManager = new StudentManager();
        studentManager.addCourse();
        
        

        
        
    }
    
}