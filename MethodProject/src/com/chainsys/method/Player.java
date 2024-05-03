package com.chainsys.method;

public class Player {
	String name;
	int score;
	int levelCompleted;
	int bonus;
	boolean gameOver;
	
	public Player(String name,int score, int levelCompleted, int bonus, boolean gameOver) {
		super();
		this.name= name;
		this.score = score;
		this.levelCompleted = levelCompleted;
		this.bonus = bonus;
		this.gameOver = gameOver;
	}
	
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	public int getLevelCompleted() {
		return levelCompleted;
	}
	public int getBonus() {
		return bonus;
	}
	public boolean isGameOver() {
		return gameOver;
	}

	@Override
	public String toString() {
		return name+" you Managed to get into the ";
	}
	
}
