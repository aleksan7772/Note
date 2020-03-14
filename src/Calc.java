import java.util.Scanner;

public class Calc
{
    public static void main(String[] args)
    {
        int a = getnumber();
        int b = getnumber();
        char operation = getOperation();
        calc(a, b, operation);

    }

    //спрашиваем число и возвращаем его
    public static int getnumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        return a;
    }

    //спрашиваем операцию
    public static char getOperation()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию");
        char a = scanner.next().charAt(0);// достает 0 символ из строки
        return a;
    }

    public static void calc(int a, int b, char operation)
    {
        int res = 0;
        switch (operation)
        {
            case '+':
                res = a + b;
                break;

            case '-':
                res = a - b;
                break;

            case '*':
                res = a * b;
                break;

            case '/':
                res = a / b;
                break;

            default:
                System.out.println("Вы ввели неверные данные");

        }
        System.out.println("Результат = " + res);

    }
}

