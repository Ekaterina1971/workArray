import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        int [] apples = new int [3];
        apples [0] = 1;
        apples [1] = 2;
        apples [2] = 3;
        System.out.println(Arrays.toString(apples));
        double [] fraction = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(fraction));
        int [] letters = new int [3];
        letters [0] = 1;
        letters [1] = 17;
        letters [2] = 5;
        System.out.println(Arrays.toString(letters));
        // Задача №2
        System.out.println("Задача №2");
        System.out.print((apples[0]) + ",");
        System.out.print((apples[1]) + ",");
        System.out.print((apples[2]));
        System.out.println();
        System.out.print((fraction[0]) + ",");
        System.out.print((fraction[1]) + ",");
        System.out.print((fraction[2]));
        System.out.println();
        System.out.print((letters[0]) + ",");
        System.out.print((letters[1]) + ",");
        System.out.print((letters[2]));
    }
}