import java.util.Arrays;

public class Main2
{
    public static void main(String[] args)
    {
        //телефонная книга
        String[][] book = new String[3][3];
        book[0][0] = "1";
        book[0][1] = "Sasha";
        book[0][2] = "066967666";

        book[1][0] = "3";
        book[1][1] = "Sasha";
        book[1][2] = "066967666";

        book[2][0] = "2";
        book[2][1] = "Sasha";
        book[2][2] = "066967666";

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {

                System.out.print(book[i][j]+" ");
            }
        }

    }






}

