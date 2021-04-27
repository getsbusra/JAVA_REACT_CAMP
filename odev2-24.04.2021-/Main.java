import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Category category1 = new Category(1,"Programlama",3);
        Instructor instructor1 = new Instructor(1,"Engin Demiroğ");
        Courses courses1 = new Courses(1,"C#/ANGULAR","Engin Demirog");
        Courses courses2 = new Courses(2,"JAVA/REACT","Engin Demirog");
        Courses courses3 = new Courses(3, "PROGRAMLAMAYA GIRIS TEMEL KURS", "Engin Demirog");

        Category[] category = {category1};
        Instructor[] instructor = {instructor1};
        Courses[] courses = {courses1,courses2,courses3};

        System.out.println("------KATEGORILER------");
        for (Category categoryFor : category ) {
            System.out.println("id: " + categoryFor.id + 
            "\nKategori Adı: "+ categoryFor.name +
            "\nKurs Sayısı: " + categoryFor.numberOfCourse + "\n");
            
        }
        System.out.println("------EGITMENLER------");
        for (Instructor instructorFor : instructor) {
            System.out.println("id : " + instructorFor.id + 
            "\nEğitmen Adı: " + instructorFor.name + "\n");
            
        }
        System.out.println("------KURSLAR------");
        for (Courses coursesFor : courses) {
            System.out.println("id : " + coursesFor.id + 
            "\nKurs Adı : " + coursesFor.name + 
            "\nEğitmen :" + coursesFor.instructorName + "\n");
         }
        CategoryManager categoryManager = new CategoryManager();
        CoursesManager coursesManager = new CoursesManager();
        InstructorManager instructorManager = new InstructorManager();

        System.out.println("----MENU----\n1-Kategori Ekle\n2-Kategori Sil\n3-Kurs Ekle\n4-Kurs Sil\n5-Eğitmen Ekle\n6-Eğitmen Sil");
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        if(secim == 1) { //Kategori Ekle
            System.out.println("Eklemek Istediginiz Kategori ID'si:");
            int id = scan.nextInt();
            System.out.println("Eklemek Istediginiz Kategori Adı:");
            String name = scan.nextLine();
            System.out.println("Kategorideki Kurs Sayısı:");
            int numberOfCourse = scan.nextInt();
            categoryManager.addCategory(id, name, numberOfCourse);
            
        }
        else if (secim == 2) { //Kategori Sil
            System.out.println("Silmek Istediginiz Kategori ID'si:");
            int id = scan.nextInt();
            System.out.println("Silmek Istediginiz Kategori Adı:");
            String name = scan.nextLine();
            categoryManager.removeCategory(id, name);


        }
        else if(secim == 3) { //Kurs Ekle
            System.out.println("Eklemek Istediginiz Kurs ID'si:");
            int id = scan.nextInt();
            System.out.println("Eklemek Istediginiz Kurs Adı:");
            String name = scan.nextLine();
            System.out.println("Eğitmen Adı:");
            String instructorName = scan.nextLine();
            coursesManager.addCourses(id,name,instructorName);


        }
        else if(secim == 4) { //Kurs Sil
            System.out.println("Silmek Istediginiz Kurs ID'si:");
            int id = scan.nextInt();
            System.out.println("Silmek Istediginiz Kurs Adı:");
            String name = scan.nextLine();
            coursesManager.removeCourses(id, name);

        }
        else if(secim  == 5) { //Eğitmen Ekle
            System.out.println("Eklemek Istediginiz Eğitmen ID'si:");
            int id = scan.nextInt();
            System.out.println("Eklemek Istediginiz Eğitmen Adı:");
            String name = scan.nextLine();
            instructorManager.addInstructor(id, name);

        }
        else if(secim == 6) { //Eğitmen Sil
            System.out.println("Silmek Istediginiz Eğitmen ID'si:");
            int id = scan.nextInt();
            System.out.println("Silmek Istediginiz Eğitmen Adı:");
            String name = scan.nextLine();
            instructorManager.removeInstructor(id, name);

        }
        else {
            System.out.println("Lutfen Gecerli Bir Islem Seciniz.");
        }
     }

}
