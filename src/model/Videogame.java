package model;

import java.util.ArrayList;

public class Videogame {
    private String name;
    private String idGame;
    private Player[] listplayer = new Player[20];
    private ArrayList<Player> players;

    Videogame(String name, String idGame){
        this.name=name;
        this.idGame=idGame;
    }

    public boolean addPlayer(Player newPlayer){
        boolean status = false;
        if (players.add(newPlayer)){
            status=true;
            players.add(newPlayer);
        }
        return status;
    }
//Caremonda
}