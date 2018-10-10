package hib.JOINED;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Device() {
    }

}
