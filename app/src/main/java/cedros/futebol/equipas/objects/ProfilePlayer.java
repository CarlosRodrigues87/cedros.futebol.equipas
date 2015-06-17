/**
 * Android application for cedros futebol equipas 7 de Jun de 2015
 */
package cedros.futebol.equipas.objects;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Carlos
 * @version 1.0 @date 7 de Jun de 2015
 */
public class ProfilePlayer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2836374520342742593L;

	private PlayerList playerInfo;

	private String dateBirth;

	private int tshirtNumber;

	private Classification statisticInfo;

	/**
	 * 
	 */
	public ProfilePlayer() {

	}

	public ProfilePlayer(PlayerList playerInfo, int tshirtNumber,
			Classification statisticInfo) {
		this.playerInfo = playerInfo;
		this.tshirtNumber = tshirtNumber;
		this.statisticInfo = statisticInfo;
	}

	/**
	 * @return the dateBirth
	 */
	public String getDateBirth() {
		return dateBirth;
	}

	/**
	 * @return the playerInfo
	 */
	public PlayerList getPlayerInfo() {
		return playerInfo;
	}

	/**
	 * @return the statisticInfo
	 */
	public Classification getStatisticInfo() {
		return statisticInfo;
	}

	/**
	 * @return the tshirtNumber
	 */
	public int getTshirtNumber() {
		return tshirtNumber;
	}

	/**
	 * @param dateBirth
	 *            the dateBirth to set
	 */
	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	/**
	 * @param playerInfo
	 *            the playerInfo to set
	 */
	public void setPlayerInfo(PlayerList playerInfo) {
		this.playerInfo = playerInfo;
	}

	/**
	 * @param statisticInfo
	 *            the statisticInfo to set
	 */
	public void setStatisticInfo(Classification statisticInfo) {
		this.statisticInfo = statisticInfo;
	}

	/**
	 * @param tshirtNumber
	 *            the tshirtNumber to set
	 */
	public void setTshirtNumber(int tshirtNumber) {
		this.tshirtNumber = tshirtNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String
				.format("ProfilePlayer [playerInfo=%s, dateBirth=%s, tshirtNumber=%s, statisticInfo=%s]",
						playerInfo, dateBirth, tshirtNumber, statisticInfo);
	}

}
