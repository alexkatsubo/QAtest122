import java.util.Scanner;

public class Tasks {
    public static void Task1(Scanner scanner) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }

    public static void Task2(Scanner scanner) {
        System.out.println("Введите имя: ");
        String word = scanner.next();
        if (word.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
    public static void Task3(){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
                19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 3 == 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
