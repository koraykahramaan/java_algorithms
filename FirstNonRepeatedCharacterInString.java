public class FirstNonRepeatedCharacterInString {

    public static void main(String[] args) {
       System.out.println(firstNonRepeatedCharacter("hello"));
       System.out.println(firstNonRepeatedCharacter("swiss"));
       System.out.println(firstNonRepeatedCharacter("java"));
       System.out.println(firstNonRepeatedCharacter("abccba"));
       System.out.println(firstNonRepeatedCharacter("firstnonrepeatedcharacter"));
       System.out.println(firstNonRepeatedCharacter("amannm"));

    }

    private static Character firstNonRepeatedCharacter(String word) {
        for(int i =0; i<word.length();i++) {
            String newWord = word.substring(0,i) + word.substring(i+1,word.length()); //indexteki char'i stringten cıkariyoruz ve yeni stringi o index hariç baştan ve sondan
                                                                                      //birleştiriyoruz.örn: java index 2 yani v harfi için -> v çıkarılır, ja + a birleştirilir.
            String x = String.valueOf(word.charAt(i));
            if(!newWord.contains(x)) {
                return word.charAt(i);
            }
        }
        return null;
    }
}
