package lambdas1;

import java.util.function.ToDoubleBiFunction;

public class Calculator {
    Double arg1;
    Double arg2;
    Double result;

    public void inputArgumanets(Double arg1, Double arg2){
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public void validateArguments(){
        if (arg1 == null || arg2 == null){
            System.out.println("Значение аргументов не валидно");
        }
    }

//    public Double sum(){
//        result = arg1 + arg2;
//        return result;
//    }

//    public void pow(){
//        result = Math.pow(arg1, arg2);
//    }

    public void makeOperation(ToDoubleBiFunction<Double, Double> operation){
        result = operation.applyAsDouble(arg1, arg2);
    }
    public void printResult(){
        System.out.println("Your result : " + result);
    }
}
