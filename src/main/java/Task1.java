import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minX1 = Integer.MAX_VALUE;
        int maxX2 = Integer.MIN_VALUE;
        int minY1 = Integer.MAX_VALUE;
        int maxY2 = Integer.MIN_VALUE;
        int x11 = scanner.nextInt();
        minX1 = Math.min(x11, minX1);
        int y11 = scanner.nextInt();
        minY1 = Math.min(y11, minY1);
        int x12 = scanner.nextInt();
        maxX2 = Math.max(x12, maxX2);
        int y12 = scanner.nextInt();
        maxY2 = Math.max(y12, maxY2);
        int x21 = scanner.nextInt();
        minX1 = Math.min(x21, minX1);
        int y21 = scanner.nextInt();
        minY1 = Math.min(y21, minY1);
        int x22 = scanner.nextInt();
        maxX2 = Math.max(x22, maxX2);
        int y22 = scanner.nextInt();
        maxY2 = Math.max(y22, maxY2);
        System.out.println((int) Math.pow(Math.max(Math.abs(minX1 - maxX2), Math.abs(minY1 - maxY2)), 2));
    }
}
