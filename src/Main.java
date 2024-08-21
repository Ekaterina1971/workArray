public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        int[] costWeek = {25_450, 36_780, 19_300, 38_900, 27_359};
        int sum = 0;
        for (int i = 0; i < costWeek.length; i++) {
            sum += costWeek[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        // Задача №2
        System.out.println("Задача №2");
        int[] costWeek1 = {50_137, 28_900, 35_480, 41_290, 63_445};
        int min = costWeek1[0];
        int max = costWeek1[0];
        for (int i = 1; i < costWeek1.length; i++) {
            if (costWeek1[i] > max) max = costWeek1[i];
            else if (costWeek1[i] < min) min = costWeek1[i];
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + ". Максимальная сумма трат за неделю составила " + max + ".");
        // Задача №3
        System.out.println("Задача №3");
        int[] costWeek2 = {44_232, 56_785, 35_896, 115_235, 71_256};
        int sum1 = 0;
        double result = 0;
        for (int i = 0; i < costWeek2.length; i++) {
            sum1 += costWeek2[i];
        }
        result = sum1 / costWeek2.length;
        System.out.println("Средняя сумма трат за месяц составила " + result + " рублей.");

        // Задача №4
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };
        char a = 0;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            a += reverseFullName[i];
            System.out.print(reverseFullName[i]);
        }
    }
}