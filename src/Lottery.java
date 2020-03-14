import java.util.Arrays;
import java.util.Random;

public class Lottery
{
    public static void main(String[] args)
    {
        int[] myTicket = new int[10];
        Random random = new Random();
        for (int i = 0; i < myTicket.length; i++)
        {
            myTicket[i] = random.nextInt(40) + 10;

        }
        System.out.println("мой билет" + Arrays.toString(myTicket));

        int[] winTickets = new int[3];
        for (int i = 0; i < winTickets.length; i++)
        {
            winTickets[i] = random.nextInt(40) + 10;
        }
        System.out.println("Выйграл билет" + Arrays.toString(winTickets));

        int counterWins = 0;// сколько раз мы выйграли
        for (int i = 0; i < myTicket.length; i++)
        {
            for (int j = 0; j < winTickets.length; j++)
            {
                if (myTicket[i] == winTickets[j])
                {
                    counterWins++;
                }

            }
        }
        if (counterWins == 3)
        {
            System.out.println("ты выйграл квартиру");
        }
        else if (counterWins == 2)
        {
            System.out.println("ты выйграл авто");
        }
        else if (counterWins == 1)
        {
            System.out.println("ты выйграл телефон");
        } else
        {
            System.out.println("пробуй еще");
        }
    }
}
