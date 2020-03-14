import java.util.Scanner;

public class Switch {
    //Тема Оператор ветвеления switch
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
        switch (number) {
        case 1:
            System.out.println("Пн");
            break;
        case 2:
            System.out.println("вт");
            break;
        case 3:
            System.out.println("ср");
            break;
        case 4:
            System.out.println("чт");
            break;
        case 5:
            System.out.println("пт");
            break;
        case 6:
            System.out.println("сб");
            break;
        case 7:
            System.out.println("вс");
            break;
        default:
            System.out.println("error");
            break;
    }
}
