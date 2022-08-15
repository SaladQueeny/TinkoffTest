import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNewValue = Integer.MIN_VALUE;
        Map<Set<String>, Integer> guys = new HashMap<>();
        int n = scanner.nextInt();
        Set<String> team;
        for (int i = 0; i < n; i++) {
            team = new HashSet<>();
            for (int j = 0; j < 3; j++) {
                String guy1 = scanner.next();
                team.add(guy1);
            }
            if (guys.containsKey(team)) {
                int count = guys.get(team);
                int newValue = count+1;
                maxNewValue = Math.max(maxNewValue, newValue);
                guys.replace(team, count, newValue);
            } else {
                guys.put(team, 1);
            }
        }
        System.out.println(maxNewValue);

    }
}
