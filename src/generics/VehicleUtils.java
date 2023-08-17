package generics;

import java.util.List;

public class VehicleUtils {
    //producer extends consumer super

    static void moveVehicles(List<? extends Car> from, List<? super Car> to){
        to.addAll(from);
        from.clear();
    }
}
