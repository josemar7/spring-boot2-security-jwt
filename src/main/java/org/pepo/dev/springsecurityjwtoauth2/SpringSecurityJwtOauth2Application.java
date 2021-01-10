package org.pepo.dev.springsecurityjwtoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity(debug = true)
public class SpringSecurityJwtOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtOauth2Application.class, args);
    }

}
