package hib.TABLE_PER_CLASS;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wild extends Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int aggressionLevel;

    public Wild() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAggressionLevel() {
        return aggressionLevel;
    }

    public void setAggressionLevel(int aggressionLevel) {
        this.aggressionLevel = aggressionLevel;
    }
}
