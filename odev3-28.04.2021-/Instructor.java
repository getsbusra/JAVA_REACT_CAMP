package odev3;

public class Instructor extends User {
    
   
    private int userID;
    private String userName;
    private String userPassword;
    private String myCourses;
    private String myStudents;
    
     public Instructor() {
         
     }
     public Instructor(int userID, String userName, String userPassword, String myCourses, String myStudents) {
        super(userID, userName, userPassword, myCourses);
        this.myStudents = myStudents;
       
        
    }


    public int getUserID() {
        return userID;
    }


    public void setUserID(int userID) {
        this.userID = userID;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserPassword() {
        return userPassword;
    }


    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public String getMyCourses() {
        return myCourses;
    }


    public void setMyCourses(String myCourses) {
        this.myCourses = myCourses;
    }


    public String getMyStudents() {
       
        return myStudents;
    }


    public void setMyStudents(String myStudents) {
        this.myStudents = myStudents;
    }


     
    
    
    
}
