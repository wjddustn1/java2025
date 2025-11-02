package game.simple;

import java.util.*;

public class Dragon extends Enemy {
	int power;
	int reward;
	int winRatio;
	
	Dragon(int power, int reward, int winRatio){
		this.power = power;
		this.reward = reward;
		this.winRatio = winRatio;
	}
	
	void Attack(Player player) {
		Random rand = new Random();
		int val = rand.nextInt(100);
		
		if(val < 50) {
			System.out.println("Dragon Win");
			Damage(player);
		}
		else {
			System.out.println("Player Win");
			Reward(player);
		}
	}
	
	void Damage(Player player) {
		player.health -= power;
	}
	void Reward(Player player) {
		player.health += reward;
	}
}
