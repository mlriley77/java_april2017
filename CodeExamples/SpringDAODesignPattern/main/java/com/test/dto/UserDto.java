package com.test.dto;

/**
 * Created by maurice on 5/9/17.
 */
public class UserDto {
    public String firstName;
    public String lastName;

    /*
    * Default constructor
     */
    public UserDto() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
