import java.util.ArrayList;



public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("FORD");
        cars.add("MARUTI");

        //for (int i=0;i) nned to add

        for (String i : cars) {
            System.out.println(i);
        }

        cars.forEach((n) -> print(n));
    }
        public static void print (String n)
        {
            System.out.println("car Name is " + n);
        }

    }



