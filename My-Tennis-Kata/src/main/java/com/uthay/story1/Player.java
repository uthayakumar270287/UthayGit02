package com.uthay.story1;

import java.util.Arrays;
import java.util.List;
//Tournament Player
public class Player {

	public static final List<String> points = Arrays.asList("0", "15", "30", "40", "Win");

	private int score;
	String name;
	int win = 0; //0 -> Tournament On, 1 -> Player 1 Won, 2 -> Player 2 Won 

	public Player(String name) {
		this.name = name;
		this.score = 0;
		this.win = 0;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public void win() {
		if(win == 0 )
		this.score = this.score + 1;
	}

	public String getPoints() {
		return points.get(score);
	}

}