package exceptions;

public class TooSmallAgeException extends RuntimeException{

    public TooSmallAgeException(String s) {
        super(s);
    }
}
