package hib.SINGLE_TABLE;

import javax.persistence.Entity;

@Entity
public class Running extends Sport {

    private long distance;


    public Running() {
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }
}
