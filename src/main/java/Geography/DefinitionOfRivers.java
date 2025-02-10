package Geography;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DefinitionOfRivers {
    public static void main(String[] args) {
        List<String> rivers = Arrays.asList("Amazon", "Nile", "Yangtze", "Mississippi", "Danube", "Main", "Ganges");

        List<String> longRivers = rivers.stream()
                .filter(river -> river.length() > 7)
                .collect(Collectors.toList());

        System.out.println(longRivers);
    }
}

