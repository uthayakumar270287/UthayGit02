package com.uthay.story1;

public class Tournament {

	private Player player1;
	private Player player2;

	public Tournament(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public String getScore() {

		/*
		 * if(player1.getWin() == 1) { return getLeadPlayer().getName() +
		 * " won"; } else if (player1.getWin() == 2) { return
		 * getLeadPlayer().getName() + " won"; }
		 */
		if (player1.getScore() > 3 || player2.getScore() > 3) {
			if (Math.abs(player2.getScore() - player1.getScore()) >= 2) {
				setPlayerWon();
				return getLeadPlayer().getName() + " Won";
			} else if (player1.getScore() == player2.getScore()) {
				return "Deuce";
			} else {
				return "Advantage " + getLeadPlayer().getName();
			}
		} else {
			return player1.getPoints() + ", " + player2.getPoints();
		}
	}

	public Player getLeadPlayer() {
		return (player1.getScore() > player2.getScore()) ? player1 : player2;
	}

	public void setPlayerWon() {
		if (player1.getScore() > player2.getScore()) {
			player1.setWin(1);
			player2.setWin(1);
		} else {
			player1.setWin(2);
			player2.setWin(2);
		}
	}

}
