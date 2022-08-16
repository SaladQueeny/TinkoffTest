import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Task4 {

    public static boolean containsNumber(String s) {
        return s.contains("0") || s.contains("1") || s.contains("2") || s.contains("3")
                || s.contains("4") || s.contains("5") || s.contains("6") || s.contains("7")
                || s.contains("8") || s.contains("9");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Map<String, Integer>> bigList = new ArrayList<>();
        bigList.add(new HashMap<>());
        List<String> lines = new ArrayList<>();
        int openScobkaCount = 0;
        String line = scanner.nextLine();
        while (!line.isEmpty()) {
            lines.add(line);
            String[] leftAndRight = line.split("=");
            if (leftAndRight.length == 2) {
                if (containsNumber(leftAndRight[1])) {
                    int newValue = Integer.parseInt(leftAndRight[1]);
                    if (bigList.get(openScobkaCount).containsKey(leftAndRight[0])) {
                        int value = bigList.get(openScobkaCount).get(leftAndRight[0]);
                        bigList.get(openScobkaCount).replace(leftAndRight[0], value, newValue);
                    } else {
                        bigList.get(openScobkaCount).put(leftAndRight[0], newValue);
                    }
                } else {
                    if (bigList.get(openScobkaCount).containsKey(leftAndRight[1])) {
                        if(bigList.get(openScobkaCount).containsKey(leftAndRight[0])){
                            bigList.get(openScobkaCount).replace(leftAndRight[0], bigList.get(openScobkaCount).get(leftAndRight[1]));
                        } else {
                            bigList.get(openScobkaCount).put(leftAndRight[0], bigList.get(openScobkaCount).get(leftAndRight[1]));
                        }
                    } else {
                        if(bigList.get(openScobkaCount).containsKey(leftAndRight[0])){
                            bigList.get(openScobkaCount).replace(leftAndRight[0], 0);
                            bigList.get(openScobkaCount).put(leftAndRight[1], 0);
                        } else {
                            bigList.get(openScobkaCount).put(leftAndRight[0], 0);
                            bigList.get(openScobkaCount).put(leftAndRight[1], 0);
                        }
                    }
                    System.out.println(bigList.get(openScobkaCount).get(leftAndRight[0]));//show value
                }
            } else {
                if (leftAndRight[0].contains("{")) {
                    Map<String, Integer> predVariables = new HashMap<>();
                    predVariables.putAll(bigList.get(openScobkaCount));
                    bigList.add(predVariables);
                    openScobkaCount++;
                } else {
                    bigList.remove(openScobkaCount);
                    openScobkaCount--;
                }
            }
            line = scanner.nextLine();
        }
    }
}

/*
thats=zero
a=10
ten=a
aboba=ten
ten=-10
{
b=a
a=1337
c=a
{
d=a
e=aboba
}
}
lol=a



thats=zero
zero=100
{
b=zero
c=e
e=1337
{
b=e
}
c=e
}


 */
