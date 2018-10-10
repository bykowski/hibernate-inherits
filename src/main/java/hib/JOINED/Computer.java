package hib.JOINED;

import javax.persistence.Entity;

@Entity
public class Computer extends Device {

    private long size;

    public Computer() {
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
