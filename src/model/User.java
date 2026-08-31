package model;

public abstract  class User {
    private Long id;
    private String username;

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public abstract void login();

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
