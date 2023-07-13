package lambdas1;

import java.util.function.ToDoubleBiFunction;

public class SumOperation implements ToDoubleBiFunction<Double,Double> {

    @Override
    public double applyAsDouble(Double aDouble, Double aDouble2) {
        return aDouble + aDouble2;
    }
}
