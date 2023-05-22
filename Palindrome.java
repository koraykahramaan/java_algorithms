public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("aaa"));
        System.out.println(isPalindrome("abc"));
        System.out.println(isPalindrome("defg"));
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("radar"));
    }

    private static boolean isPalindrome(String word) {
        String reverseWord = reverseWord(word);

        return reverseWord.equalsIgnoreCase(word);
    }

    private static String reverseWord(String word) {
        if(word.length() < 2) {
            return word;
        }

        return word.charAt(word.length()-1) + reverseWord(word.substring(0,word.length()-1));
    }
}
