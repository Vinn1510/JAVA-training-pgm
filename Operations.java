import java.util.*;

public class Main {
    public static void main(String[] args) {

        
        List<String> fruits = new ArrayList<>();
        
     
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

       
        System.out.println("Size: " + fruits.size()); 

        
        System.out.println("Is empty? " + fruits.isEmpty());

     
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana")); // true

        
        Object[] fruitArray = fruits.toArray();
        System.out.println("To Array: " + Arrays.toString(fruitArray)); // [Apple, Banana, Mango]

       
        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Pineapple");
        moreFruits.add("Grapes");

        fruits.addAll(moreFruits);
        System.out.println("After addAll: " + fruits); 

       
        fruits.remove("Banana");
        System.out.println("After remove('Banana'): " + fruits);

        
        List<String> removeThese = new ArrayList<>();
        removeThese.add("Apple");
        removeThese.add("Grapes");

        fruits.removeAll(removeThese);
        System.out.println("After removeAll([Apple, Grapes]): " + fruits); 

    }
}