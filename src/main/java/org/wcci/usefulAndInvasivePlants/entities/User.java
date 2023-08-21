package org.wcci.usefulAndInvasivePlants.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// should we add age as a field??? 
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @Id
    @GeneratedValue
    private Long userID; /// should I use Int here instead?
    private String email;
    private String firstName;
    private String userName;
    private String passWord;
    @Convert(converter = StringListConverter.class)
    private List<String> savedPlants;

    // is line 12-15 a constructor? if not what is a constructor and where is it
    public User(Long id, String email, String firstName, String userName, String passWord) {
        this.userID = id;
        this.email = email;
        this.firstName = firstName;
        this.userName = userName;
        this.passWord = passWord;
    }

    public User() {
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long user_id) {
        this.userID = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<String> getSavedPlants() {
        if (savedPlants == null) {
            return new ArrayList<String>();
        }
        return savedPlants;
    }

    public void setSavedPlants(List<String> savedPlants) {
        this.savedPlants = savedPlants;
    }

}