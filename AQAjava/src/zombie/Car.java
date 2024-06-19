package zombie;

public class Car<T> {

    private T policemanDriver;

    public Car(T policemanDriver) {
        this.policemanDriver = policemanDriver;
    }


    public void setPolicemanDriver(T policemanDriver) {
        this.policemanDriver = policemanDriver;
    }

    public T getPolicemanDriver() {
        return policemanDriver;
    }
}
