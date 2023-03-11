import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo3 {
    // primitive types int , float --wrapper class
    //integer, char - charter, Double, Boulien


    public static void main(String[] args) {
        ArrayList<Integer> myNumber = new ArrayList<Integer>();
        myNumber.add(10);
        myNumber.add(15);
        myNumber.add(20);
        myNumber.add(8);


        for (int i : myNumber) {
            System.out.println(i);
        }
        System.out.println("***********After sorting **********");
        Collections.sort(myNumber);
        for (int i:myNumber)
        {
            System.out.println(i);
        }
    }
}
