package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) throws  FileNotFoundException {
        first();
    }
    public static void first() {
        second();
    }

    public static void second(){
        try {
            third();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void third() throws  FileNotFoundException{
        fourth();
    }
    public static void fourth() throws FileNotFoundException {
        FileReader fileReader = new FileReader("t.txt");
    }
}
