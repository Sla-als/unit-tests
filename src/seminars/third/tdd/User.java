package seminars.third.tdd;

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;

    }

    public boolean authenticate(String name, String password) {
        return false;
    }

    public void logOut() {
        //..
    }
}












//boolean isAdmin;

//    public boolean authenticate(String name, String password) {
//        if (name.equals(this.name) && password.equals(this.password)) {
//            isAuthenticate = true;
//            return true;
//        } else {
//            isAuthenticate = false;
//            return false;
//        }
//    }
//
//    public void logOut() {
//        this.isAuthenticate = false;
//    }

// РЕШЕНИЕ ДЗ
//    public User(String name, String password, boolean isAdmin) {
//        this.name = name;
//        this.password = password;
//        this.isAdmin = isAdmin;
//    }


//   boolean isAdmin;


//    public void logoutAllExceptAdmins() {
//        for (User user : users) {
//            if (!user.isAdmin()) {
//                user.logOut();
//            }
//        }
//    }
