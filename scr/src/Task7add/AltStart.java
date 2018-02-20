package Task7add;

import Task7.*;

public class AltStart {

    public static void main(String[] args) {

        Car car = new Car();
        Train train = new Train();
        AirJet airJet = new AirJet();
        SignalOfVehicle signal = new SignalOfVehicle();

        Vehicle [] vehicles = new Vehicle[] {car, train, airJet};
        for (Vehicle v: vehicles) {
            signal.callOfSignal(v);
        }

    }

}
