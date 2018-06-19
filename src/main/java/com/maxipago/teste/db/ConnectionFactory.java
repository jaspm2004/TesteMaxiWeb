package com.maxipago.teste.db;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

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
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("jdbc/maxipagodb");
            connection = ds.getConnection();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (NamingException ex) {
            System.out.println("NamingException: " + ex.getMessage());
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
