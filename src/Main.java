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
    }
}