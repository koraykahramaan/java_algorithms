public class ReverseString {

    public static void main(String[] args) {


        String str = "Sony is going to introduce internet TV soon";
        System.out.println("Original String : " + str);

        //using StringBuffer
        reverseStringWithStringBuffer(str);
        //using Iterative method
        reverseStringWithIterative(str);
        //using recursive method
        System.out.println("Reverse String using Recursion : " + reverseStringWithRecursion(str));
    }

    private static String reverseStringWithRecursion(String str) {
        if(str.length() < 2) {
            return str;
        }
        return str.charAt(str.length()-1) + reverseStringWithRecursion(str.substring(0,str.length()-1));
    }

    private static void reverseStringWithIterative(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] strChars = str.toCharArray();

        for(int i = str.length()-1;i>=0;i--) {
            stringBuilder.append(strChars[i]);
        }
        System.out.println("Reverse String using Iteration : " + stringBuilder);
    }

    private static void reverseStringWithStringBuffer(String str) {

        String reserveStr = new StringBuffer(str).reverse().toString();

        System.out.println("Reverse String using StringBuffer : " + reserveStr);
    }


}
