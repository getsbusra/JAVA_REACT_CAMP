

public class StudentManager {
    public void addCourse(){
        String courseToAdd = "Python Kursu";
        System.out.println(courseToAdd + " Kurs Başarıyla Eklendi."); 


    }

    public void removeCourse() {
        String courseToBeDeleted = "PHP Kursu";
        System.out.println(courseToBeDeleted + "Kurs Başarıyla Silindi..");

    }

    

    public void takeAttendance(Student student) {
        System.out.println(student.getUserName() + " Yoklamasi basariyla Alındı");


    }

    public void addCardorChange() {
        String newCard = "Kart No : 12345678911";
        System.out.println( newCard + " Nolu kartınız Başarıyla Eklendi.");

    }

    public void viewCourseSchedule () {
        String[] courseSchedule = {"1.GUN : TANISMA","2.GUN : OOP TEMELLERİ","3.GUN : CONSTRUCTORS"};
        System.out.println(courseSchedule);
}

    public void comment() {
        String comment = "Harika bir dersti!";
        System.out.println(comment + " yorumunuz başarıyla gönderildi.");

    }

    public void finishAndContinue() {

        System.out.println("SONRAKI GUN");

        
    }
}
