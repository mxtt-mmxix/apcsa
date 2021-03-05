import java.util.*;

class Main {
    /*Date: 3/5/21
    Aim: How can we examine and trace through an insertion sort algorithm using an array of integers?
    Do Now:
    1. Examine the following method insertionSort.
    a. What is the purpose of the temp variable?
    // Temporarily stores the value at index j for use in a later comparison.
    b. The purpose of possibleIndex = j probably isn't clear until you trace through the code. Read the full algorithm then explain the meaning of this line of code.
    c. Why does the outer for loop index variable start at 1 and not 0?
    // Because we call elements[possibleIndex - 1]
    d. Explain the meaning of possibleIndex > 0 && temp < elements[possibleIndex - 1]
    // Checks whether the possible index is more than zero and whether it is less than the element that preceeds it.
    e. Explain the meaning of elements[possibleIndex] = elements[possibleIndex - 1]; possibleIndex--;
    // Assigns the element at the current index to the element at the preceeding index. Then move the current index back to modify the preceeding index.
    f. Explain the meaning of elements[possibleIndex] = temp;*/
    // Reassign the current index to the value stored in temp.
    public static void insertionSort(int[] elements) {
        for (int j = 1; j < elements.length; j++) {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            } //closes inner loop
            elements[possibleIndex] = temp;
        } //closes outer loop
    }//closes method

    public static void main(String[] args) {

        /*2. What do you expect the array will print after the insertion sort is complete? Explain*/

        int[] arr2 = { 3, 86, -20, 14, 40 };
        System.out.println(Arrays.toString(arr2));
        insertionSort(arr2);
        System.out.println("_____________After insertion sort______________");
        System.out.println(Arrays.toString(arr2));

        /*3. Edit the for loop header by changing j < elements.length to j < 2,
        *Make a precition about what the array values will be.
        [3, 86, -20, 14, 40]
        
        4. Change the for loop condition to j < 3, make a predicition about what the array values will be.
        [-20, 3, 86, 14, 40]
        
        5. Change the for loop condition to j < 4, make a predcition about what the array values will be.
        [-20, 3, 14, 86, 40]
        */

        //6. Explain how an insertion sort works.
        // Insertion sort works by iterating through the entire array moving smaller elements backwars as neccessary to sort the array.

    }//closes main method
}//closes class