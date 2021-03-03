import java.util.ArrayList;

public class Main {

    /*
     * Date: 3/3/21 Aim: How can we use a binary search to find a target value in an
     * array or list of elements?
     * 
     * Do Now: Evalute the following method binarySearch and explain how it works.
     */
    public static int binarySearch(int[] elements, int target) {
        int left = 0;
        int right = elements.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target < elements[middle]) {
                right = middle - 1;
            } else if (target > elements[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }// closes method

    /**
     * The method firsts assigns left to the first index and right to the index of
     * the last element. 'left' and 'right' represent and the left and right bounds
     * of section of the array we're examining. We enter the while loop if the left
     * bound is less than or equal to the right bound. 'middle' will store the index
     * of the middle element of the current section. If the target value is less
     * that or more than the target, we elminate the other half of the array by
     * adjusting the left and right bounds accordingly. We repeat this pocess until
     * we find the value in question or determine it does not exist.
     */

    public static int binarySearch(String[] elements, String target) {
        int left = 0;
        int right = elements.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target.compareTo(elements[middle]) < 0) {
                right = middle - 1;
            } else if (target.compareTo(elements[middle]) > 0) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }// closes method

    public static void main(String[] args) {
        int[] arr1 = { -20, 3, 15, 81, 432 };

        // 1. How many times will the loop iterate before returning the index of 15?
        // 1
        int index = binarySearch(arr1, 15);
        System.out.println(index);

        // 2. How many times will the loop iterate before returning the index of -20?
        // 2
        index = binarySearch(arr1, -20);
        System.out.println(index);

        // 3. How many times will the loop iterate before returning the index of 432?
        // 3
        index = binarySearch(arr1, 432);
        System.out.println(index);

        // 4. How many times will the loop iterate before returning the index of 53?
        // 3
        index = binarySearch(arr1, 53);
        System.out.println(index);

        /*-------Part 2--------
        Write a bineary search method that returns the index of an element
        given as the 2nd param. If the element isn't found return -1.
        Note: the compareTo(String obj) method compares the String the method is being called upon to the String param. and returns a negative number if the this String is less than the String param. ex.
        String s1 = "apple";
        s1.compareTo("banana"); returns a negative number since apple comes before banana alphabetically. This method helps us write the search method since the array of Strings is sorted alphabetically.*/

        String[] arr2 = { "apple", "banana", "cherry", "kiwi", "melon" };
        // test when the target is in the middle 
        index = binarySearch(arr2, "cherry");
        System.out.println(index);

        // test when the target is the first item in the array index =
        binarySearch(arr2, "apple");
        System.out.println(index);

        // test when the target is in the array - last 
        index = binarySearch(arr2, "melon");

        System.out.println(index);
        // test when the target is not in the array index = 
        binarySearch(arr2, "pear");
        System.out.println(index);

    } // closes main method
}