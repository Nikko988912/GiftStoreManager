package Geography;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Continent {
    public static void main(String[] args) {
        List<String> continents = Arrays.asList("Europe", "Asia", "Africa", "Australia", "Antarctica", "South America", "North America");

        List<String> filteredContinents = continents.stream()
                .filter(continent -> continent.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filteredContinents);
    }
}

