package cedros.futebol.equipas.objects;

import java.io.Serializable;

/**
 * Created by Carlos Rodrigues on 18/06/2015.
 *
 * @version 1.0
 */
public class Player implements Serializable {

    private String playerName;
    private Integer strength;
    private Integer dateBirth;


    private Integer tshirtNumber;

    /**
     * Constructor
     */
    public Player() {
        super();
    }

    /**
     * Constructor
     *
     * @param playerName
     * @param strength
     */
    public Player(String playerName, Integer strength) {
        this.playerName = playerName;
        this.strength = strength;
    }

    /**
     * Constructor
     *
     * @param playerName
     * @param strength
     * @param dateBirth
     * @param tshirtNumber
     */
    public Player(String playerName, Integer strength, Integer dateBirth, Integer tshirtNumber) {
        this.playerName = playerName;
        this.strength = strength;
        this.dateBirth = dateBirth;
        this.tshirtNumber = tshirtNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Integer dateBirth) {
        this.dateBirth = dateBirth;
    }


    @Override
    public String toString() {
        return String.format("Player{playerName='%s', strength=%d, dateBirth=%d, tshirtNumber=%d}", playerName, strength, dateBirth, tshirtNumber);
    }


}
