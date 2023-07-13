package lambdas1;

import java.util.function.ToDoubleBiFunction;

public class PowOperation implements ToDoubleBiFunction<Double,Double> {

    @Override
    public double applyAsDouble(Double aDouble, Double aDouble2) {
        return Math.pow(aDouble, aDouble2);
    }
}
