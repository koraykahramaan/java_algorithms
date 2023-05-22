public class AverageOfGivenArray {

    public static void main(String[] args) {

        int[] input = new int[]{1,2,3,4,5};
        int[] input2 = new int[]{5,10,20,10,30,50};
        int[] input3 = new int[]{11,14,17,23,241,531,176,205};

        System.out.println(calculateAverage(input));
        System.out.println(calculateAverage(input2));
        System.out.println(calculateAverage(input3));

    }

    private static float calculateAverage(int[] array) {

        float sum = 0f;

        for(int number : array) {
            sum += number;
        }

        return sum / array.length;
    }
}
