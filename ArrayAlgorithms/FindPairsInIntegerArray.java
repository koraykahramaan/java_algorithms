import java.util.Arrays;

public class FindPairsInIntegerArray {
    public static void main(String[] args) {
        // how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number

        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 , 3 };
        prettyPrint(numbers, 7);
        prettyPrint(numbersWithDuplicates, 6);

    }

    private static void prettyPrint(int[] givenArray, int givenSum) {

        System.out.println("Given Array : " + Arrays.toString(givenArray));
        System.out.println("Given Sum : " + givenSum);
        System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
        printPairs(givenArray, givenSum);
    }

    private static void printPairs(int[] array, int sum) {

        for (int i = 0; i < array.length ; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] + array[j] == sum) {
                    System.out.printf("(%d, %d) %n" , array[i],array[j]);
                }
            }
        }
    }
}
