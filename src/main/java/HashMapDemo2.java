import java.util.HashMap;

public class HashMapDemo2 {

    public static void main(String[] args) {

        //ket  // value pair
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("India", "Delhi");// this can be used for environment variables like for prod test and uat urls
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("UK", "London");
        capitalCities.put("Germay", "Berlin");

        for(String i:capitalCities.keySet())
        {
            System.out.println(i);
        }
        System.out.println("****Hash Values *******");
        for(String i:capitalCities.values())
        {
            System.out.println(i);
        }
        System.out.println("****Hash Map Key Values  *******");

        for(String i:capitalCities.keySet())
        {
            System.out.println("" + i + "----> : " +capitalCities.get(i));
        }


    }
}

