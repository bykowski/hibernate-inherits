package hib;

import hib.JOINED.Computer;
import hib.JOINED.Device;
import hib.JOINED.Mobilephone;
import hib.SINGLE_TABLE.Football;
import hib.SINGLE_TABLE.Running;
import hib.SINGLE_TABLE.Sport;
import hib.TABLE_PER_CLASS.Animal;
import hib.TABLE_PER_CLASS.Pet;
import hib.TABLE_PER_CLASS.Wild;

public class App {

    public static void main(String[] args) {

        // SINGLE_TABLE example
        Football football = new Football();
        football.setTeamSize(25);

        Running running = new Running();
        running.setDistance(10);

        Dao<Sport> sportDao = new Dao<>();
        sportDao.add(football);
        sportDao.add(running);

        // TABLE_PER_CLASS
        Pet pet = new Pet();
        pet.setLegs(4);
        pet.setName("Pucek");

        Wild wild = new Wild();
        wild.setLegs(3);
        wild.setAggressionLevel(10);

        Dao<Animal> daoAnimal = new Dao<>();
        daoAnimal.add(pet);
        daoAnimal.add(wild);

        // JOINED
        Computer computer = new Computer();
        computer.setSize(15);
        computer.setPrice(1);

        Mobilephone mobilephone = new Mobilephone();
        mobilephone.setMobileRange(10);
        mobilephone.setPrice(10);

        Dao<Device> daoDevice = new Dao<>();
        daoDevice.add(computer);
        daoDevice.add(mobilephone);
    }

}
