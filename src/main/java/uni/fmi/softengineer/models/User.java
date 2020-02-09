package uni.fmi.softengineer.models;


import java.util.*;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param username
     * @return 
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param password
     * @return 
     */
    public String getPassword() {
        return password;
    }

}
