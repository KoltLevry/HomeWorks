package homework_41.task_4;

import java.util.*;

public class Road {

    private static final int arraysSize = 5000;
    private static final int addNewValues = 2000;
    private static final int deleteValues = 1000;
    private static final Random random = new Random();

    public static void main(String[] args) {
        Map<String, String> directFlights = new HashMap<>();
        directFlights.put("New York", "Chicago");
        directFlights.put("Chicago", "Denver");
        directFlights.put("Denver", "Las Vegas");
        directFlights.put("Boston", "Miami");
        directFlights.put("Miami", "New York");
        directFlights.put("Los Angeles", "San Francisco");
        directFlights.put("San Francisco", "New York");

        List<String> route = findRoute(directFlights, "Boston", "Las Vegas");
        System.out.println(route);

        List<String> route2 = findRoute(directFlights, "Boston", "New York");
        System.out.println("Вывод: " + route2);


        List<String> route3 = findRoute(directFlights, "Boston", "San Francisco");
        System.out.println("Вывод: " + route3);
    }

    public static List<String> findRoute(Map<String, String> flights, String start, String end) {

        List<String> route = new ArrayList<>();
        String currentCity = start;

        while (currentCity != null) {
            route.add(currentCity);
            if (currentCity.equals(end)) {
                return route;
            }
            currentCity = flights.get(currentCity);
        }


        return Collections.emptyList();
    }
}
