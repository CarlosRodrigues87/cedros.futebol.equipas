/**
 * Android application for cedros futebol equipas 21 de Mai de 2015
 */
package cedros.futebol.equipas.objects;

import java.io.Serializable;

/**
 * @author Carlos
 * 
 * @version 1.0
 * 
 * @date 21 de Mai de 2015
 */
public class PlayerList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7094190328565319315L;

	private String player;

	private int strength;

	public PlayerList() {

	}

	public PlayerList(String player, int strength) {
		super();
		this.player = player;
		this.strength = strength;

	}

	/**
	 * @return the player
	 */
	public String getPlayer() {
		return player;
	}

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param player
	 *            the player to set
	 */
	public void setPlayer(String player) {
		this.player = player;
	}

	/**
	 * @param strength
	 *            the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

}
