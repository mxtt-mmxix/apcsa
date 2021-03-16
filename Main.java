import java.util.*;

class Main {

    public static void main(String[] args) {

        /*
        Do Now:
        1. Create an array of names ("Strings") called studentsArray. You can use an initializer list or assign them one by one. Add at least 6 elements (even number only). */
        String[] studentsArray = { "Raphael", "Donatello", "Leonardo", "Michealangelo", "John", "Mary" };

        /*
        What if we wanted to place the roster of students into a seating chart? i.e. 2d-array*
        To declare and initialize a 2D array use the data type to be stored in the data structure i.e. String, int, double, Player object etc.
        followed by [ ][ ] variableName = new DataType[row][column];
        */

        // String[][] seatingChart;

        /*2. The line of code above declares the 2D array but does not initialize it. Either edit the line of code above or add a line that properly initializes the 2D array. */

        /* seatingChart = new String[6][5]*/;

        /*3. Initialize a new seatingChart using the initializer list. reference 8.1.5 in csawesome textbook. */
        String[][] seatingChart = { studentsArray, { "Bob", "Jeff", "Tiffany", "Brandon", "Jerry", "Silvester" } };

        // create arrays
        int[][] testInfo = new int[2][3];
        // initialize the array elements
        testInfo[0][0] = 85;
        testInfo[0][1] = 90;
        testInfo[0][2] = 95;
        testInfo[1][0] = 75;
        testInfo[1][1] = 67;
        testInfo[1][2] = 85;

        /* 4. Reassign each test score to an appropriate value .
        5. How many tests were taken?
        6 tests were taken
        6. How many students are there?
        There are 6 students
        */

    }//closes main method
}//closes class