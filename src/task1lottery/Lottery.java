package task1lottery;

import java.util.Random;

public class Lottery {
    private String gameName;
    private Player[] names;
    private Random random;

    public Lottery(String gameName, int playersCount) {
        this.gameName = gameName;
        this.names = new Player[playersCount];
        this.random = new Random();
    }

    public void addPlayer(Player player){
        for (int i = 0; i < names.length; i++) {
             if(names[i] == null){
                 names[i] = player;
                 break;
             }
        }
    }

    public Player lottery(){
        return names[random.nextInt(names.length)];
    }
}
