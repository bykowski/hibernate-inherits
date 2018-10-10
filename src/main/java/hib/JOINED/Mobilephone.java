package hib.JOINED;

import javax.persistence.Entity;

@Entity
public class Mobilephone extends Device {

    private long mobileRange;

    public Mobilephone() {
    }

    public long getMobileRange() {
        return mobileRange;
    }

    public void setMobileRange(long mobileRange) {
        this.mobileRange = mobileRange;
    }
}
