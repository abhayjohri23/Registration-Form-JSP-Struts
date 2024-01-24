package com.assignment.action;

import com.assignment.models.User;
import com.assignment.repository.UserRepository;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

@Getter
@Setter
public class UserRegistration extends ActionSupport {
    private String name;
    private String address;
    private Date dob;

    public String execute(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/userformdb","postgres","admin123");
            boolean isUserCreated = new UserRepository(connection).createUser(new User(name,dob,address));
            return isUserCreated ? "success" : "error";

        } catch (SQLException e) {
            return "error";
        }
    }
}
