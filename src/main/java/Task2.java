import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maxMax = Integer.MIN_VALUE;
        Map<Set<String>, Integer> winners = new HashMap<>();
        int n = s.nextInt();
        Set<String> team;
        for (int i = 0; i < n; i++) {
            team = new HashSet<>();
            for (int j = 0; j < 3; j++) {
                String guy1 = s.next();
                team.add(guy1);
            }
            if (winners.containsKey(team)) {
                int count = winners.get(team);
                int newCount = count+1;
                maxMax = Math.max(maxMax, newCount);
                winners.replace(team, count, newCount);
            } else {
                winners.put(team, 1);
            }
        }
        System.out.println(maxMax);
    }
}
