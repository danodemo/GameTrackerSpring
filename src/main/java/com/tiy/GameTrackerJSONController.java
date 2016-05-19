package com.tiy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GameTrackerJSONController {

    @Autowired
    GameRepository games;
    @Autowired
    UserRepository users;

        @RequestMapping(path = "/games.json", method = RequestMethod.GET)
        public ArrayList<Game> jsonHOME() {

            ArrayList<Game> gameList = new ArrayList<Game>();
            Iterable<Game> allGames = games.findAll();
            for (Game game : allGames) {
                gameList.add(game);
            }

            return gameList;
        }

        @RequestMapping(path = "/users.json", method = RequestMethod.GET)
        public ArrayList<User> jsonUserHome() {

            ArrayList<User> userList = new ArrayList<User>();
            Iterable<User> allUsers = users.findAll();
            for (User user : allUsers) {
                userList.add(user);
            }

            return userList;
        }
    }
