package Liam.season2;

import java.util.*;

public class collections_java {
    static void main(String[] args) {
       /* Collections */
        List<String> moreQuestions = new ArrayList<>();
        moreQuestions.add("Skibidi toilet"); // index 0
        moreQuestions.clear(); // clears the list, now its empty

        List<Integer> points = new ArrayList<>(); // we have to use INTEGER instead of int
        points.add(19);

        // SETS are lists that cant contain duplicates
        Set<String> countries = new HashSet<>();
        countries.add("Japan");
        countries.add("Japan"); // duplicate on a Set
        countries.add("Norway");

        System.out.println(countries); // prints only 1 Japan

        // Maps links one thing to another
        Map<String, Integer> countriesToPopulation = new HashMap<>();
        countriesToPopulation.put("USA", 331000000); // PUT instead of ADD
        countriesToPopulation.put("japan", 67); // PUT instead of ADD
        countriesToPopulation.put("brasil", 211000000); // PUT instead of ADD
        // works with key and values!

        System.out.println(countriesToPopulation.get("USA")); // you pass in the key to get the result
        System.out.println(countriesToPopulation.get("Germany")); // Germany is not in the list: null
        System.out.println(countriesToPopulation.get("JAPAN")); // key is CaseSensitive, output: null
        System.out.println(countriesToPopulation); // prints the whole map

        // How to loop through maps
        for (Map.Entry<String, Integer> entry : countriesToPopulation.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " | Value = " + entry.getValue());
        }
    }
}
