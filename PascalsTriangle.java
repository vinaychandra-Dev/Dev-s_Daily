public class PascalsTriangle {
    public static void main(String args[]) {

        int rows = 5;
        for (int i = 0; i < rows; i++) {
            int num = 1;
            System.out.format("%" + (rows - i) * 2 + "s", ""); // Centering the triangle
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", num);
                num = num * (i - j) / (j + 1); // Calculate the next number in the row
            }
            System.out.println();
        }
    }
}
