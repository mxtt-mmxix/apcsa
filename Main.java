public class Main {

    //Date: 3/25/21
    //Aim: How can we use nested loops and conditional statements to traverse and manipulate values in a 2-dimensional array?

    //Do Now: Please review the full FRQ here: https://secure-media.collegeboard.org/apc/ap_frq_computerscience_12.pdf

    //Explore: Complete part a.

    //Explore part 2: Complete part b.

    /*When you're ready to test your solutions to a & b please use the following in your main class & main method. */

    public static void main(String[] args) {
        int[][] values = { { 255, 184, 178, 84, 129 }, { 84, 255, 255, 130, 94 }, { 78, 255, 0, 0, 78 },
                { 84, 130, 255, 130, 84 } };
        GrayImage image = new GrayImage(values);
        System.out.println("count white should be 5 and is " + image.countWhitePixels());

        int[][] values2 = { { 221, 184, 178, 84, 135 }, { 84, 255, 255, 130, 84 }, { 78, 255, 0, 0, 78 },
                { 84, 130, 255, 130, 84 } };

        GrayImage image2 = new GrayImage(values2);

        image2.printValues();
        image2.processImage();
        System.out.println("after process image");
        image2.printValues();

    }//closes method 

}//closes class