package Geography;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CityFiltering {
    public static void main (String[] args) {
        List<String> cities = Arrays.asList("Tokyo", "Chicago", "Toronto", "Oslo", "Mexico", "Rio", "Moscow");

        List<String> filteredCities = cities.stream()
                .filter(city -> city.toLowerCase().endsWith("o"))
                .collect(Collectors.toList());

        System.out.println(filteredCities);
    }
}

