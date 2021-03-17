import java.util.*;

class Main {

    public static double getAverage(int[][] a) {
        double total = 0;
        int value = 0;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[0].length; col++) {
                value = a[row][col];
                total = total + value;
            }
        }
        return total / (a.length * a[0].length);
    }

    public static void main(String[] args) {

        /*
        Date: 3/17/21
        Aim: How can we traverse 2D arrays?
        
        Do Now: Complete the following self-check in practice it BJP4 Self-Check 7.31: arrayCodeTracing2d.
        https://practiceit.cs.washington.edu/problem/view/bjp4/chapter7/s31-arrayCodeTracing2d
        _____________________________________________________________________
        Explain what the following code segment will print:
        
        */

        for (int r = 0; r < 4; r++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        
        ***
        ***
        ***
        ***
        
        ______________________________________________________________________
        Now let's consider the code segment above in the form of a 2D array.
        
        */

        System.out.println();

        String[][] stars = { { "*", "*", "*" }, { "*", "*", "*" }, { "*", "*", "*" }, { "*", "*", "*" } };

        /*
        How can we define the length of the array with respect to its rows? (with an expression)
        stars.length
        
        How can we define the length of the array with respect to its columns? (with an expression)
        stars[0].length
        
        _________________________________________________________________________
        Explore:
        Write a code segment that will print the elements of the array stars.
        */

        for (String[] starRow : stars) {
            for (String star : starRow) {
                System.out.print(star);
            }
            System.out.println();
        }
        /*
        _________________________________________________________________________
        Explore part 2:
        Explain the meaning of the getAverage(int [ ][ ] a) method(in great detail!).
        It iterates through every column of every column adding the value of every entry towards a sum. Then it returns that value of the sum divided by number of rows multplied by the columns.
        */

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(getAverage(matrix));

        /*
        H.W. Complete 7.33 and 7.34 in PracticeIt submit screenshots with this submission
        */

    }//closes main method
}//closes class