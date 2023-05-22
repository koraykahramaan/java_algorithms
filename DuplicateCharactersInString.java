import java.util.HashMap;

public class DuplicateCharactersInString {

    public static void main(String[] args) {

        printDuplicateCharacters("Deneme");
        printDuplicateCharacters("Java");
        printDuplicateCharacters("Programming");
        printDuplicateCharacters("Language");


    }

    public static void printDuplicateCharacters(String word) {
        word = word.toLowerCase();
        char[] characters = word.toCharArray();

        HashMap<Character,Integer> charHashMap = new HashMap<>();

        for(Character ch : characters) {
            if(charHashMap.containsKey(ch)) {
                charHashMap.put(ch,charHashMap.get(ch)+1);
            }
            else {
                charHashMap.put(ch,1);
            }
        }


        for(int i = 0;i<charHashMap.size()-1;i++) {
            Character charAtIndex = word.charAt(i);
            if(charHashMap.get(charAtIndex) > 1) {
                System.out.printf("%s : %d %n", charAtIndex,charHashMap.get(charAtIndex));
            }
        }
        System.out.println("-----------------------------");

    }
}
