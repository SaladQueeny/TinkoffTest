import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int summ = 0;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            list.add(value);
            if (i % 2 == 0) {
                summ += value;
            } else {
                summ -= value;
            }
        }
        int maxRaz = Integer.MIN_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            maxRaz = Math.max(maxRaz, Math.abs(list.get(i)-list.get(i+1)));
        }
        System.out.println(Math.max(maxRaz, summ));
    }
}
