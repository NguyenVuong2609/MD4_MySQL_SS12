package rikkei.academy.model;

import java.util.HashSet;
import java.util.Set;

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String avatar = "https://firebasestorage.googleapis.com/v0/b/vuongcuti-6ce58.appspot.com/o/images.png?alt=media&token=21127bb0-3074-47bd-ab28-126c4a7799e9";
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(int id, String name, String username, String email, String password, String avatar, Set<Role> roles) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.roles = roles;
    }

    public User(String name, String username, String email, String password, Set<Role> roleSet) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roleSet;
    }

    public User(int id, String name, String avatar, Set<Role> roleSet) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.roles = roleSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
