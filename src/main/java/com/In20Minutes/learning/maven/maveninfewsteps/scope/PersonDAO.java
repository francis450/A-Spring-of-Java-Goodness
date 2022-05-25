package com.In20Minutes.learning.maven.maveninfewsteps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {

        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {

        this.jdbcConnection = jdbcConnection;
    }
}
