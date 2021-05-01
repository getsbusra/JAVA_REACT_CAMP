package odev3;

public class User {
    
    private int userID;
    private String userName;
    private String userPassword;
    private String myCourses;

    public User() {
    }
    public User(int userID, String userName, String userPassword, String myCourses) {
        this.userID = userID;
        this.userName = userName;
        this.userPassword = userPassword;
        this.myCourses = myCourses;
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
    
    

    
    
}
