package task1lottery;

import java.time.LocalDateTime;

public class Starter {
    public static void main(String[] args) {
        Lottery totolotek = new Lottery("Totolotek", 3);
        totolotek.addPlayer(new Player("Kamila", 10));
        totolotek.addPlayer(new Player("Ktos", 20));

        Player player = new Player("Damian", 20);
        totolotek.addPlayer(player);

        System.out.println(totolotek.lottery());
    }
}
