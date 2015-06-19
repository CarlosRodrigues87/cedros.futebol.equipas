package cedros.futebol.equipas.objects;

import java.io.Serializable;

/**
 * Created by Carlos Rodrgues on 18/06/2015.
 *
 * @version 1.0
 */
public class TeamColor implements Serializable {

    /**
     *
     */
    private String teamColor;

    /**
     * Contructor
     */
    public TeamColor() {
        super();
    }

    /**
     * @return teamColor
     */
    public String getTeamColor() {
        return teamColor;
    }

    /**
     * @param teamColor
     */
    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
    }


}
