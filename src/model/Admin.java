package model;

public class Admin extends User {

    public Admin(Long id, String username) {
        super(id, username);
    }

    @Override
    public void login() {
        System.out.println("Admin login");
    }

    public void deleteUser() {
        System.out.println("User deleted by admin");
    }
}