import java.util.Scanner;

public class If_Else {
    Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
    int numberA = sc.nextInt();

        if (numberA == 1) {
        System.out.println("Понедельник");

    } else if (numberA == 2) {
        System.out.println("Вторник");
    } else if (numberA == 3) {
        System.out.println("Среда");
    } else if (numberA == 4) {
        System.out.println("Четверг");
    } else if (numberA == 5) {
        System.out.println("Пятница");
    } else if (numberA == 6)
            System.out.println("Суббота");

        else if (numberA == 7) {
        System.out.println("Воскресенье");

    } else {
        System.out.println("error");
    }
}
