import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] args) {


        int[] iArray = new int[] {101,102,103,104,105};
        String[] sArray = new String[] {"one", "two", "three", "four", "five"};


        System.out.println("Original int array : " + Arrays.toString(iArray));

        int[] reversediArray = new int[iArray.length];

        for(int i=0;i<iArray.length;i++) {

            reversediArray[i] = iArray[iArray.length-1-i];
        }

        System.out.println("reversed int array : " + Arrays.toString(reversediArray));


        System.out.println("Original String array : " + Arrays.toString(sArray));

        String[] reversed_sArray = new String[sArray.length];

        for(int j = 0;j< sArray.length;j++) {
            reversed_sArray[j] = sArray[sArray.length-1-j];
        }

        System.out.println("reversed String array in Java : "
                + Arrays.toString(reversed_sArray));

    }
}
