import java.util.Scanner;

public class Summa_chisel {
    //получить сумму чисел, входящих в number
    //используя while
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int sum = 0;
        while (number > 0) {
        sum += number;
        number--;
    }
        System.out.println(sum);
}
