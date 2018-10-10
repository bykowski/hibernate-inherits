package hib.SINGLE_TABLE;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TeamPlay")
public class Football extends Sport {

    private int teamSize;

    public Football() {
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
