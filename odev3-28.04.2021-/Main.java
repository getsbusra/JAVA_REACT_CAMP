

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
        
        //USER MANAGER DENEMELERİ
        User user = new User();
        UserManager userManager = new UserManager();
        userManager.login(user);
        userManager.logOut(user);
        userManager.editProfile(user);
        userManager.addAddress(user);
        userManager.contact(user);
        
        //STUDENT MANAGER DENEMELERİ
        StudentManager studentManager = new StudentManager();
        studentManager.addCourse();
        studentManager.removeCourse();
        studentManager.takeAttendance();
        studentManager.addCardorChange();
        studentManager.viewCourseSchedule();
        studentManager.comment();
        studentManager.finishAndContinue();
        
        //INSTRUCTOR MANAGER DENEMELERİ
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.viewStudents();
        instructorManager.addRecord();
        instructorManager.takeAttendance();
        instructorManager.uploadHomework();
        instructorManager.sendAnnouncement();
        
        

        
        
    }
    
}
