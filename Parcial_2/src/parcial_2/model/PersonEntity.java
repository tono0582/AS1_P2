package parcial_2.model;

import java.util.*;

/**
 * 
 */
public class PersonEntity {


    public PersonEntity() {
    }

    private int id;

    private String personName;

    private int role;

    private String email;

    private String password;


    public int getId() {
        // TODO implement here
        return id;
    }


    public void setId(int id) {
        // TODO implement here
        this.id=id ;
    }


    public String getPersonName() {
        // TODO implement here
        return personName;
    }


    public void setPersonName(String personName) {
        // TODO implement here
        this.personName=personName ;
    }

    public int getRole() {
        // TODO implement here
        return role;
    }


    public void setRole(int role) {
        // TODO implement here
        this.role=role ;
    }


    public String getEmail() {
        // TODO implement here
        return email;
    }


    public void setEmail(String email) {
        // TODO implement here
        this.email=email ;
    }


    public String getPassword() {
        // TODO implement here
        return password;
    }


    public void setPassword(String password) {
        // TODO implement here
        this.password=password ;
    }

}