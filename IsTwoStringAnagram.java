import java.util.Arrays;

public class IsTwoStringAnagram {

    public static void main(String[] args) {

        isAnagram("army","mary");
        isAnagram("stop","pots");
        isAnagram("boat","btoa");
        isAnagram("aabbcc","bcbaac");
        isAnagram("ccc","cccccc");
        isAnagram("pure","in");
        isAnagram("sleep","slep");
        isAnagram(" ","");
        isAnagram("sleep","slept");
        isAnagram("koray","koroy");

    }

    public static void isAnagram(String s1,String s2) {


        if(s1.length() != s2.length()) {
            System.out.println("They are not anagrams.");
            System.out.println("-------------------");
            return;
        }

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        if(Arrays.compare(array1,array2) == 0) {
            System.out.println("They are anagrams.");
        }
        else {
            System.out.println("They are not anagrams.");
        }
        System.out.println("-------------------");
    }
}
