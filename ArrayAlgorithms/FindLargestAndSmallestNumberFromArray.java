import java.util.Arrays;

public class FindLargestAndSmallestNumberFromArray {
    public static void main(String[] args) {


        largestAndSmallest(new int[]{-20, 34, 21, -87, 92,
                Integer.MAX_VALUE});
        largestAndSmallest(new int[]{10, Integer.MIN_VALUE, -2});
        largestAndSmallest(new int[]{Integer.MAX_VALUE, 40,
                Integer.MAX_VALUE});
        largestAndSmallest(new int[]{1, -1, 0});

        largestAndSmallestWithSort(new int[]{-20, 34, 21, -87, 92,
                Integer.MAX_VALUE});
        largestAndSmallestWithSort(new int[]{10, Integer.MIN_VALUE, -2});
        largestAndSmallestWithSort(new int[]{Integer.MAX_VALUE, 40,
                Integer.MAX_VALUE});
        largestAndSmallestWithSort(new int[]{1, -1, 0});
        
    }

    private static void largestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);

        System.out.println("Given integer array : " + Arrays.toString(numbers));
        System.out.println("Largest number in array is : " + numbers[numbers.length-1]);
        System.out.println("Smallest number in array is : " + numbers[0]);
        System.out.println("---------------------");
    }

    private static void largestAndSmallest(int[] numbers) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int number : numbers) {
            if(number > largest) {
                largest = number;
            }
            else if (number < smallest) {
                smallest = number;
            }
        }


        System.out.println("Given integer array : " + Arrays.toString(numbers));
        System.out.println("Largest number in array is : " + largest);
        System.out.println("Smallest number in array is : " + smallest);
        System.out.println("---------------------");
    }
}
