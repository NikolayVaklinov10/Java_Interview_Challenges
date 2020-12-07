package part1BigOnotation;

public class BigO {

    /**
     *  Big-O
     *
     *  O(1)       Constant
     *  O(logn)    Logarithmic
     *  O(n)       Linear
     *  O(nlogn)   n log-star n
     *  O(n2)      Quadratic
     */

    public static void main(String[] args) {

        int[] intArray = new int [7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = 22;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }



}
