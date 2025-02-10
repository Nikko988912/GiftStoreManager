package Geography;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountryFiltering  {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Mexico", "Sweden", "Brazil", "Russia", "Canada", "France", "Norway");

        List<String> filteredCountries = countries.stream()
                .filter(country -> country.length() == 6)
                .collect(Collectors.toList());

        System.out.println(filteredCountries);
    }
}

