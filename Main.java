import java.util.ArrayList;

public class Main {
    /*
     * Date: 3/2/21 Aim: How can we use Sequential/Linear searches with arrays and
     * ArrayLists in a Java program?
     * 
     * Do Now: Read the following.
     * 
     * Sequential or linear search is the only method that can be used to find a
     * value in unsorted data. It usually starts at the first element and walks
     * through the array or list until it finds the value it is looking for and
     * returns the index it found it at, or it loops until the end of the array or
     * list and then it returns a -1 to show that it didn’t find the value in the
     * array or list.
     * 
     * Binary searches can only be used when the data set is sorted.
     */

    /*
     * 1. Translate the method below which uses an Array of ints to an ArrayList of
     * Integers. Explain what the method sequentialSearch does.
     */
    public static int sequentialSearch(ArrayList<Integer> elements, int target) {
        for (int j = 0; j < elements.size(); j++) {
            if (elements.get(j) == target) {
                return j;
            }
        }
        return -1;
    }

    /*
     * 2. Write the implementation for the method where which searches for a double
     * value in a list of Doubles. If the Double value is found the index of that
     * value is returned otherwise -1 is returned. Due to standard error ranges with
     * double/Double values a threshold, delta must be used to determine if the
     * value is found and valid. To determine if a value is within the exceptable
     * range: find the difference between the absolute value of the magicNumber and
     * the Double at a specific index. i.e. delta = 0.01, if magicNumber is 3.45 and
     * the value at index in realNumbers list is 3.455 then we found a Double within
     * the accetable range since .005 is less than 0.01. 
     */
    public static int where(double magicNumber, ArrayList<Double> realNumbers, double delta) {
        //implementation 
        for (int i = 0; i < realNumbers.size(); i++) {
            if (Math.abs(magicNumber - realNumbers.get(i)) < delta) {
                return i;
            }
        }
        return -1;
    }

    /*
     * 3. Write the implemenation for the method findTitle which searches a list of
     * Book objects and searches for a specified title. If the title is found the
     * index of that Book object is returned. If the title is not found in any of
     * the Book objects -1 is returned.
     */
    public static int findTitle(String Title, ArrayList<Book> bookList) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(Title)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Question 1
        ArrayList<Integer> numArray = new ArrayList<Integer>();
        numArray.add(3);
        numArray.add(-2);
        numArray.add(9);
        numArray.add(38);
        numArray.add(-23);

        System.out.println("Tests of sequentialSearch");
        System.out.println(sequentialSearch(numArray, 3));
        System.out.println(sequentialSearch(numArray, 9));
        System.out.println(sequentialSearch(numArray, -23));
        System.out.println(sequentialSearch(numArray, 99));

        // Question 2
        System.out.println("Tests of sequentialSearch for where method");
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(2.45);
        doubleList.add(3.6505);
        doubleList.add(5.15);
        doubleList.add(1.42);
        doubleList.add(1.4105);
        System.out.println(where(1.41, doubleList, 0.01));
        System.out.println(where(2.45, doubleList, 0.001));
        System.out.println(where(10.5, doubleList, 0.1));

        // Question 3
        Book b1 = new Book("Lord of the Rings", "J.R.R. Tolkein");
        Book b2 = new Book("I know why the caged bird sings", "Maya Angelou");
        Book b3 = new Book("The Weary Blues", "Langston Hughes");
        Book b4 = new Book("Basic Economics", "Thomas Sowell");

        System.out.println("Tests of sequentialSearch for findTitle method");
        ArrayList<Book> myBooks = new ArrayList<Book>();
        myBooks.add(b1);
        myBooks.add(b2);
        myBooks.add(b3);
        myBooks.add(b4);
        System.out.println(findTitle("The Weary Blues", myBooks));

        // Question 4: What is a Binary Search? Give an example of when it would be
        // appropriate to conduct a binary search.
        /** 
         * A binary search involves dividing the array in half until the desired element is found, which each subsequent division getting closer to the desired element. It only works on sorted arrays, however. */
    } // closes main method
}