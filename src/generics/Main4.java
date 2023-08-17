package generics;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Vehicle> hangar = new ArrayList<>();

        hangar.add(new Aircraft());
        hangar.add(new Boat());
        hangar.add(new Honda());

        List<Honda> garage = new ArrayList<>();

        garage.add(new Honda());
        garage.add(new Honda());
        garage.add(new Honda());

        System.out.println("Hangar : " + hangar);
        System.out.println("Garage : " + garage);

        VehicleUtils.moveVehicles(garage, hangar);

        System.out.println("Hangar : " + hangar);
        System.out.println("Garage : " + garage);

        List<Car> parking = new ArrayList<>();
        List<Toyota> toyotaGarage = new ArrayList<>();

        VehicleUtils.moveVehicles(toyotaGarage, parking);

    }
}
