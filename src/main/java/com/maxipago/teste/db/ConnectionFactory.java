package com.maxipago.teste.db;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jose San Pedro
 */
@RequestScoped
public class ConnectionFactory {

    private Connection connection;

    @PostConstruct
    public void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "****";
            String password = "****";
            String connURL = "****";
            connection = DriverManager.getConnection(connURL, user, password);
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException: " + ex.getMessage());
        }
    }

    @PreDestroy
    private void closeConnection() throws SQLException {
        if (!connection.isClosed()) {
            connection.close();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
