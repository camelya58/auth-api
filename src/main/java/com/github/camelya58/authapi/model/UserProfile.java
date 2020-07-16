package com.github.camelya58.authapi.model;

/**
 * Class UserProfile ia a POJO-object.
 *
 * @author Kamila Meshcheryakova
 * created 16.07.2020
 */
@SuppressWarnings("unused")
public class UserProfile {

    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserProfile [name=" + name + ", email=" + email + "]";
    }
}
