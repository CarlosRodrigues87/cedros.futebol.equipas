package cedros.futebol.equipas.objects;

import java.io.Serializable;

/**
 * Created by Carlos Rodrgues on 18/06/2015.
 *
 * @version 1.0
 */
public class TeamRelPlayer implements Serializable {

    private TeamColor teamColor;
    //apontar para playerList(?)

    /**
     * Constructor
     */
    public TeamRelPlayer() {
        super();
    }

    /**
     * @return teamColor
     */
    public TeamColor getTeamColor() {
        return teamColor;
    }

    /**
     * @param teamColor
     */
    public void setTeamColor(TeamColor teamColor) {
        this.teamColor = teamColor;
    }

}
