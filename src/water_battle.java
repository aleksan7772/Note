import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //public - открытйкласс
        //private - закрытый

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        char[] compfield = {'`', '`', '`', '`', '`'}; //поле компа
        char[] userfield = {'`', '`', '`', '`', '`'}; //поле игрока
        int compship = random.nextInt(5);// координаты коробля компа
        System.out.println("Комп создал свой корабыль");
        System.out.println("Поле игрока");
        System.out.println(Arrays.toString(userfield));
        System.out.println("Поставь свой корабыль от 0 до 4");
        int usership = scanner.nextInt();//координата корабля игрока
        if (usership > 0 && usership < 5)
        {
            userfield[usership] = '0';// поставили корабыль

            int compShot, userShot;// координаты выстрелов
            while (true)
            {
                System.out.println("Поле компа");
                System.out.println(Arrays.toString(compfield));
                System.out.println("Стреляй от 0 до 4");
                userShot = scanner.nextInt();// выстрел игрока
                if (userShot == compship)// проверка выстрела игрока
                {
                    compfield[userShot] = 'x';// отметить выстрел игрока
                    System.out.println(Arrays.toString(compfield));// показали поле игрока
                    System.out.println("Победа");
                    break;// прервать цикл
                }
                System.out.println("Мимо");
                compfield[userShot] = '*'; // отметить выстрел
                System.out.println("Поле кома");
                System.out.println(Arrays.toString(compfield));// показали поле игрока
                System.out.println("Выстрел компа");
                do
                {
                    compShot = random.nextInt(5);// выстрел компа
                } while (userfield[compShot] == '8');
                System.out.println(compShot);
                if (compShot == usership)//проверка выстрела
                {
                    userfield[compShot] = 'x'; // отметить выстрел компа
                    System.out.println("мое поле");
                    System.out.println(Arrays.toString(userfield));// показали поле игрока
                    System.out.println("поражение");
                    break;
                }
                System.out.println("Комп промахнулся");
                userfield[compShot] = '8';
                System.out.println(Arrays.toString(userfield));// показали поле игрока

            }
        } else
        {
            System.out.println("здесь нельзя ставить");
        }


    }
}
