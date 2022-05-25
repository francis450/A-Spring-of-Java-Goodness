package com.In20Minutes.learning.maven.maveninfewsteps.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
    public JdbcConnection(){
        System.out.println("JDBC Connection");
    }
}
