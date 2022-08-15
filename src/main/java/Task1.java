import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minX1 = Integer.MAX_VALUE;
        int maxX2 = Integer.MIN_VALUE;
        int minY1 = Integer.MAX_VALUE;
        int maxY2 = Integer.MIN_VALUE;
        int x11 = scanner.nextInt();
        if (x11 <= minX1) {
            minX1 = x11;
        }
        int y11 = scanner.nextInt();
        if (y11 <= minY1) {
            minY1 = y11;
        }
        int x12 = scanner.nextInt();
        if (x12 >= maxX2) {
            maxX2 = x12;
        }
        int y12 = scanner.nextInt();
        if (y12 >= maxY2) {
            maxY2 = y12;
        }
        int x21 = scanner.nextInt();
        if (x21 <= minX1) {
            minX1 = x21;
        }
        int y21 = scanner.nextInt();
        if (y21 <= minY1) {
            minY1 = y21;
        }
        int x22 = scanner.nextInt();
        if (x22 >= maxX2) {
            maxX2 = x22;
        }
        int y22 = scanner.nextInt();
        if (y22 >= maxY2) {
            maxY2 = y22;
        }
        System.out.println((int) Math.pow(Math.max(Math.abs(minX1 - maxX2), Math.abs(minY1 - maxY2)), 2));
    }
}
