/**
 * Android application for cedros futebol equipas 21 de Mai de 2015
 */
package cedros.futebol.equipas.objects;

import java.io.Serializable;

/**
 * @author Carlos
 * @version 1.0
 * @date 21 de Mai de 2015
 */
public class Classification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3170637011201567514L;

	private int order;

	private String player;

	private int games;

	private int wins;

	private int draws;

	private int losses;

	private int percent;

	private int points;

	public Classification() {

	}

	public Classification(int order, String player, int wins, int losses) {
		super();
		this.order = order;
		this.player = player;
		this.wins = wins;
		this.losses = losses;
	}

	public Classification(int order, String player, int games, int wins,
			int draws, int losses, int percent) {
		super();
		this.order = order;
		this.player = player;
		this.games = games;
		this.wins = wins;
		this.draws = draws;
		this.losses = losses;
		this.percent = percent;
	}

	public Classification(int order, String player, int games, int wins,
			int draws, int losses, int percent, int points) {
		super();
		this.order = order;
		this.player = player;
		this.games = games;
		this.wins = wins;
		this.draws = draws;
		this.losses = losses;
		this.percent = percent;
		this.points = points;
	}

	public Classification(String player, int wins, int losses) {
		super();
		this.player = player;
		this.wins = wins;
		this.losses = losses;
	}

	public Classification(String player, int games, int wins, int draws,
			int losses) {
		super();
		this.player = player;
		this.games = games;
		this.wins = wins;
		this.draws = draws;
		this.losses = losses;
	}

	public Classification(String player, int games, int wins, int draws,
			int losses, int percent) {
		super();
		this.player = player;
		this.games = games;
		this.wins = wins;
		this.draws = draws;
		this.losses = losses;
	}

	/**
	 * @return the draws
	 */
	public int getDraws() {
		return draws;
	}

	/**
	 * @return the games
	 */
	public int getGames() {
		return games;
	}

	/**
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * @return the percent
	 */
	public int getPercent() {
		return percent;
	}

	/**
	 * @return the player
	 */
	public String getPlayer() {
		return player;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * @param draws
	 *            the draws to set
	 */
	public void setDraws(int draws) {
		this.draws = draws;
	}

	/**
	 * @param games
	 *            the games to set
	 */
	public void setGames(int games) {
		this.games = games;
	}

	/**
	 * @param losses
	 *            the losses to set
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}

	/**
	 * @param percent
	 *            the percent to set
	 */
	public void setPercent(int percent) {
		this.percent = percent;
	}

	/**
	 * @param player
	 *            the player to set
	 */
	public void setPlayer(String player) {
		this.player = player;
	}

	/**
	 * @param points
	 *            the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	/**
	 * @param wins
	 *            the wins to set
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String
				.format("Classification [order=%s, player=%s, games=%s, wins=%s, draws=%s, losses=%s, percent=%s, points=%s]",
						order, player, games, wins, draws, losses, percent,
						points);
	}

}
