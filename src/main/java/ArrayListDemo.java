
import java.util.ArrayList;
public class ArrayListDemo {

    public static void main(String[] args) {

        //Classnam objectname =  new classname();

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("FORD");
        cars.add("MARUTI");

        System.out.println(cars);
        System.out.println(cars.size());//to find out number of elements in array
        System.out.println(cars.get(0));//get the relevment ememtmets from arraylist
        cars.set(0, "Opel");//to change item is array list
        System.out.println(cars);
        cars.remove(0);//remove the element
        System.out.println(cars);
        cars.clear();// to remove all elements
        System.out.println(cars);


    }
}
