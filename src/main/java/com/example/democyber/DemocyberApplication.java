package com.example.democyber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
   public class DemocyberApplication {

       private static final String GITHUB_TOKEN = "ghp_1234567890abcdef1234567890abcdef1234";

       public static void main(String[] args) {
           SpringApplication.run(DemocyberApplication.class, args);
       }
   }
