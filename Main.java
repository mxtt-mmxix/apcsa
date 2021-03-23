public class Main {

    public static void main(String[] args) {
        //Date:
        //Aim: How can we write algorithms with 2D Arrays in a java program?

        /*Do Now:
        1. Take the following 2D array traversal (countEvens method) which uses nested for loops and translate it to an equivalent set of code using enhanced for loop (for-each) loops. Remember a 2D array is an array of arrays. Imagine the first enhanced for loop pulls an inividiaul row out (a single array) and the inner loop pulls out individual elements from said array. */
        int[][] numbersArray = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 4, 5, 6 }, { 4, 5, 6, 7 }, { 5, 6, 7, 8 } };
        System.out.println(countEvens(numbersArray)); //should return 10

        /*2. Write the implementation for the method search which returns a boolean value if the target String value is found in a 2D array of Strings. The 2D array represents a seating chart of names (Strings). The method should return true if the value is found and false otherwise. */
        String[][] chart = { { "Brian", "Stef", "Betsy" }, { "Tammy", "Bart", "Thomas" },
                { "Susan", "Scott", "Justin" } };

        System.out.println(search(chart, "Bart")); //should return true
        System.out.println(search(chart, "Jake")); //should return false

        /*3. Given a 2D array of boolean values, return the percentage of elements
        (in decimal form) that are set to true. For your return statement think about what expression represents the total number of elements in the 2D array. */
        boolean[][] values = { { true, false }, { false, true }, { true, true }, { true, false }, { false, true } };
        System.out.println(percentTrue(values)); //should return 0.6 

    }//closes main method

    /*
    public static int countEvens(int[][] numArray) {
        int count = 0;
        for (int r = 0; r < numArray.length; r++) {
            for (int c = 0; c < numArray[0].length; c++) {
                if (numArray[r][c] % 2 == 0) {
                    count++;
                }
            } //closes inner loop
        } //closes outer loop
        return count;
    }//closes method*/

    public static int countEvens(int[][] arr) {

        int count = 0;

        for (int[] arr_i : arr) {
            for (int i : arr_i) {
                if (i % 2 == 0)
                    count++;
            }
        }

        return count;
    }

    public static boolean search(String[][] seatingChart, String name) {
        for (String[] strArr : seatingChart) {
            for (String str : strArr) {
                if (str.equals(name))
                    return true;
            }
        }

        return false;

    }//closes method

    public static double percentTrue(boolean[][] matrix) {

        int trueCount = 0;

        for (boolean[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                if (row[i])
                    trueCount++;
            }
        }

        return (double) trueCount / (matrix[0].length * matrix.length);

    }//closes method 

}//closes class