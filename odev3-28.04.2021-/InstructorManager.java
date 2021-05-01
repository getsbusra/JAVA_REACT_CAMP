package odev3;

public class InstructorManager {

    public void viewStudents(Instructor instructor) {
        System.out.println(" OGRENCILERIM : " + instructor.getMyStudents());
  }
 
     public void addRecord() {
        String newRecord = "3.GUN KAYDI : OOP GIRIS";
        System.out.println(newRecord + " Adli Kaydiniz Sisteme Basariyla Eklenmistir...");
 
     }
 
     public void takeAttendance() {
        String attendance = "4.GUN YOKLAMASI";
        System.out.println(attendance + " Sisteme Yuklenmistir");
     }
 
     public void uploadHomework() {
        String newHomework = "4.ODEV KODLAMA.IO SIMULASYONU";
        System.out.println(newHomework + " Adlı Odev Sisteme Yuklenmistir..");
     }
 
     public void sendAnnouncement() {
        String newAnnouncement = "DERSLER RAMAZANDA 9.30'DA BASLAYACAKTIR";
        System.out.println(newAnnouncement + " Yayinlanmistir..");
     }
    
}
