public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;
    /** The 2-dimensional representation of this image. Guaranteed not to be null.
    * All values in the array are within the range [BLACK, WHITE], inclusive.
    */
    private int[][] pixelValues;

    public GrayImage(int[][] values) {
        pixelValues = values;
    }

    public void printValues() {
        System.out.println(pixelValues);
    }

    /** @return the total number of white pixels in this image.
    * Postcondition: this image has not been changed.
    */
    public int countWhitePixels() {

        int count = 0;

        for (int[] row : pixelValues) {
            for (int pixel : row) {
                if (pixel == WHITE) {
                    count++;
                }
            }
        }

        return count;

    }

    /** Processes this image in row-major order and decreases the value of each pixel at
    * position (row, col) by the value of the pixel at position (row + 2, col + 2) if it exists.
    * Resulting values that would be less than BLACK are replaced by BLACK.
    * Pixels for which there is no pixel at position (row + 2, col + 2) are unchanged.
    */
    public void processImage() {
        for (int row = 0; row < pixelValues.length - 2; row++) {
            for (int col = 0; col < pixelValues[row].length - 2; col++) {
                pixelValues[row][col] -= pixelValues[row + 2][col + 2];
                if (pixelValues[row][col] < BLACK || pixelValues[row][col] < 0) {
                    pixelValues[row][col] = BLACK;
                }
            }
        }
    }
}
