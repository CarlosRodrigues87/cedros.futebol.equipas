package cedros.futebol.equipas.objects;

import java.io.Serializable;

/**
 * Created by Carlos on 18/06/2015.
 */
public class Player  implements Serializable {

    private String playerName;
    private Integer strength;

    /**
     * Constructor
     */
    public Player() {
        super();
    }

    /**
     * Constructor
     * @param playerName
     * @param strength
     */
    public Player(String playerName, Integer strength) {
        this.playerName = playerName;
        this.strength = strength;
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

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("Player{playerName='%s', strength=%d}", playerName, strength);
    }
}
