package model;

public class Game {
    private final String gameName;

    private final String playerName;

    private final Field field;

    public Game(String gameName, String playerName, Field field) {
        this.gameName = gameName;
        this.playerName = playerName;
        this.field = field;
    }



}
