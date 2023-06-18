package lesson6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lesson6 {
    public static void main(String[] args) {
//        ***Task 1***
//        Set<String> colors = new HashSet<>();
//        colors.add("blue");
//        colors.add("red");
//        colors.add("yellow");
//        colors.add("orange");
//        colors.add("green");
//        colors.add("purple");
//        colors.add("while");
//
//        for(String color: colors){
//            System.out.println(color);
//        }

        List<String> badComplimentsFromLera = new ArrayList<>();
        badComplimentsFromLera.add("Злой");
        badComplimentsFromLera.add("Жестокий");

//        for(int i= 0; i< badComplimentsFromLera.size(); i++){
//            System.out.println("Misha : " + badComplimentsFromLera.get(i));
//        }
        List<String> goodComplimentsFromLera = new ArrayList<>();

        System.out.println("Misha : " + badComplimentsFromLera);
        System.out.println("Misha : " + goodComplimentsFromLera);
    }
}
