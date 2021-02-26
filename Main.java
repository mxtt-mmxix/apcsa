import java.util.ArrayList;

public class Main {
    // Date: 2/25/21
    // Aim: How can we use ArrayList's as parameters in a method?

    // Do Now: Copy and paste the following in the main java file.

    /*
     * 1. Write a method maxLength that takes an ArrayList of Strings as a parameter
     * and that returns the length of the longest String in the list. If your method
     * is passed an empty list, it should return 0.
     */
    public static int maxLength(ArrayList<String> list) {

        String longestStr = "";

        for (String string : list) {
            if (string.length() > longestStr.length()) {
                longestStr = string;
            }
        }

        return longestStr.length();

    }// closes method

    /*
     * 2. Write a method findSum that takes an ArrayList of Integers as a parameter
     * and that returns the sum of all Integer objects in the list. If your method
     * is passed an empty list, it should return 0.
     */
    public static int findSum(ArrayList<Integer> list) {

        int sum = 0, i = 0;

        while (i < list.size()) {

            sum += list.get(i);
            i++;

        }

        return sum;

    }// closes method

    /*
     * 3a. Explain what the following mystery method does. 
     * The following mystery method traverses the array backawards sorting elements in
     * ascending order. An element will be moved to the front of the list if it is
     * lesser than the element that precedes it. This will repeat until all the elements
     * are sorted.
     * 
     *  public static void mystery1(ArrayList<Integer> list) { 
     *      for(int i = list.size() - 1; i > 0; i--)
     *      { 
     *          if(list.get(i) < list.get(i - 1)) 
     *          { 
     *              int element = list.get(i);
     *              list.remove(i);
     *              list.add(0, element);
     *          } 
     *      } 
     *      System.out.println(list); 
     *  }  
     * 3b.
     * What will the mystery method return given the following lists 
     * [2, 6, 1, 8]             ->  [1, 2, 6, 8]
     * [30, 20, 10, 60, 50, 40] ->  [10, 20, 30, 40, 50, 60]
     */

    /*
     * 4. Write a method removeEvenLength that takes an ArrayList of Strings as a
     * parameter and that removes all of the Strings of even length from the list.
     */
    public static void removeEvenLength(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

    }// closes method

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Hi"); // len 2
        stringList.add("Hey"); // len 3
        stringList.add("hello"); // len 5
        stringList.add("hello!"); // len 6
        stringList.add("hello!!"); // len 7
        System.out.println(maxLength(stringList)); // should return 7

        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(100);
        numList.add(200);
        numList.add(300);
        numList.add(400);
        System.out.println(findSum(numList));

        removeEvenLength(stringList);

        System.out.println(stringList);

    } // closes main method
}