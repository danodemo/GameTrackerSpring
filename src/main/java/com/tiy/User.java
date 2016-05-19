package com.tiy;

import javax.persistence.*;

@Entity
    @Table(name = "users")
    public class User {
        @Id
        @GeneratedValue
        public int id;

        @Column(nullable = false, unique = true)
        public String name;

        @Column(nullable = false)
        public String password;

        public User() {
        }

        public User(String name, String passord){
            this.name = name;
            this.password = passord;
        }
    }


