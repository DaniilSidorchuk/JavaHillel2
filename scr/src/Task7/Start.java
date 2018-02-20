package Task7;

public class Start {

    public static void main(String[] args) {

        Car car = new Car();
        AirJet airJet = new AirJet();
        Train train = new Train();

        Vehicle [] vehicles = new Vehicle[]{car, airJet, train};

        for (Vehicle v: vehicles  ) {
            v.signal();
        }

    }

}
