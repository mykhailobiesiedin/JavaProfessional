package generics;

import java.util.ArrayList;
import java.util.List;

public class Box1<T> {

    List<T> items = new ArrayList<>();

    public  void putItem(T item){
        items.add(item);
    }
    public T getItem(){
        return items.remove(0);
    }

}
