package com.tiy;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue
    public int id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String platform;

    @Column(nullable = false)
    public String genre;

    @Column(nullable = false)
    public int releaseYear;


    @ManyToOne
    public User user;

    public Game() {
    }

    public Game(String name, String platform, String genre, int releaseYear, User user) {
        this.name = name;
        this.platform = platform;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.user = user;
    }
}