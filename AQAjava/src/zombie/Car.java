package zombie;

public class Car {
    private ZombieSherif policemanDriver;

    public Car(ZombieSherif policemanDriver) {
        this.policemanDriver = policemanDriver;
    }


    public void setPolicemanDriver(ZombieSherif policemanDriver) {
        this.policemanDriver = policemanDriver;
    }

    public ZombieSherif getPolicemanDriver() {
        return policemanDriver;
    }
}
