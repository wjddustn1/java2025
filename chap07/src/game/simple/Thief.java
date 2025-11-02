package game.simple;

import java.util.Random;

public class Thief extends Enemy {
    private int money;
    private int reward;
    private int winRatio;

    public Thief(int money, int reward, int winRatio) {
        this.money = money;
        this.reward = reward;
        this.winRatio = winRatio;
    }

    public void attack(Player player) {
        Random rand = new Random();
        int val = rand.nextInt(100);

        if (val < winRatio) {
            System.out.println("Thief Win");
            damage(player);
        } else {
            System.out.println("Player Win");
            rewardPlayer(player);
        }
    }

    private void damage(Player player) {
        player.money -= money;
        if (player.money < 0) {
            player.money = 0;
        }
    }

    private void rewardPlayer(Player player) {
        player.money += reward;
    }
}
