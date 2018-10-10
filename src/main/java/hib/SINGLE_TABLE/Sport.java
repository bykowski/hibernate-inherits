package hib.SINGLE_TABLE;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "d_type")
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int numberOfPlayers;

    public Sport() {
    }

    public Sport(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}
