package com.assignment.repository;

import com.assignment.models.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {
    private Connection connection;
    public UserRepository(Connection connection){
        this.connection = connection;
    }

    public boolean createUser(User user) throws SQLException {
        String queryToInsert = "insert into user_table values(?,?,?)";
        PreparedStatement pstmt = connection.prepareStatement(queryToInsert);

        //Set the parameters for the placeholders
        pstmt.setString(1,user.getName());
        pstmt.setDate(2, (Date) user.getDateOfBirth());
        pstmt.setString(3,user.getAddress());

        return pstmt.execute();
    }
}
