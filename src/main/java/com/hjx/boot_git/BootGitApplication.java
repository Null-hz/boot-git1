package com.hjx.boot_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hjx")
public class BootGitApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootGitApplication.class, args);
    }

}
