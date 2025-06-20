import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "programming";

        str = str.toLowerCase();

       
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }

                System.out.println("Repeating characters and their frequencies:");
        for (char ch : frequencyMap.keySet()) {
            int freq = frequencyMap.get(ch);
            if (freq > 1) {
                System.out.println(ch + ": " + freq);
            }
        }
    }
}
