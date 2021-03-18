public class Main {

    public static void main(String[] args) {

        //Date: 3/18/21
        //Aim: How can we traverse 2D arrays
        /*Do Now: Declare and initialize a 2d array of test scores. The 2d array should have 4 rows and 3 columns with the following scores.
        Student 1: 90, 93, 91
        Student 2: 92, 88, 86
        Student 3: 75, 80, 85
        Student 4: 88, 90, 92 */

        int[][] testScores = { { 90, 93, 91 }, { 92, 88, 86 }, { 75, 80, 85 }, { 88, 90, 92 } };

        for (int[] student : testScores) {
            for (int score : student) {
                System.out.println(score + ' ');
            }
            System.out.println();
        }

        //1. What is the meaning of the rows in the context of the 2d array from the do now?
        // A Row will represent the set of all test scores for a particular student.

        //2. What is the meaning of the columns in the contest of the 2d array from the do now?
        // A columns will represent the set of all test scores for a particular test.

        //3. What are the scores of the first student?
        // { 90, 93, 91 }

        //4. What are the scores from the 3rd test?
        // { 91, 86, 85, 92 }

        /*5. Assuming this is an AP class each test should be scaled up by a factor of 10%. Write a method
        public int[][] APgrades(int [][] scores)
        
        which takes a 2d array of integers and returns a 2d array of integers with corresponding values 10% larger than the initial data structure. */

        //6. A 2d Array is an array of arrays...We can use for-each loops to traverse 2d arrays as well. What should this look like? Try recreating the method from above using an enhanced for loop.

    }//closes main method

    public double[][] APgrades(double[][] scores) {

        double[][] newScores = new double[scores.length][scores[0].length];

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                newScores[i][j] = scores[i][j] * 1.1;
            }
        }

        return newScores;

    }

    public void _APgrades(double[][] scores) {

        for (double student[] : scores) {
            for (double score : student) {
                System.out.println(score + ' ');
            }
            System.out.println();
        }
    }

}//closes class