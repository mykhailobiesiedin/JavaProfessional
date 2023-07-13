package homework9;

import java.util.*;

public class FindTheWay {
    public static final Map<String, String> tickets = new HashMap<>();

    public static void main(String[] args) {

        tickets.put("Berlin", "London");
        tickets.put("Tokyo", "Seoul");
        tickets.put("Mumbai", "Berlin");
        tickets.put("Seoul", "Mumbai");

        List<String> way = new ArrayList<>();
        String startCity = startCity(tickets);
        String endCity = null;
        way.add(startCity);
        for (int i = 0; i < tickets.size(); i++) {
            endCity = tickets.get(startCity);
            way.add(endCity);
            startCity = endCity;
        }
        System.out.println(way);
    }
    public static String startCity(Map<String, String> ticket) {
        Set<String> keys = tickets.keySet();
        String way = null;
        for (String key : keys) {
            if (!tickets.containsValue(key)) {
                return key;
            }
        }
        return null;
    }
}
