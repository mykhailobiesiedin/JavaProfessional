package i.o_lesson_1.task1;

public class SystemErrTest {
    public static void main(String[] args) {
        System.out.println(div(10, 2));

    }
    public static  int div(int x, int y){
        if (y ==0){
            System.err.println("Error , dividing for 0 is not possible");
            return -1;
        }
        return x/y;
    }
}
