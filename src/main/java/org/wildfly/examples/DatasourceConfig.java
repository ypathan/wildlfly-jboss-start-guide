package org.wildfly.examples;

import jakarta.annotation.Resource;
import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DatasourceConfig {

    @Resource(lookup = "java:jboss/datasources/PostgresDS")
    private DataSource dataSource;

    public void processData() {
        try (Connection conn = dataSource.getConnection()) {
            System.out.println("Successfully connected to PostgreSQL via WildFly using Jakarta EE!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}