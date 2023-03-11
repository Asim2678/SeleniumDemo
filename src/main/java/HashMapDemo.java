import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        //ket  // value pair
        HashMap<String, String> capitalCities = new HashMap<String ,String >();
        capitalCities.put("India", "Delhi");// this can be used for environment variables like for prod test and uat urls
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("UK", "London");
        capitalCities.put("Germay", "Berlin");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("India"));
        System.out.println(capitalCities.get("USA"));
        capitalCities.remove("UK");

        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
