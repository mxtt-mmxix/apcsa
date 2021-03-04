import java.util.ArrayList;

public class Main {
    public static void selectionSort(int[] elements) {
        for (int j = 0; j < elements.length - 1; j++) {
            int minIndex = j;
            /**
             * A nested for loop is for a for loop that executes each iteration of the
             * parent for loop. This mean if the parent for loop executes x amount of times
             * and the nested for loop executes y amount of times. The body of the nested
             * for loop executes x * y amount of times.
             */
            for (int k = j + 1; k < elements.length; k++) {
                /**
                 * This conditional checks whether the current element is smaller than the
                 * smallest known element. If it is smaller than the smallest known element,
                 * then it becomes the new smallest known element by having its index assigned
                 * to minIndex. If not, we carry on and check the next element.
                 */
                if (elements[k] < elements[minIndex]) {
                    minIndex = k;
                }
            }
            /**
             * These three lines of code swaps the smallest element found with the element
             * at j.
             */
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
    }

    public static void selectionSort(ArrayList<Integer> elements) {

        for (int i = 0; i < elements.size(); i++) {

            int minIndex = i;

            for (int j = i; j < elements.size(); j++) {

                if (elements.get(j) < elements.get(minIndex)) {
                    minIndex = j;
                }
            }

            elements.add(i, elements.get(minIndex));
            elements.remove(minIndex);

        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 86, -20, 14, 40 };
        // System.out.println(Arrays.toString(arr1));
        selectionSort(arr1);
        // System.out.println(Arrays.toString(arr1));

        /*
         * 1. Examine the conditional statment within the nested (inner) loop. Explain
         * what the conditional statement accomplishes in this part of the program
         * 
         * 2. After iterating through the outer loop once... temp = 3; elements[0] = -20
         * elements[minIndex] which is elements[2] = 3. Explain the meaning of these 3
         * lines of code. Why do they appear after the inner loop?
         * 
         * 
         * 3. What will the array arr1 hold after we evaluate selectionSort(int[ ]
         * elements) for j = 0, k = 1, k = 2, k = 3, k = 4 (1 iteration of the outer
         * loop and 4 iterations of the inner loop - the total number of iterations
         * needed to complete the inner loop)?
         * 
         * 
         * 4. What will the array arr1 hold after we evaluate selectionSort(int[ ]
         * elements) for j = 1, k = 1, k = 2, k = 3, k = 4 (2nd iteration of the outer
         * loop and 4 iterations of the inner loop - the total number of iterations
         * needed to complete the inner loop)? { -20, 3, 86, 14, 40 }
         * 
         * 
         * 5. In general, what can we say about a selection sort algorithm?
         * 
         * 
         * 
         * 
         * 6. HW - Rewrite the program using lists instead of arrays.
         */
    }
}